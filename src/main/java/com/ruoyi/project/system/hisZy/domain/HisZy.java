package com.ruoyi.project.system.hisZy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 住院收费数据表 sys_his_zy
 * 
 * @author panda
 * @date 2019-05-30
 */
public class HisZy extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 住院收费主键 */
	private Integer id;
	/**  */
	private String eaId;
	/** 病案号 */
	private String eaAno;
	/** 日报id */
	private String eaRbid;
	/** 日期 */
	private String eaRq;
	/** 项目编号 */
	private String eaXmh;
	/** 部门号 */
	private String eaBmh;
	/**  */
	private String eaGfbz;
	/** 执行科室编号 */
	private String eaZxksh;
	/** 执行科室医生 */
	private String eaZxysh;
	/** 开单科室编号 */
	private String eaKdksh;
	/** 医生编号 */
	private String eaYsh;
	/**  */
	private String eaJcdh;
	/** 单价 */
	private String eaDj;
	/** 数量 */
	private String eaSl;
	/** 金额 */
	private String eaJe;
	/** 操作工号 */
	private String eaCzgh;
	/**  */
	private String eaJzsh;
	/**  */
	private String eaLx;
	/**  */
	private String eaYzfhId;
	/**  */
	private String eaYeId;
	/**  */
	private String eaLsYpid;
	/**  */
	private String eaYbbz;
	/**  */
	private String eaYbzfbl;
	/**  */
	private String eaYbspbh;
	/**  */
	private String eaYbdj;
	/**  */
	private String eaXmgbh;
	/**  */
	private String eaBxbl;
	/**  */
	private String eaDbbz;
	/**  */
	private String eaZzysh;
	/**  */
	private String eaDyylz;
	/**  */
	private String eaZkbmh;
	/**  */
	private String eaCwh;
	/**  */
	private String eaFhgh;
	/**  */
	private String eaFhrq;
	/** 系统id */
	private String eaXtid;
	/**  */
	private String eaYbcsbz;
	/**  */
	private String eaJcbz;
	/**  */
	private String eaYjjcId;
	/**  */
	private String eaIcuYbmh;
	/**  */
	private String eaYbdm;
	/**  */
	private String eaHismac;
	/**  */
	private String eaYbspxz;
	/**  */
	private String eaTcsm;
	/**  */
	private String eaYhSm;
	/**  */
	private String eaClxx;
	/**  */
	private String eaFbsm;
	/**  */
	private String eaZxbz;
	/**  */
	private String eaYbzfje;
	/**  */
	private String eaYbzlje;
	/**  */
	private String eaTxbfYbmh;
	/**  */
	private String eaFyfsrq;
	/**  */
	private String eaWybz;
	/**  */
	private String cisId;
	/**  */
	private String eaBlsfxx;
	/**  */
	private String eaYzlx;
	/**  */
	private String eaYhje;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setEaId(String eaId) 
	{
		this.eaId = eaId;
	}

	public String getEaId() 
	{
		return eaId;
	}
	public void setEaAno(String eaAno) 
	{
		this.eaAno = eaAno;
	}

	public String getEaAno() 
	{
		return eaAno;
	}
	public void setEaRbid(String eaRbid) 
	{
		this.eaRbid = eaRbid;
	}

	public String getEaRbid() 
	{
		return eaRbid;
	}
	public void setEaRq(String eaRq) 
	{
		this.eaRq = eaRq;
	}

	public String getEaRq() 
	{
		return eaRq;
	}
	public void setEaXmh(String eaXmh) 
	{
		this.eaXmh = eaXmh;
	}

	public String getEaXmh() 
	{
		return eaXmh;
	}
	public void setEaBmh(String eaBmh) 
	{
		this.eaBmh = eaBmh;
	}

	public String getEaBmh() 
	{
		return eaBmh;
	}
	public void setEaGfbz(String eaGfbz) 
	{
		this.eaGfbz = eaGfbz;
	}

	public String getEaGfbz() 
	{
		return eaGfbz;
	}
	public void setEaZxksh(String eaZxksh) 
	{
		this.eaZxksh = eaZxksh;
	}

	public String getEaZxksh() 
	{
		return eaZxksh;
	}
	public void setEaZxysh(String eaZxysh) 
	{
		this.eaZxysh = eaZxysh;
	}

	public String getEaZxysh() 
	{
		return eaZxysh;
	}
	public void setEaKdksh(String eaKdksh) 
	{
		this.eaKdksh = eaKdksh;
	}

	public String getEaKdksh() 
	{
		return eaKdksh;
	}
	public void setEaYsh(String eaYsh) 
	{
		this.eaYsh = eaYsh;
	}

	public String getEaYsh() 
	{
		return eaYsh;
	}
	public void setEaJcdh(String eaJcdh) 
	{
		this.eaJcdh = eaJcdh;
	}

	public String getEaJcdh() 
	{
		return eaJcdh;
	}
	public void setEaDj(String eaDj) 
	{
		this.eaDj = eaDj;
	}

	public String getEaDj() 
	{
		return eaDj;
	}
	public void setEaSl(String eaSl) 
	{
		this.eaSl = eaSl;
	}

	public String getEaSl() 
	{
		return eaSl;
	}
	public void setEaJe(String eaJe) 
	{
		this.eaJe = eaJe;
	}

	public String getEaJe() 
	{
		return eaJe;
	}
	public void setEaCzgh(String eaCzgh) 
	{
		this.eaCzgh = eaCzgh;
	}

	public String getEaCzgh() 
	{
		return eaCzgh;
	}
	public void setEaJzsh(String eaJzsh) 
	{
		this.eaJzsh = eaJzsh;
	}

	public String getEaJzsh() 
	{
		return eaJzsh;
	}
	public void setEaLx(String eaLx) 
	{
		this.eaLx = eaLx;
	}

	public String getEaLx() 
	{
		return eaLx;
	}
	public void setEaYzfhId(String eaYzfhId) 
	{
		this.eaYzfhId = eaYzfhId;
	}

	public String getEaYzfhId() 
	{
		return eaYzfhId;
	}
	public void setEaYeId(String eaYeId) 
	{
		this.eaYeId = eaYeId;
	}

	public String getEaYeId() 
	{
		return eaYeId;
	}
	public void setEaLsYpid(String eaLsYpid) 
	{
		this.eaLsYpid = eaLsYpid;
	}

	public String getEaLsYpid() 
	{
		return eaLsYpid;
	}
	public void setEaYbbz(String eaYbbz) 
	{
		this.eaYbbz = eaYbbz;
	}

	public String getEaYbbz() 
	{
		return eaYbbz;
	}
	public void setEaYbzfbl(String eaYbzfbl) 
	{
		this.eaYbzfbl = eaYbzfbl;
	}

	public String getEaYbzfbl() 
	{
		return eaYbzfbl;
	}
	public void setEaYbspbh(String eaYbspbh) 
	{
		this.eaYbspbh = eaYbspbh;
	}

	public String getEaYbspbh() 
	{
		return eaYbspbh;
	}
	public void setEaYbdj(String eaYbdj) 
	{
		this.eaYbdj = eaYbdj;
	}

	public String getEaYbdj() 
	{
		return eaYbdj;
	}
	public void setEaXmgbh(String eaXmgbh) 
	{
		this.eaXmgbh = eaXmgbh;
	}

	public String getEaXmgbh() 
	{
		return eaXmgbh;
	}
	public void setEaBxbl(String eaBxbl) 
	{
		this.eaBxbl = eaBxbl;
	}

	public String getEaBxbl() 
	{
		return eaBxbl;
	}
	public void setEaDbbz(String eaDbbz) 
	{
		this.eaDbbz = eaDbbz;
	}

	public String getEaDbbz() 
	{
		return eaDbbz;
	}
	public void setEaZzysh(String eaZzysh) 
	{
		this.eaZzysh = eaZzysh;
	}

	public String getEaZzysh() 
	{
		return eaZzysh;
	}
	public void setEaDyylz(String eaDyylz) 
	{
		this.eaDyylz = eaDyylz;
	}

	public String getEaDyylz() 
	{
		return eaDyylz;
	}
	public void setEaZkbmh(String eaZkbmh) 
	{
		this.eaZkbmh = eaZkbmh;
	}

	public String getEaZkbmh() 
	{
		return eaZkbmh;
	}
	public void setEaCwh(String eaCwh) 
	{
		this.eaCwh = eaCwh;
	}

	public String getEaCwh() 
	{
		return eaCwh;
	}
	public void setEaFhgh(String eaFhgh) 
	{
		this.eaFhgh = eaFhgh;
	}

	public String getEaFhgh() 
	{
		return eaFhgh;
	}
	public void setEaFhrq(String eaFhrq) 
	{
		this.eaFhrq = eaFhrq;
	}

	public String getEaFhrq() 
	{
		return eaFhrq;
	}
	public void setEaXtid(String eaXtid) 
	{
		this.eaXtid = eaXtid;
	}

	public String getEaXtid() 
	{
		return eaXtid;
	}
	public void setEaYbcsbz(String eaYbcsbz) 
	{
		this.eaYbcsbz = eaYbcsbz;
	}

	public String getEaYbcsbz() 
	{
		return eaYbcsbz;
	}
	public void setEaJcbz(String eaJcbz) 
	{
		this.eaJcbz = eaJcbz;
	}

	public String getEaJcbz() 
	{
		return eaJcbz;
	}
	public void setEaYjjcId(String eaYjjcId) 
	{
		this.eaYjjcId = eaYjjcId;
	}

	public String getEaYjjcId() 
	{
		return eaYjjcId;
	}
	public void setEaIcuYbmh(String eaIcuYbmh) 
	{
		this.eaIcuYbmh = eaIcuYbmh;
	}

	public String getEaIcuYbmh() 
	{
		return eaIcuYbmh;
	}
	public void setEaYbdm(String eaYbdm) 
	{
		this.eaYbdm = eaYbdm;
	}

	public String getEaYbdm() 
	{
		return eaYbdm;
	}
	public void setEaHismac(String eaHismac) 
	{
		this.eaHismac = eaHismac;
	}

	public String getEaHismac() 
	{
		return eaHismac;
	}
	public void setEaYbspxz(String eaYbspxz) 
	{
		this.eaYbspxz = eaYbspxz;
	}

	public String getEaYbspxz() 
	{
		return eaYbspxz;
	}
	public void setEaTcsm(String eaTcsm) 
	{
		this.eaTcsm = eaTcsm;
	}

	public String getEaTcsm() 
	{
		return eaTcsm;
	}
	public void setEaYhSm(String eaYhSm) 
	{
		this.eaYhSm = eaYhSm;
	}

	public String getEaYhSm() 
	{
		return eaYhSm;
	}
	public void setEaClxx(String eaClxx) 
	{
		this.eaClxx = eaClxx;
	}

	public String getEaClxx() 
	{
		return eaClxx;
	}
	public void setEaFbsm(String eaFbsm) 
	{
		this.eaFbsm = eaFbsm;
	}

	public String getEaFbsm() 
	{
		return eaFbsm;
	}
	public void setEaZxbz(String eaZxbz) 
	{
		this.eaZxbz = eaZxbz;
	}

	public String getEaZxbz() 
	{
		return eaZxbz;
	}
	public void setEaYbzfje(String eaYbzfje) 
	{
		this.eaYbzfje = eaYbzfje;
	}

	public String getEaYbzfje() 
	{
		return eaYbzfje;
	}
	public void setEaYbzlje(String eaYbzlje) 
	{
		this.eaYbzlje = eaYbzlje;
	}

	public String getEaYbzlje() 
	{
		return eaYbzlje;
	}
	public void setEaTxbfYbmh(String eaTxbfYbmh) 
	{
		this.eaTxbfYbmh = eaTxbfYbmh;
	}

	public String getEaTxbfYbmh() 
	{
		return eaTxbfYbmh;
	}
	public void setEaFyfsrq(String eaFyfsrq) 
	{
		this.eaFyfsrq = eaFyfsrq;
	}

	public String getEaFyfsrq() 
	{
		return eaFyfsrq;
	}
	public void setEaWybz(String eaWybz) 
	{
		this.eaWybz = eaWybz;
	}

	public String getEaWybz() 
	{
		return eaWybz;
	}
	public void setCisId(String cisId) 
	{
		this.cisId = cisId;
	}

	public String getCisId() 
	{
		return cisId;
	}
	public void setEaBlsfxx(String eaBlsfxx) 
	{
		this.eaBlsfxx = eaBlsfxx;
	}

	public String getEaBlsfxx() 
	{
		return eaBlsfxx;
	}
	public void setEaYzlx(String eaYzlx) 
	{
		this.eaYzlx = eaYzlx;
	}

	public String getEaYzlx() 
	{
		return eaYzlx;
	}
	public void setEaYhje(String eaYhje) 
	{
		this.eaYhje = eaYhje;
	}

	public String getEaYhje() 
	{
		return eaYhje;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eaId", getEaId())
            .append("eaAno", getEaAno())
            .append("eaRbid", getEaRbid())
            .append("eaRq", getEaRq())
            .append("eaXmh", getEaXmh())
            .append("eaBmh", getEaBmh())
            .append("eaGfbz", getEaGfbz())
            .append("eaZxksh", getEaZxksh())
            .append("eaZxysh", getEaZxysh())
            .append("eaKdksh", getEaKdksh())
            .append("eaYsh", getEaYsh())
            .append("eaJcdh", getEaJcdh())
            .append("eaDj", getEaDj())
            .append("eaSl", getEaSl())
            .append("eaJe", getEaJe())
            .append("eaCzgh", getEaCzgh())
            .append("eaJzsh", getEaJzsh())
            .append("eaLx", getEaLx())
            .append("eaYzfhId", getEaYzfhId())
            .append("eaYeId", getEaYeId())
            .append("eaLsYpid", getEaLsYpid())
            .append("eaYbbz", getEaYbbz())
            .append("eaYbzfbl", getEaYbzfbl())
            .append("eaYbspbh", getEaYbspbh())
            .append("eaYbdj", getEaYbdj())
            .append("eaXmgbh", getEaXmgbh())
            .append("eaBxbl", getEaBxbl())
            .append("eaDbbz", getEaDbbz())
            .append("eaZzysh", getEaZzysh())
            .append("eaDyylz", getEaDyylz())
            .append("eaZkbmh", getEaZkbmh())
            .append("eaCwh", getEaCwh())
            .append("eaFhgh", getEaFhgh())
            .append("eaFhrq", getEaFhrq())
            .append("eaXtid", getEaXtid())
            .append("eaYbcsbz", getEaYbcsbz())
            .append("eaJcbz", getEaJcbz())
            .append("eaYjjcId", getEaYjjcId())
            .append("eaIcuYbmh", getEaIcuYbmh())
            .append("eaYbdm", getEaYbdm())
            .append("eaHismac", getEaHismac())
            .append("eaYbspxz", getEaYbspxz())
            .append("eaTcsm", getEaTcsm())
            .append("eaYhSm", getEaYhSm())
            .append("eaClxx", getEaClxx())
            .append("eaFbsm", getEaFbsm())
            .append("eaZxbz", getEaZxbz())
            .append("eaYbzfje", getEaYbzfje())
            .append("eaYbzlje", getEaYbzlje())
            .append("eaTxbfYbmh", getEaTxbfYbmh())
            .append("eaFyfsrq", getEaFyfsrq())
            .append("eaWybz", getEaWybz())
            .append("cisId", getCisId())
            .append("eaBlsfxx", getEaBlsfxx())
            .append("eaYzlx", getEaYzlx())
            .append("eaYhje", getEaYhje())
            .toString();
    }
}
