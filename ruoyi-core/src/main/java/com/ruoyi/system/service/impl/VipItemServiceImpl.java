package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VipItemMapper;
import com.ruoyi.system.domain.VipItem;
import com.ruoyi.system.service.IVipItemService;

/**
 * vip订单管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-13
 */
@Service
public class VipItemServiceImpl implements IVipItemService 
{
    @Autowired
    private VipItemMapper vipItemMapper;

    /**
     * 查询vip订单管理
     * 
     * @param id vip订单管理主键
     * @return vip订单管理
     */
    @Override
    public VipItem selectVipItemById(Long id)
    {
        return vipItemMapper.selectVipItemById(id);
    }

    /**
     * 查询vip订单管理列表
     * 
     * @param vipItem vip订单管理
     * @return vip订单管理
     */
    @Override
    public List<VipItem> selectVipItemList(VipItem vipItem)
    {
        return vipItemMapper.selectVipItemList(vipItem);
    }

    /**
     * 新增vip订单管理
     * 
     * @param vipItem vip订单管理
     * @return 结果
     */
    @Override
    public int insertVipItem(VipItem vipItem)
    {
        return vipItemMapper.insertVipItem(vipItem);
    }

    /**
     * 修改vip订单管理
     * 
     * @param vipItem vip订单管理
     * @return 结果
     */
    @Override
    public int updateVipItem(VipItem vipItem)
    {
        return vipItemMapper.updateVipItem(vipItem);
    }

    /**
     * 批量删除vip订单管理
     * 
     * @param ids 需要删除的vip订单管理主键
     * @return 结果
     */
    @Override
    public int deleteVipItemByIds(Long[] ids)
    {
        return vipItemMapper.deleteVipItemByIds(ids);
    }

    /**
     * 删除vip订单管理信息
     * 
     * @param id vip订单管理主键
     * @return 结果
     */
    @Override
    public int deleteVipItemById(Long id)
    {
        return vipItemMapper.deleteVipItemById(id);
    }
}
