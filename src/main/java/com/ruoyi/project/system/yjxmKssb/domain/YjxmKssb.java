package com.ruoyi.project.system.yjxmKssb.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.system.yjjx.domin.Yjxm;

/**
 * 病理体检上报数据表 sys_yjxm_kssb
 * 
 * @author panda
 * @date 2019-05-31
 */
public class YjxmKssb extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 病理体检上报主键 */
	private Integer id;
	/** 日期 */
	private String rq;
	/** 项目号 */
	private String xmid;
	/** 项目名称 */
	private String xmmc;
	/** 项目单价 */
	private Float xmprice;
	/** 数量 */
	private Float sl;
	/** 金额 */
	private Float je;
	/**医技项目*/
	private Yjxm yjxm;
	
	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setRq(String rq) 
	{
		this.rq = rq;
	}

	public String getRq() 
	{
		return rq;
	}
	public void setXmid(String xmid) 
	{
		this.xmid = xmid;
	}

	public String getXmid() 
	{
		return xmid;
	}
	public void setXmmc(String xmmc) 
	{
		this.xmmc = xmmc;
	}

	public String getXmmc() 
	{
		return xmmc;
	}
	public void setXmprice(Float xmprice) 
	{
		this.xmprice = xmprice;
	}

	public Float getXmprice() 
	{
		return xmprice;
	}
	public void setSl(Float sl) 
	{
		this.sl = sl;
	}

	public Float getSl() 
	{
		return sl;
	}
	public void setJe(Float je) 
	{
		this.je = je;
	}

	public Float getJe() 
	{
		return je;
	}

    /**
	 * @return the yjxm
	 */
	public Yjxm getYjxm() {
		return yjxm;
	}

	/**
	 * @param yjxm the yjxm to set
	 */
	public void setYjxm(Yjxm yjxm) {
		this.yjxm = yjxm;
	}

	public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rq", getRq())
            .append("xmh", getXmid())
            .append("xmmc", getXmmc())
            .append("xmprice", getXmprice())
            .append("sl", getSl())
            .append("je", getJe())
            .append("yjxm", getYjxm())
            .toString();
    }
}
