package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * vip订单管理对象 db_vip_item
 * 
 * @author ruoyi
 * @date 2024-12-13
 */
public class VipItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    private Long id;

    /** VIP类型 */
    @Excel(name = "VIP类型")
    private String titile;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitile(String titile) 
    {
        this.titile = titile;
    }

    public String getTitile() 
    {
        return titile;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("titile", getTitile())
            .append("price", getPrice())
            .toString();
    }
}
