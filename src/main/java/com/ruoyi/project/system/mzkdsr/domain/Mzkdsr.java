package com.ruoyi.project.system.mzkdsr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 门诊开单收入数据表 sys_mzkdsr
 * 
 * @author panda
 * @date 2018-12-25
 */
public class Mzkdsr extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 门诊收入表id */
	@Excel(name = "序号")
	private Integer id;
	
	/** 开单科室 */
	@Excel(name = "开单科室")
	private String kdks;
	
	/** 住院归属科室 */
	@Excel(name = "住院归属科室")
	private String zygsks;
	
	/** 人次 */
	@Excel(name = "人次")
	private Integer rc;
	
	/** 挂号费 */
	@Excel(name = "挂号费")
	private Double guf;
	
	/** 西药费 */
	@Excel(name = "西药费")
	private Double xyf;
	
	/** 中成药 */
	@Excel(name = "中成药")
	private Double zcyf;
	
	/** 中草药 */
	@Excel(name = "中草药")
	private Double zcaoy;
	
	/** 检查费 */
	@Excel(name = "检查费")
	private Double jcf;
	
	/** 治疗费 */
	@Excel(name = "治疗费")
	private Double zlf;
	
	/** 放射 */
	@Excel(name = "放射")
	private Double fs;
	
	/** 手术费 */
	@Excel(name = "手术费")
	private Double ssf;
	
	/** 化验费 */
	@Excel(name = "化验费")
	private Double hyf;
	
	/** 其它费 */
	@Excel(name = "其他费")
	private Double qtf;
	
	/** 核磁 */
	@Excel(name = "核磁")
	private Double hc;
	
	/** 超声费 */
	@Excel(name = "超声费")
	private Double csf;
	
	/** 心电图 */
	@Excel(name = "心电图")
	private Double xdt;
	
	/** 高压氧 */
	@Excel(name = "高压氧")
	private Double gyy;
	
	/** 诊疗费 */
	@Excel(name = "诊疗费")
	private Double zhenliaof;
	
	/** 材料费 */
	@Excel(name = "材料费")
	private Double clf;
	
	/** CT */
	@Excel(name = "CT")
	private Double ct;
	
	/** 监护费 */
	@Excel(name = "监护费")
	private Double jhf;
	
	/** 麻醉费 */
	@Excel(name = "麻醉费")
	private Double mzf;
	
	/** 煎药费 */
	@Excel(name = "煎药费")
	private Double jyf;
	
	/** 病理 */
	@Excel(name = "病理")
	private Double bl;
	
	/** 理疗费 */
	@Excel(name = "理疗费")
	private Double liliaof;
	
	/** 救护车 */
	@Excel(name = "救护车")
	private Double jhc;
	
	/** 针灸 */
	@Excel(name = "针灸")
	private Double zj;
	
	/** 氧气 */
	@Excel(name = "氧气")
	private Double yq;
	
	/** 输血 */
	@Excel(name = "输血")
	private Double sx;
	
	/** 抢救费 */
	@Excel(name = "抢救费")
	private Double qjf;
	
	/** 血透费 */
	@Excel(name = "血透费")
	private Double xtf;
	
	/** 内窥镜 */
	@Excel(name = "内窥镜")
	private Double nkj;
	
	/** 人工器官 */
	@Excel(name = "人工器官")
	private Double rgqg;
	
	/** 运动平板 */
	@Excel(name = "运动平板")
	private Double ydpb;
	
	/** 血气分析 */
	@Excel(name = "血气分析")
	private Double xqfx;
	
	/** TCD */
	@Excel(name = "TCD")
	private Double tcd;
	
	/** 眼科AB超 */
	@Excel(name = "眼科AB超")
	private Double ykabchao;
	
	/** 内分泌化验 */
	@Excel(name = "内分泌化验")
	private Double nfmhy;
	
	/** 动态心电图 */
	@Excel(name = "动态心电图")
	private Double dtxdy;
	
	/** 动态血压 */
	@Excel(name = "动态血压")
	private Double dtxy;
	
	/** 碎石费 */
	@Excel(name = "碎石费")
	private Double suishif;
	
	/** 本科化验 */
	@Excel(name = "本科化验")
	private Double bkhy;
	
	/** 呼吸医技 */
	@Excel(name = "呼吸医技")
	private Double hxyj;
	
	/** 病理(TCT) */
	@Excel(name = "病理(TCT)")
	private Double bltct;
	
	/** 放射材料 */
	@Excel(name = "放射材料")
	private Double fscl;
	
	/** 皮科检查 */
	@Excel(name = "皮科检查")
	private Double pkjc;
	
	/** 骨密度检查 */
	@Excel(name = "骨密度检查")
	private Double gmdjc;
	
	/** 眼底照相 */
	@Excel(name = "眼底照相")
	private Double ydzx;
	
	/** 本科检查 */
	@Excel(name = "本科检查")
	private Double bkjc;
	
	/** HPV检查 */
	@Excel(name = "HPV检查")
	private Double hpvjc;
	
	/** 脉冲磁疗 */
	@Excel(name = "脉冲磁疗")
	private Double mccl;
	
	/** 医事服务费 */
	@Excel(name = "医事服务费")
	private Double ysfwf;
	
	/** 推拿 */
	@Excel(name = "推拿")
	private Double tn;
	
	/** 口腔放射 */
	@Excel(name = "口腔放射")
	private Double kqfs;
	
	/** 核算日期 */
	@Excel(name = "核算日期")
	private String tjdata;

	public String getTjdata() {
		return tjdata;
	}

	public void setTjdata(String tjdata) {
		this.tjdata = tjdata;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setKdks(String kdks) 
	{
		this.kdks = kdks;
	}

	public String getKdks() 
	{
		return kdks;
	}
	public void setZygsks(String zygsks) 
	{
		this.zygsks = zygsks;
	}

	public String getZygsks() 
	{
		return zygsks;
	}
	public void setRc(Integer rc) 
	{
		this.rc = rc;
	}

	public Integer getRc() 
	{
		return rc;
	}
	public void setGuf(Double guf) 
	{
		this.guf = guf;
	}

	public Double getGuf() 
	{
		return guf;
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

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("kdks", getKdks())
            .append("zygsks", getZygsks())
            .append("rc", getRc())
            .append("guf", getGuf())
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
            .toString();
    }
}
