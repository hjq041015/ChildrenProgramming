package com.ruoyi.system.controller;

import java.math.BigDecimal;
import java.util.List;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.domain.Course;
import com.ruoyi.system.service.ICourseService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.CartItem;
import com.ruoyi.system.service.ICartItemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品购物车Controller
 * 
 * @author ruoyi
 * @date 2024-12-10
 */
@RestController
@RequestMapping("/system/item")
public class CartItemController extends BaseController
{
    @Autowired
    private ICartItemService cartItemService;

    @Autowired
    private ICourseService iCourseService;
    /**
     * 查询商品购物车列表
     */
    @PreAuthorize("@ss.hasPermi('system:item:list')")
    @GetMapping("/list")
    public TableDataInfo list(CartItem cartItem)
    {
        startPage();
        List<CartItem> list = cartItemService.selectCartItemList(cartItem);
        return getDataTable(list);
    }

    /**
     * 导出商品购物车列表
     */
    @PreAuthorize("@ss.hasPermi('system:item:export')")
    @Log(title = "商品购物车", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CartItem cartItem)
    {
        List<CartItem> list = cartItemService.selectCartItemList(cartItem);
        ExcelUtil<CartItem> util = new ExcelUtil<CartItem>(CartItem.class);
        util.exportExcel(response, list, "商品购物车数据");
    }

    /**
     * 获取商品购物车详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:item:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(cartItemService.selectCartItemById(id));
    }

    /**
     * 新增商品购物车
     */
    @PreAuthorize("@ss.hasPermi('system:item:add')")
    @Log(title = "商品购物车", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CartItem cartItem)
    {
        return toAjax(cartItemService.insertCartItem(cartItem));
    }

    /**
     * 修改商品购物车
     */
    @PreAuthorize("@ss.hasPermi('system:item:edit')")
    @Log(title = "商品购物车", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CartItem cartItem)
    {
        return toAjax(cartItemService.updateCartItem(cartItem));
    }

    /**
     * 删除商品购物车
     */
    @PreAuthorize("@ss.hasPermi('system:item:remove')")
    @Log(title = "商品购物车", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(cartItemService.deleteCartItemByIds(ids));
    }

    /**
     * 普通用户添加购物车
     */
    @PostMapping("/add/{courseId}")
    public AjaxResult addByUser(@PathVariable Integer courseId) {
        Course course = iCourseService.selectCourseById(courseId);
        if (course == null) return toAjax(false);
        Long userId = SecurityUtils.getUserId();
        CartItem item = cartItemService.selectCartItem(courseId, userId);
        if (item == null) {
            item = new CartItem();
            item.setUid(SecurityUtils.getUserId());
            item.setPrice(new BigDecimal(course.getPrice()));
            item.setTitle(course.getTitle());
            item.setCourseId(courseId.longValue());
            item.setCount(1L);
            cartItemService.insertCartItem(item);
        }else {
            item.setCount(item.getCount() + 1L);
            cartItemService.updateCartItem(item);
        }
        return toAjax(true);
    }

    @GetMapping("/count")
    public AjaxResult countItem() {
        return AjaxResult.success(cartItemService.selectCartItemListById(SecurityUtils.getUserId()));
    }

    @GetMapping("/my-list")
    public AjaxResult myList() {
        return AjaxResult.success(cartItemService.selectCartItemListByUserId(SecurityUtils.getUserId()));
    }

    @DeleteMapping("/delete/{id}")
    public AjaxResult deleteItem(@PathVariable Long id) {
        return AjaxResult.success(cartItemService.deleteCartItemByIdAndUser(id,SecurityUtils
                .getUserId()));
    }

    @PutMapping("/increase/{id}")
    public AjaxResult increaseItem(@PathVariable Long id) {
        CartItem cartItem = cartItemService.selectCartItemByIdAndUser(id, SecurityUtils.getUserId());
        cartItem.setCount(cartItem.getCount() + 1);
        return toAjax(cartItemService.updateCartItem(cartItem));
    }

    @PutMapping("/decrease/{id}")
    public AjaxResult decreaseItem(@PathVariable Long id) {
        CartItem cartItem = cartItemService.selectCartItemByIdAndUser(id, SecurityUtils.getUserId());
        Long count = cartItem.getCount();
        if (count <= 1) {
            return toAjax(cartItemService.deleteCartItemByIdAndUser(id,SecurityUtils.getUserId()));
        }else {
            cartItem.setCount(count - 1);
            return toAjax(cartItemService.updateCartItem(cartItem));
        }
    }
}

