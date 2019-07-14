package com.ruoyi.project.system.yjhsXmgzl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.system.dept.domain.Dept;
import com.ruoyi.project.system.hisMz.domain.HisMz;
import com.ruoyi.project.system.hisZy.domain.HisZy;
import com.ruoyi.project.system.hisZytf.domain.HisZytf;
import com.ruoyi.project.system.ks.domain.Ks;
import com.ruoyi.project.system.yjjx.domin.Yjxm;
import com.ruoyi.project.system.yjxmKssb.domain.YjxmKssb;

/**
 * 医技核算项目工作量表 sys_yjhs_xmgzl
 * 
 * @author panda
 * @date 2019-05-30
 */
public class YjhsXmgzl extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer id;
	/** 日期 */
	private String rq;
	/** 绩效单元id */
	private Integer deptid;
	/** 绩效单元名称 */
	private String deptname;
	/** 执行科室号 */
	private Integer zxks;
	/** 项目编号 */
	private String xmh;
	/** 项目名称 */
	private String xmmc;
	/** 项目价值系数 */
	private Float xmjzxs;
	/** 工作量 */
	private Float gzl;
	private Float dj;
	/** 金额 */
	private Float je;
	/** 项目绩效 */
	private Float xmjx;
	/** 0体检 1门诊 2住院 3住院退费 */
	private String flag;

	private Yjxm yjxm;
	private Dept dept;
	private Ks ks;
	private HisMz hisMz;
	private HisZy hisZy;
	private HisZytf hisZytf;
	private YjxmKssb yjxmKssb; 
	
	
	public HisMz getHisMz() {
		return hisMz;
	}

	public void setHisMz(HisMz hisMz) {
		this.hisMz = hisMz;
	}

	public HisZy getHisZy() {
		return hisZy;
	}

	public void setHisZy(HisZy hisZy) {
		this.hisZy = hisZy;
	}

	public HisZytf getHisZytf() {
		return hisZytf;
	}

	public void setHisZytf(HisZytf hisZytf) {
		this.hisZytf = hisZytf;
	}

	public Yjxm getYjxm() {
		return yjxm;
	}

	public void setYjxm(Yjxm yjxm) {
		this.yjxm = yjxm;
	}

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
	public void setDeptid(Integer deptid) 
	{
		this.deptid = deptid;
	}

	public Integer getDeptid() 
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
	public void setZxks(Integer zxks) 
	{
		this.zxks = zxks;
	}

	public Integer getZxks() 
	{
		return zxks;
	}
	public void setXmh(String xmh) 
	{
		this.xmh = xmh;
	}

	public String getXmh() 
	{
		return xmh;
	}
	public void setXmmc(String xmmc) 
	{
		this.xmmc = xmmc;
	}

	public String getXmmc() 
	{
		return xmmc;
	}
	public void setXmjzxs(Float xmjzxs) 
	{
		this.xmjzxs = xmjzxs;
	}

	public Float getXmjzxs() 
	{
		return xmjzxs;
	}
	public void setGzl(Float gzl) 
	{
		this.gzl = gzl;
	}

	public Float getGzl() 
	{
		return gzl;
	}
	public void setJe(Float je) 
	{
		this.je = je;
	}

	public Float getJe() 
	{
		return je;
	}
	public void setXmjx(Float xmjx) 
	{
		this.xmjx = xmjx;
	}

	public Float getXmjx() 
	{
		return xmjx;
	}
	public void setFlag(String flag) 
	{
		this.flag = flag;
	}

	public String getFlag() 
	{
		return flag;
	}
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Ks getKs() {
		return ks;
	}

	public void setKs(Ks ks) {
		this.ks = ks;
	}

    /**
	 * @return the dj
	 */
	public Float getDj() {
		return dj;
	}

	/**
	 * @param dj the dj to set
	 */
	public void setDj(Float dj) {
		this.dj = dj;
	}

	
	/**
	 * @return the yjxmKssb
	 */
	public YjxmKssb getYjxmKssb() {
		return yjxmKssb;
	}

	/**
	 * @param yjxmKssb the yjxmKssb to set
	 */
	public void setYjxmKssb(YjxmKssb yjxmKssb) {
		this.yjxmKssb = yjxmKssb;
	}

	public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rq", getRq())
            .append("deptid", getDeptid())
            .append("deptname", getDeptname())
            .append("zxks", getZxks())
            .append("xmh", getXmh())
            .append("xmmc", getXmmc())
            .append("xmjzxs", getXmjzxs())
            .append("gzl", getGzl())
            .append("dj", getDj())
            .append("je", getJe())
            .append("xmjx", getXmjx())
            .append("flag", getFlag())
            .append("yjxm", getYjxm())
            .append("dept", getDept())
            .append("ks", getKs())
            .append("hisMz", getHisMz())
            .append("hisZy", getHisZy())
            .append("hisZytf", getHisZytf())
            .append("yjxmKssb", getYjxmKssb())
            .toString();
    }
    
}
