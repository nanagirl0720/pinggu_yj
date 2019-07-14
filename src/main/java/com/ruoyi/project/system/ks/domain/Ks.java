package com.ruoyi.project.system.ks.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.system.dept.domain.Dept;

/**
 * 科室字典表 sys_ks
 * 
 * @author panda
 * @date 2019-05-30
 */
public class Ks extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer id;
	/** 科室id */
	private String ksid;
	/** 科室名称 */
	private String ksname;
	/** 绩效单元ID */
	private Integer jxdyid;
	
	private Dept dept;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setKsid(String ksid) 
	{
		this.ksid = ksid;
	}

	public String getKsid() 
	{
		return ksid;
	}
	public void setKsname(String ksname) 
	{
		this.ksname = ksname;
	}

	public String getKsname() 
	{
		return ksname;
	}
	public void setJxdyid(Integer jxdyid) 
	{
		this.jxdyid = jxdyid;
	}

	public Integer getJxdyid() 
	{
		return jxdyid;
	}

    public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("ksid", getKsid())
            .append("ksname", getKsname())
            .append("jxdyid", getJxdyid())
            .append("dept", getDept())
            
            .toString();
    }
}
