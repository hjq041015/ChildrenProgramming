package com.ruoyi.system.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.domain.CartItem;
import com.ruoyi.system.domain.OrderItem;
import com.ruoyi.system.domain.VipItem;
import com.ruoyi.system.service.ICartItemService;
import com.ruoyi.system.service.IVipItemService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Order;
import com.ruoyi.system.service.IOrderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单列表Controller
 * 
 * @author ruoyi
 * @date 2024-12-11
 */
@RestController
@RequestMapping("/system/order")
public class OrderController extends BaseController
{
    @Autowired
    private IOrderService orderService;

    @Autowired
    private ICartItemService cartItemService;

    @Autowired
    private IVipItemService vipItemService;
    /**
     * 查询订单列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(Order order)
    {
        startPage();
        List<Order> list = orderService.selectOrderList(order);
        return getDataTable(list);
    }

    @GetMapping("/my-list")
    public TableDataInfo myList() {
        startPage();
        List<Order> list = orderService.selectOrderListByUserId(SecurityUtils.getUserId());
        return getDataTable(list);
    }

    /**
     * 导出订单列表列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:export')")
    @Log(title = "订单列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Order order)
    {
        List<Order> list = orderService.selectOrderList(order);
        ExcelUtil<Order> util = new ExcelUtil<Order>(Order.class);
        util.exportExcel(response, list, "订单列表数据");
    }

    /**
     * 获取订单列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:order:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(orderService.selectOrderById(id));
    }

    /**
     * 新增订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:add')")
    @Log(title = "订单列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Order order)
    {
        return toAjax(orderService.insertOrder(order));
    }

    /**
     * 修改订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:edit')")
    @Log(title = "订单列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Order order)
    {
        return toAjax(orderService.updateOrder(order));
    }

    /**
     * 删除订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:remove')")
    @Log(title = "订单列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(orderService.deleteOrderByIds(ids));
    }

    @PostMapping("/create-normal")
    public AjaxResult createNormal(@RequestBody Order order) {
        List<CartItem> items = cartItemService.selectCartItemListByUserId(SecurityUtils.getUserId());
        List<OrderItem> orderItemList = items.stream().map((item) -> {
            OrderItem orderItem = new OrderItem();
            BeanUtils.copyProperties(item, orderItem, "id");
            return orderItem;
        }).toList();
        Long TotalPrice = orderItemList.stream().map((item) -> item.getCount() * item.getPrice().longValue())
                .reduce(Long::sum)
                .orElse(0L);
        order.setUid(SecurityUtils.getUserId());
        order.setOrderItemList(orderItemList);
        order.setPrice(new BigDecimal(TotalPrice));
        order.setTime(new Date());
        int rows = orderService.insertOrder(order);
        if (rows > 0) {
            cartItemService.deleteCartItemByIds(
                    items.stream().map(CartItem::getId).toArray(Long[]::new));
        }
        return toAjax(rows);
    }

    @PostMapping("/create-vip")
    public AjaxResult createVip(@RequestBody Order order,
                                @RequestParam Long id) {
        VipItem vipItem = vipItemService.selectVipItemById(id);
        OrderItem orderItem = new OrderItem();
        BeanUtils.copyProperties(vipItem,orderItem, "id");
        orderItem.setCount(1L);
        order.setTime(new Date());
        order.setPrice(vipItem.getPrice());
        order.setUid(SecurityUtils.getUserId());
        order.setOrderItemList(List.of(orderItem));
        return toAjax(orderService.insertOrder(order));
    }
}
