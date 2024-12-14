package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 博客详情表对象 db_blog_detail
 * 
 * @author ruoyi
 * @date 2024-12-14
 */
public class BlogDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 博客ID */
    private Long id;

    /** 博客内容 */
    @Excel(name = "博客内容")
    private String content;

    /** 老师ID */
    @Excel(name = "老师ID")
    private Long teacherId;

    /** 老师推荐的理由 */
    @Excel(name = "老师推荐的理由")
    private String teacherComment;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setTeacherComment(String teacherComment) 
    {
        this.teacherComment = teacherComment;
    }

    public String getTeacherComment() 
    {
        return teacherComment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("content", getContent())
            .append("teacherId", getTeacherId())
            .append("teacherComment", getTeacherComment())
            .toString();
    }
}
