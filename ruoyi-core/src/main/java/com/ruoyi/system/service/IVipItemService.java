package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.VipItem;

/**
 * vip订单管理Service接口
 * 
 * @author ruoyi
 * @date 2024-12-13
 */
public interface IVipItemService 
{
    /**
     * 查询vip订单管理
     * 
     * @param id vip订单管理主键
     * @return vip订单管理
     */
    public VipItem selectVipItemById(Long id);

    /**
     * 查询vip订单管理列表
     * 
     * @param vipItem vip订单管理
     * @return vip订单管理集合
     */
    public List<VipItem> selectVipItemList(VipItem vipItem);

    /**
     * 新增vip订单管理
     * 
     * @param vipItem vip订单管理
     * @return 结果
     */
    public int insertVipItem(VipItem vipItem);

    /**
     * 修改vip订单管理
     * 
     * @param vipItem vip订单管理
     * @return 结果
     */
    public int updateVipItem(VipItem vipItem);

    /**
     * 批量删除vip订单管理
     * 
     * @param ids 需要删除的vip订单管理主键集合
     * @return 结果
     */
    public int deleteVipItemByIds(Long[] ids);

    /**
     * 删除vip订单管理信息
     * 
     * @param id vip订单管理主键
     * @return 结果
     */
    public int deleteVipItemById(Long id);
}
