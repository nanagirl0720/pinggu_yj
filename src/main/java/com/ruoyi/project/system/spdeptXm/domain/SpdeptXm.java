package com.ruoyi.project.system.spdeptXm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.system.dept.domain.Dept;

import java.util.Date;

/**
 * 特殊科室操作项目表 sys_spdept_xm
 * 
 * @author panda
 * @date 2018-12-18
 */
public class SpdeptXm extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 特殊科室项目表id */
	@Excel(name = "项目序号")
	private Integer id;
	
	/** 项目编码 */
	@Excel(name = "项目编码")
	private String xmcode;
	
	/** 项目名称 */
	@Excel(name = "项目名称")
	private String xmname;
	
	/** 所属科室 */
	@Excel(name = "所属科室")
	private Integer sxks;
	
	/** 创建时间 */
	private Date createTime;
	
	/** 更新时间 */
	private Date updateTime;
	
	/**部门信息*/
	private Dept dept;

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setXmcode(String xmcode) 
	{
		this.xmcode = xmcode;
	}

	public String getXmcode() 
	{
		return xmcode;
	}
	public void setXmname(String xmname) 
	{
		this.xmname = xmname;
	}

	public String getXmname() 
	{
		return xmname;
	}
	public void setSxks(Integer sxks) 
	{
		this.sxks = sxks;
	}

	public Integer getSxks() 
	{
		return sxks;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xmcode", getXmcode())
            .append("xmname", getXmname())
            .append("sxks", getSxks())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
