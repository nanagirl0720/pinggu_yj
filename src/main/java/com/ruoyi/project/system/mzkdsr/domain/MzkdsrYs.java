package com.ruoyi.project.system.mzkdsr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 门诊开单收入数据汇总表 sys_mzkdsr_ys
 * 
 * @author panda
 * @date 2019-01-07
 */
public class MzkdsrYs extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 门诊收入表id */
	private Integer id;
	/** 核算部门 */
	private Integer deptid;
	/** 西药费 */
	private Double xyf;
	/** 中成药 */
	private Double zcyf;
	/** 中草药 */
	private Double zcaoy;
	/** 检查费 */
	private Double jcf;
	/** 治疗费 */
	private Double zlf;
	/** 放射 */
	private Double fs;
	/** 手术费 */
	private Double ssf;
	/** 化验费 */
	private Double hyf;
	/** 其它费 */
	private Double qtf;
	/** 核磁 */
	private Double hc;
	/** 超声费 */
	private Double csf;
	/** 心电图 */
	private Double xdt;
	/** 高压氧 */
	private Double gyy;
	/** 诊疗费 */
	private Double zhenliaof;
	/** 材料费 */
	private Double clf;
	/** CT */
	private Double ct;
	/** 监护费 */
	private Double jhf;
	/** 麻醉费 */
	private Double mzf;
	/** 煎药费 */
	private Double jyf;
	/** 病理 */
	private Double bl;
	/** 理疗费 */
	private Double liliaof;
	/** 救护车 */
	private Double jhc;
	/** 针灸 */
	private Double zj;
	/** 氧气 */
	private Double yq;
	/** 输血 */
	private Double sx;
	/** 抢救费 */
	private Double qjf;
	/** 血透费 */
	private Double xtf;
	/** 内窥镜 */
	private Double nkj;
	/** 人工器官 */
	private Double rgqg;
	/** 运动平板 */
	private Double ydpb;
	/** 血气分析 */
	private Double xqfx;
	/** TCD */
	private Double tcd;
	/** 眼科AB超 */
	private Double ykabchao;
	/** 内分泌化验 */
	private Double nfmhy;
	/** 动态心电图 */
	private Double dtxdy;
	/** 动态血压 */
	private Double dtxy;
	/** 碎石费 */
	private Double suishif;
	/** 本科化验 */
	private Double bkhy;
	/** 呼吸医技 */
	private Double hxyj;
	/** 病理(TCT) */
	private Double bltct;
	/** 放射材料 */
	private Double fscl;
	/** 皮科检查 */
	private Double pkjc;
	/** 骨密度检查 */
	private Double gmdjc;
	/** 眼底照相 */
	private Double ydzx;
	/** 本科检查 */
	private Double bkjc;
	/** HPV检查 */
	private Double hpvjc;
	/** 脉冲磁疗 */
	private Double mccl;
	/** 医事服务费 */
	private Double ysfwf;
	/** 推拿 */
	private Double tn;
	/** 口腔放射 */
	private Double kqfs;
	/** 核算日期 */
	private String tjdata;

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
	public void setXyf(Double xyf) 
	{
		this.xyf = xyf;
	}

	public Double getXyf() 
	{
		return xyf;
	}
	public void setZcyf(Double zcyf) 
	{
		this.zcyf = zcyf;
	}

	public Double getZcyf() 
	{
		return zcyf;
	}
	public void setZcaoy(Double zcaoy) 
	{
		this.zcaoy = zcaoy;
	}

	public Double getZcaoy() 
	{
		return zcaoy;
	}
	public void setJcf(Double jcf) 
	{
		this.jcf = jcf;
	}

	public Double getJcf() 
	{
		return jcf;
	}
	public void setZlf(Double zlf) 
	{
		this.zlf = zlf;
	}

	public Double getZlf() 
	{
		return zlf;
	}
	public void setFs(Double fs) 
	{
		this.fs = fs;
	}

	public Double getFs() 
	{
		return fs;
	}
	public void setSsf(Double ssf) 
	{
		this.ssf = ssf;
	}

	public Double getSsf() 
	{
		return ssf;
	}
	public void setHyf(Double hyf) 
	{
		this.hyf = hyf;
	}

	public Double getHyf() 
	{
		return hyf;
	}
	public void setQtf(Double qtf) 
	{
		this.qtf = qtf;
	}

	public Double getQtf() 
	{
		return qtf;
	}
	public void setHc(Double hc) 
	{
		this.hc = hc;
	}

	public Double getHc() 
	{
		return hc;
	}
	public void setCsf(Double csf) 
	{
		this.csf = csf;
	}

	public Double getCsf() 
	{
		return csf;
	}
	public void setXdt(Double xdt) 
	{
		this.xdt = xdt;
	}

	public Double getXdt() 
	{
		return xdt;
	}
	public void setGyy(Double gyy) 
	{
		this.gyy = gyy;
	}

	public Double getGyy() 
	{
		return gyy;
	}
	public void setZhenliaof(Double zhenliaof) 
	{
		this.zhenliaof = zhenliaof;
	}

	public Double getZhenliaof() 
	{
		return zhenliaof;
	}
	public void setClf(Double clf) 
	{
		this.clf = clf;
	}

	public Double getClf() 
	{
		return clf;
	}
	public void setCt(Double ct) 
	{
		this.ct = ct;
	}

	public Double getCt() 
	{
		return ct;
	}
	public void setJhf(Double jhf) 
	{
		this.jhf = jhf;
	}

	public Double getJhf() 
	{
		return jhf;
	}
	public void setMzf(Double mzf) 
	{
		this.mzf = mzf;
	}

	public Double getMzf() 
	{
		return mzf;
	}
	public void setJyf(Double jyf) 
	{
		this.jyf = jyf;
	}

	public Double getJyf() 
	{
		return jyf;
	}
	public void setBl(Double bl) 
	{
		this.bl = bl;
	}

	public Double getBl() 
	{
		return bl;
	}
	public void setLiliaof(Double liliaof) 
	{
		this.liliaof = liliaof;
	}

	public Double getLiliaof() 
	{
		return liliaof;
	}
	public void setJhc(Double jhc) 
	{
		this.jhc = jhc;
	}

	public Double getJhc() 
	{
		return jhc;
	}
	public void setZj(Double zj) 
	{
		this.zj = zj;
	}

	public Double getZj() 
	{
		return zj;
	}
	public void setYq(Double yq) 
	{
		this.yq = yq;
	}

	public Double getYq() 
	{
		return yq;
	}
	public void setSx(Double sx) 
	{
		this.sx = sx;
	}

	public Double getSx() 
	{
		return sx;
	}
	public void setQjf(Double qjf) 
	{
		this.qjf = qjf;
	}

	public Double getQjf() 
	{
		return qjf;
	}
	public void setXtf(Double xtf) 
	{
		this.xtf = xtf;
	}

	public Double getXtf() 
	{
		return xtf;
	}
	public void setNkj(Double nkj) 
	{
		this.nkj = nkj;
	}

	public Double getNkj() 
	{
		return nkj;
	}
	public void setRgqg(Double rgqg) 
	{
		this.rgqg = rgqg;
	}

	public Double getRgqg() 
	{
		return rgqg;
	}
	public void setYdpb(Double ydpb) 
	{
		this.ydpb = ydpb;
	}

	public Double getYdpb() 
	{
		return ydpb;
	}
	public void setXqfx(Double xqfx) 
	{
		this.xqfx = xqfx;
	}

	public Double getXqfx() 
	{
		return xqfx;
	}
	public void setTcd(Double tcd) 
	{
		this.tcd = tcd;
	}

	public Double getTcd() 
	{
		return tcd;
	}
	public void setYkabchao(Double ykabchao) 
	{
		this.ykabchao = ykabchao;
	}

	public Double getYkabchao() 
	{
		return ykabchao;
	}
	public void setNfmhy(Double nfmhy) 
	{
		this.nfmhy = nfmhy;
	}

	public Double getNfmhy() 
	{
		return nfmhy;
	}
	public void setDtxdy(Double dtxdy) 
	{
		this.dtxdy = dtxdy;
	}

	public Double getDtxdy() 
	{
		return dtxdy;
	}
	public void setDtxy(Double dtxy) 
	{
		this.dtxy = dtxy;
	}

	public Double getDtxy() 
	{
		return dtxy;
	}
	public void setSuishif(Double suishif) 
	{
		this.suishif = suishif;
	}

	public Double getSuishif() 
	{
		return suishif;
	}
	public void setBkhy(Double bkhy) 
	{
		this.bkhy = bkhy;
	}

	public Double getBkhy() 
	{
		return bkhy;
	}
	public void setHxyj(Double hxyj) 
	{
		this.hxyj = hxyj;
	}

	public Double getHxyj() 
	{
		return hxyj;
	}
	public void setBltct(Double bltct) 
	{
		this.bltct = bltct;
	}

	public Double getBltct() 
	{
		return bltct;
	}
	public void setFscl(Double fscl) 
	{
		this.fscl = fscl;
	}

	public Double getFscl() 
	{
		return fscl;
	}
	public void setPkjc(Double pkjc) 
	{
		this.pkjc = pkjc;
	}

	public Double getPkjc() 
	{
		return pkjc;
	}
	public void setGmdjc(Double gmdjc) 
	{
		this.gmdjc = gmdjc;
	}

	public Double getGmdjc() 
	{
		return gmdjc;
	}
	public void setYdzx(Double ydzx) 
	{
		this.ydzx = ydzx;
	}

	public Double getYdzx() 
	{
		return ydzx;
	}
	public void setBkjc(Double bkjc) 
	{
		this.bkjc = bkjc;
	}

	public Double getBkjc() 
	{
		return bkjc;
	}
	public void setHpvjc(Double hpvjc) 
	{
		this.hpvjc = hpvjc;
	}

	public Double getHpvjc() 
	{
		return hpvjc;
	}
	public void setMccl(Double mccl) 
	{
		this.mccl = mccl;
	}

	public Double getMccl() 
	{
		return mccl;
	}
	public void setYsfwf(Double ysfwf) 
	{
		this.ysfwf = ysfwf;
	}

	public Double getYsfwf() 
	{
		return ysfwf;
	}
	public void setTn(Double tn) 
	{
		this.tn = tn;
	}

	public Double getTn() 
	{
		return tn;
	}
	public void setKqfs(Double kqfs) 
	{
		this.kqfs = kqfs;
	}

	public Double getKqfs() 
	{
		return kqfs;
	}
	public void setTjdata(String tjdata) 
	{
		this.tjdata = tjdata;
	}

	public String getTjdata() 
	{
		return tjdata;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deptid", getDeptid())
            .append("xyf", getXyf())
            .append("zcyf", getZcyf())
            .append("zcaoy", getZcaoy())
            .append("jcf", getJcf())
            .append("zlf", getZlf())
            .append("fs", getFs())
            .append("ssf", getSsf())
            .append("hyf", getHyf())
            .append("qtf", getQtf())
            .append("hc", getHc())
            .append("csf", getCsf())
            .append("xdt", getXdt())
            .append("gyy", getGyy())
            .append("zhenliaof", getZhenliaof())
            .append("clf", getClf())
            .append("ct", getCt())
            .append("jhf", getJhf())
            .append("mzf", getMzf())
            .append("jyf", getJyf())
            .append("bl", getBl())
            .append("liliaof", getLiliaof())
            .append("jhc", getJhc())
            .append("zj", getZj())
            .append("yq", getYq())
            .append("sx", getSx())
            .append("qjf", getQjf())
            .append("xtf", getXtf())
            .append("nkj", getNkj())
            .append("rgqg", getRgqg())
            .append("ydpb", getYdpb())
            .append("xqfx", getXqfx())
            .append("tcd", getTcd())
            .append("ykabchao", getYkabchao())
            .append("nfmhy", getNfmhy())
            .append("dtxdy", getDtxdy())
            .append("dtxy", getDtxy())
            .append("suishif", getSuishif())
            .append("bkhy", getBkhy())
            .append("hxyj", getHxyj())
            .append("bltct", getBltct())
            .append("fscl", getFscl())
            .append("pkjc", getPkjc())
            .append("gmdjc", getGmdjc())
            .append("ydzx", getYdzx())
            .append("bkjc", getBkjc())
            .append("hpvjc", getHpvjc())
            .append("mccl", getMccl())
            .append("ysfwf", getYsfwf())
            .append("tn", getTn())
            .append("kqfs", getKqfs())
            .append("tjdata", getTjdata())
            .toString();
    }
}
