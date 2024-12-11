package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CartItem;

/**
 * 商品购物车Mapper接口
 * 
 * @author ruoyi
 * @date 2024-12-10
 */
public interface CartItemMapper 
{
    /**
     * 查询商品购物车
     * 
     * @param id 商品购物车主键
     * @return 商品购物车
     */
    public CartItem selectCartItemById(Long id);

    /**
     * 查询购物车物品
     * @param courseId 课程Id
     * @param userId   用户Id
     * @return 结果
     */
     CartItem selectCartItem(Integer courseId, long userId);

    /**
     * 根据用户ID查询购物车数量
     * @param userId 用户Id
     * @return 购物车数量
     */
    List<CartItem> selectCartItemListById(long userId);


    /**
     * 查询商品购物车列表
     * 
     * @param cartItem 商品购物车
     * @return 商品购物车集合
     */
    public List<CartItem> selectCartItemList(CartItem cartItem);

    /**
     * 新增商品购物车
     * 
     * @param cartItem 商品购物车
     * @return 结果
     */
    public int insertCartItem(CartItem cartItem);

    /**
     * 修改商品购物车
     * 
     * @param cartItem 商品购物车
     * @return 结果
     */
    public int updateCartItem(CartItem cartItem);

    /**
     * 删除商品购物车
     * 
     * @param id 商品购物车主键
     * @return 结果
     */
    public int deleteCartItemById(Long id);

    /**
     * 批量删除商品购物车
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCartItemByIds(Long[] ids);

    public int deleteCartItemByIdAndUseId(long id, long userId);

    /**
     * 根据用户ID找到对应的购物车
     * @param id 购物车ID
     * @param userId 用户Id
     * @return 结果
     */
    CartItem selectCartItemByIdAndUser(Long id, Long userId);


}


