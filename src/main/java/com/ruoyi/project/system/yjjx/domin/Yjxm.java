package com.ruoyi.project.system.yjjx.domin;

import org.springframework.stereotype.Component;

import com.ruoyi.project.system.dept.domain.Dept;

/**
 * 医技项目
 * @author LittleDog
 *
 */
@Component
public class Yjxm {

	private Integer id;			//主键
	private String xmid;		//项目编号
	private String xmmc;	//项目名称
	private float xmprice;	//单价
	private float xmjzxs;	//项目价值量
	private String ssks;	//所属科室
	private Dept dept;
	
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getXmid() {
		return xmid;
	}
	public void setXmid(String xmid) {
		this.xmid = xmid;
	}
	public String getXmmc() {
		return xmmc;
	}
	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}
	public float getXmprice() {
		return xmprice;
	}
	public void setXmprice(float xmprice) {
		this.xmprice = xmprice;
	}
	public float getXmjzxs() {
		return xmjzxs;
	}
	public void setXmjzxs(float xmjzxs) {
		this.xmjzxs = xmjzxs;
	}
	public String getSsks() {
		return ssks;
	}
	public void setSsks(String ssks) {
		this.ssks = ssks;
	}
	@Override
	public String toString() {
		return "Yjxm [id=" + id + ", xmid=" + xmid + ", xmmc=" + xmmc + ", xmprice=" + xmprice + ", xmjzxs=" + xmjzxs
				+ ", ssks=" + ssks + ", dept=" + dept + "]";
	}
	
	
	
	
}
