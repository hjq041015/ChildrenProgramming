package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CartItemMapper;
import com.ruoyi.system.domain.CartItem;
import com.ruoyi.system.service.ICartItemService;

/**
 * 商品购物车Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-10
 */
@Service
public class CartItemServiceImpl implements ICartItemService 
{
    @Autowired
    private CartItemMapper cartItemMapper;

    /**
     * 查询商品购物车
     * 
     * @param id 商品购物车主键
     * @return 商品购物车
     */
    @Override
    public CartItem selectCartItemById(Long id)
    {
        return cartItemMapper.selectCartItemById(id);
    }

    /**
     * 查询商品购物车列表
     * 
     * @param cartItem 商品购物车
     * @return 商品购物车
     */
    @Override
    public List<CartItem> selectCartItemList(CartItem cartItem)
    {
        return cartItemMapper.selectCartItemList(cartItem);
    }

    /**
     * 新增商品购物车
     * 
     * @param cartItem 商品购物车
     * @return 结果
     */
    @Override
    public int insertCartItem(CartItem cartItem)
    {
        return cartItemMapper.insertCartItem(cartItem);
    }

    /**
     * 修改商品购物车
     * 
     * @param cartItem 商品购物车
     * @return 结果
     */
    @Override
    public int updateCartItem(CartItem cartItem)
    {
        return cartItemMapper.updateCartItem(cartItem);
    }

    /**
     * 批量删除商品购物车
     * 
     * @param ids 需要删除的商品购物车主键
     * @return 结果
     */
    @Override
    public int deleteCartItemByIds(Long[] ids)
    {
        return cartItemMapper.deleteCartItemByIds(ids);
    }

    /**
     * 删除商品购物车信息
     * 
     * @param id 商品购物车主键
     * @return 结果
     */
    @Override
    public int deleteCartItemById(Long id)
    {
        return cartItemMapper.deleteCartItemById(id);
    }

    @Override
    public CartItem selectCartItem(Integer courseId, Long userId) {
        return cartItemMapper.selectCartItem(courseId,userId);
    }

    @Override
    public long selectCartItemCount(Long userId) {
        List<CartItem> items = cartItemMapper.selectCartItemListById(userId);
        Optional<Long> reduce = items.stream().map((CartItem::getCount)).reduce(Long::sum);
        return reduce.orElse(0L);

    }

    @Override
    public List<CartItem> selectCartItemListByUserId(Long userId) {
        return cartItemMapper.selectCartItemListById(userId);
    }

    @Override
    public int deleteCartItemByIdAndUser(Long id, Long userId) {
        return cartItemMapper.deleteCartItemByIdAndUseId(id,userId);
    }

    @Override
    public CartItem selectCartItemByIdAndUser(Long id, Long userId) {
        return cartItemMapper.selectCartItemByIdAndUser(id,userId);
    }
}
