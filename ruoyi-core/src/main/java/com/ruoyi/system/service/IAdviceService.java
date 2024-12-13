package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Advice;

/**
 * 建议表Service接口
 * 
 * @author ruoyi
 * @date 2024-12-13
 */
public interface IAdviceService 
{
    /**
     * 查询建议表
     * 
     * @param id 建议表主键
     * @return 建议表
     */
    public Advice selectAdviceById(Long id);


     public Advice selectAdviceByAddress(String ip);
    /**
     * 查询建议表列表
     * 
     * @param advice 建议表
     * @return 建议表集合
     */
    public List<Advice> selectAdviceList(Advice advice);

    /**
     * 新增建议表
     * 
     * @param advice 建议表
     * @return 结果
     */
    public int insertAdvice(Advice advice);

    /**
     * 修改建议表
     * 
     * @param advice 建议表
     * @return 结果
     */
    public int updateAdvice(Advice advice);

    /**
     * 批量删除建议表
     * 
     * @param ids 需要删除的建议表主键集合
     * @return 结果
     */
    public int deleteAdviceByIds(Long[] ids);

    /**
     * 删除建议表信息
     * 
     * @param id 建议表主键
     * @return 结果
     */
    public int deleteAdviceById(Long id);
}
