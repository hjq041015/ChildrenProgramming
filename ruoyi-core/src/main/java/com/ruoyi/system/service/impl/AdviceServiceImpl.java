package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AdviceMapper;
import com.ruoyi.system.domain.Advice;
import com.ruoyi.system.service.IAdviceService;

/**
 * 建议表Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-13
 */
@Service
public class AdviceServiceImpl implements IAdviceService 
{
    @Autowired
    private AdviceMapper adviceMapper;

    /**
     * 查询建议表
     * 
     * @param id 建议表主键
     * @return 建议表
     */
    @Override
    public Advice selectAdviceById(Long id)
    {
        return adviceMapper.selectAdviceById(id);
    }

    @Override
    public Advice selectAdviceByAddress(String ip) {
      return   adviceMapper.selectAdviceByAddress(ip);
    }


    /**
     * 查询建议表列表
     * 
     * @param advice 建议表
     * @return 建议表
     */
    @Override
    public List<Advice> selectAdviceList(Advice advice)
    {
        return adviceMapper.selectAdviceList(advice);
    }

    /**
     * 新增建议表
     * 
     * @param advice 建议表
     * @return 结果
     */
    @Override
    public int insertAdvice(Advice advice)
    {
        return adviceMapper.insertAdvice(advice);
    }

    /**
     * 修改建议表
     * 
     * @param advice 建议表
     * @return 结果
     */
    @Override
    public int updateAdvice(Advice advice)
    {
        return adviceMapper.updateAdvice(advice);
    }

    /**
     * 批量删除建议表
     * 
     * @param ids 需要删除的建议表主键
     * @return 结果
     */
    @Override
    public int deleteAdviceByIds(Long[] ids)
    {
        return adviceMapper.deleteAdviceByIds(ids);
    }

    /**
     * 删除建议表信息
     * 
     * @param id 建议表主键
     * @return 结果
     */
    @Override
    public int deleteAdviceById(Long id)
    {
        return adviceMapper.deleteAdviceById(id);
    }
}
