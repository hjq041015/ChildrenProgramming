package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BlogDetail;

/**
 * 博客详情表Service接口
 * 
 * @author ruoyi
 * @date 2024-12-14
 */
public interface IBlogDetailService 
{
    /**
     * 查询博客详情表
     * 
     * @param id 博客详情表主键
     * @return 博客详情表
     */
    public BlogDetail selectBlogDetailById(Long id);

    /**
     * 查询博客详情表列表
     * 
     * @param blogDetail 博客详情表
     * @return 博客详情表集合
     */
    public List<BlogDetail> selectBlogDetailList(BlogDetail blogDetail);

    /**
     * 新增博客详情表
     * 
     * @param blogDetail 博客详情表
     * @return 结果
     */
    public int insertBlogDetail(BlogDetail blogDetail);

    /**
     * 修改博客详情表
     * 
     * @param blogDetail 博客详情表
     * @return 结果
     */
    public int updateBlogDetail(BlogDetail blogDetail);

    /**
     * 批量删除博客详情表
     * 
     * @param ids 需要删除的博客详情表主键集合
     * @return 结果
     */
    public int deleteBlogDetailByIds(Long[] ids);

    /**
     * 删除博客详情表信息
     * 
     * @param id 博客详情表主键
     * @return 结果
     */
    public int deleteBlogDetailById(Long id);
}
