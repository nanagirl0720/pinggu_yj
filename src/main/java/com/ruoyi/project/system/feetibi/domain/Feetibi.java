package com.ruoyi.project.system.feetibi.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.system.dept.domain.Dept;
import com.ruoyi.project.system.feetype.domain.Feetype;

import java.util.Date;

/**
 * 收入提比表 sys_feetibi
 * 
 * @author panda
 * @date 2018-12-19
 */
public class Feetibi extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 费用提纯比率表id */
	private Integer id;
	/** 科室 */
	private Integer deptid;
	/** 费用类别 */
	private Integer feeid;
	/** 提纯比例 */
	private Double tibi;
	/** 数据来源 */
	private Integer flag;
	/** 创建时间 */
	private Date createtime;
	/** 修改时间 */
	private Date updatetime;
	/**费用类别*/
    private Feetype feetype;
    /**科室*/
    private Dept dept;
    
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Feetype getFeetype() {
		return feetype;
	}

	public void setFeetype(Feetype feetype) {
		this.feetype = feetype;
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
	public void setDeptid(Integer deptid) 
	{
		this.deptid = deptid;
	}

	public Integer getDeptid() 
	{
		return deptid;
	}
	public void setFeeid(Integer feeid) 
	{
		this.feeid = feeid;
	}

	public Integer getFeeid() 
	{
		return feeid;
	}
	public void setTibi(Double tibi) 
	{
		this.tibi = tibi;
	}

	public Double getTibi() 
	{
		return tibi;
	}
	public void setFlag(Integer flag) 
	{
		this.flag = flag;
	}

	public Integer getFlag() 
	{
		return flag;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deptid", getDeptid())
            .append("feeid", getFeeid())
            .append("tibi", getTibi())
            .append("flag", getFlag())
            .append("createtime", getCreateTime())
            .append("updatetime", getUpdateTime())
            .toString();
    }
}
