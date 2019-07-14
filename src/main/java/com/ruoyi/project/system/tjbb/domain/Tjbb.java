package com.ruoyi.project.system.tjbb.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 体检报表 sys_tjbb
 * 
 * @author panda
 * @date 2019-06-10
 */
public class Tjbb extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 体检系统id */
	private Integer id;
	/** 报表日期 */
	private String rq;
	/** 执行科室id */
	private String zxksid;
	/** 项目id */
	private String xmid;
	/** 项目名称 */
	private String xmmc;
	/** 项目工作量 */
	private Float xmgzl;
	/** 项目金额 */
	private Float zje;

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
	public void setZxksid(String zxksid) 
	{
		this.zxksid = zxksid;
	}

	public String getZxksid() 
	{
		return zxksid;
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
	public void setXmgzl(Float xmgzl) 
	{
		this.xmgzl = xmgzl;
	}

	public Float getXmgzl() 
	{
		return xmgzl;
	}
	public void setZje(Float zje) 
	{
		this.zje = zje;
	}

	public Float getZje() 
	{
		return zje;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rq", getRq())
            .append("zxksid", getZxksid())
            .append("xmid", getXmid())
            .append("xmmc", getXmmc())
            .append("xmgzl", getXmgzl())
            .append("zje", getZje())
            .toString();
    }
}
