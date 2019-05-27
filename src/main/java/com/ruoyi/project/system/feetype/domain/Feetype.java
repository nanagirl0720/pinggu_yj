package com.ruoyi.project.system.feetype.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.system.dict.domain.DictData;

import java.util.Date;

/**
 * 费用类别表 sys_feetype
 * 
 * @author panda
 * @date 2018-12-18
 */
public class Feetype extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 费用类别表id */
	@Excel(name="费用类别序号")
	private Integer id;
	
	/** 费用类别编码 */
	@Excel(name="费用类别编码")
	private String feecode;
	
	/** 费用类别名称 */
	@Excel(name="费用类别名称")
	private String feename;
	
	/** 数据来源 */
	@Excel(name="数据来源")
	private Integer datatype;
	
	/** 创建时间 */
	private Date createtime;
	/** 修改时间 */
	private Date updatetime;
	/** 数据来源*/
	private DictData dictdata;
	
	public DictData getDictdata() {
		return dictdata;
	}

	public void setDictdata(DictData dictdata) {
		this.dictdata = dictdata;
	}

	public Integer getDatatype() {
		return datatype;
	}

	public void setDatatype(Integer datatype) {
		this.datatype = datatype;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setFeecode(String feecode) 
	{
		this.feecode = feecode;
	}

	public String getFeecode() 
	{
		return feecode;
	}
	public void setFeename(String feename) 
	{
		this.feename = feename;
	}

	public String getFeename() 
	{
		return feename;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("feecode", getFeecode())
            .append("feename", getFeename())
            .append("createtime", getCreatetime())
            .append("updatetime", getUpdatetime())
            .toString();
    }
}
