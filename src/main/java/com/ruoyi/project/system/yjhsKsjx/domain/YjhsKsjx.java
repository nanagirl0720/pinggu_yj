package com.ruoyi.project.system.yjhsKsjx.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 医技核算绩效表 sys_yjhs_ksjx
 * 
 * @author panda
 * @date 2019-05-30
 */
public class YjhsKsjx extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer id;
	/** 日期 */
	private String rq;
	/** 绩效单元id */
	private String deptid;
	/** 绩效单元名称 */
	private String deptname;
	/** 医技绩效 */
	private Float jx;

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
	public void setDeptid(String deptid) 
	{
		this.deptid = deptid;
	}

	public String getDeptid() 
	{
		return deptid;
	}
	public void setDeptname(String deptname) 
	{
		this.deptname = deptname;
	}

	public String getDeptname() 
	{
		return deptname;
	}
	public void setJx(Float jx) 
	{
		this.jx = jx;
	}

	public Float getJx() 
	{
		return jx;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rq", getRq())
            .append("deptid", getDeptid())
            .append("deptname", getDeptname())
            .append("jx", getJx())
            .toString();
    }
}
