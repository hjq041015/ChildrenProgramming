package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BlogDetailMapper;
import com.ruoyi.system.domain.BlogDetail;
import com.ruoyi.system.service.IBlogDetailService;

/**
 * 博客详情表Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-12-14
 */
@Service
public class BlogDetailServiceImpl implements IBlogDetailService 
{
    @Autowired
    private BlogDetailMapper blogDetailMapper;

    /**
     * 查询博客详情表
     * 
     * @param id 博客详情表主键
     * @return 博客详情表
     */
    @Override
    public BlogDetail selectBlogDetailById(Long id)
    {
        return blogDetailMapper.selectBlogDetailById(id);
    }

    /**
     * 查询博客详情表列表
     * 
     * @param blogDetail 博客详情表
     * @return 博客详情表
     */
    @Override
    public List<BlogDetail> selectBlogDetailList(BlogDetail blogDetail)
    {
        return blogDetailMapper.selectBlogDetailList(blogDetail);
    }

    /**
     * 新增博客详情表
     * 
     * @param blogDetail 博客详情表
     * @return 结果
     */
    @Override
    public int insertBlogDetail(BlogDetail blogDetail)
    {
        return blogDetailMapper.insertBlogDetail(blogDetail);
    }

    /**
     * 修改博客详情表
     * 
     * @param blogDetail 博客详情表
     * @return 结果
     */
    @Override
    public int updateBlogDetail(BlogDetail blogDetail)
    {
        return blogDetailMapper.updateBlogDetail(blogDetail);
    }

    /**
     * 批量删除博客详情表
     * 
     * @param ids 需要删除的博客详情表主键
     * @return 结果
     */
    @Override
    public int deleteBlogDetailByIds(Long[] ids)
    {
        return blogDetailMapper.deleteBlogDetailByIds(ids);
    }

    /**
     * 删除博客详情表信息
     * 
     * @param id 博客详情表主键
     * @return 结果
     */
    @Override
    public int deleteBlogDetailById(Long id)
    {
        return blogDetailMapper.deleteBlogDetailById(id);
    }
}
