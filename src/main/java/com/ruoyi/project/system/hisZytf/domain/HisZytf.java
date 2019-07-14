package com.ruoyi.project.system.hisZytf.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 住院退费数据表 sys_his_zytf
 * 
 * @author panda
 * @date 2019-05-30
 */
public class HisZytf extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 住院退费主键 */
	private Integer id;
	/**  */
	private String eaId;
	/**  */
	private String eaAno;
	/**  */
	private String eaJzsh;
	/** 日报id */
	private String eaRbid;
	/** 收费项目id */
	private String eaXmh;
	/** 单价 */
	private String eaDj;
	/** 数量 */
	private String eaSl;
	/** 金额 */
	private String eaJe;
	/** 执行科室号 */
	private String eaZxksh;
	/** 执行医生号 */
	private String eaZxysh;
	/** 开单医生号 */
	private String eaKdksh;
	/** 医生号 */
	private String eaYsh;
	/** 日期 */
	private String eaRq;
	/** 操作工号 */
	private String eaCzgh;
	/**  */
	private String eaGfbz;
	/** 部门号 */
	private String eaBmh;
	/**  */
	private String eaAutoSm;
	/**  */
	private String eaYeId;
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
	private String eaZkbmh;
	/**  */
	private String eaZzysh;
	/**  */
	private String eaDyylz;
	/**  */
	private String eaCwh;
	/**  */
	private String eaYbcsbz;
	/**  */
	private String eaJcbz;
	/**  */
	private String eaXtid;
	/**  */
	private String eaYxtid;
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
	private String eaYhje;
	/**  */
	private String eaClxx;
	/**  */
	private String eaFbsm;
	/**  */
	private String eaZxbz;
	/**  */
	private String eaFdrfy;
	/**  */
	private String eaYbzfje;
	/**  */
	private String eaYbzlje;
	/**  */
	private String eaTxbfYbmh;
	/**  */
	private String eaTfyy;
	/**  */
	private String eaFyfsrq;
	/**  */
	private String eaClgrdh;
	/**  */
	private String eaWybz;
	/**  */
	private String eaBlsfxx;
	/**  */
	private String eaYhSm;

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
	public void setEaJzsh(String eaJzsh) 
	{
		this.eaJzsh = eaJzsh;
	}

	public String getEaJzsh() 
	{
		return eaJzsh;
	}
	public void setEaRbid(String eaRbid) 
	{
		this.eaRbid = eaRbid;
	}

	public String getEaRbid() 
	{
		return eaRbid;
	}
	public void setEaXmh(String eaXmh) 
	{
		this.eaXmh = eaXmh;
	}

	public String getEaXmh() 
	{
		return eaXmh;
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
	public void setEaRq(String eaRq) 
	{
		this.eaRq = eaRq;
	}

	public String getEaRq() 
	{
		return eaRq;
	}
	public void setEaCzgh(String eaCzgh) 
	{
		this.eaCzgh = eaCzgh;
	}

	public String getEaCzgh() 
	{
		return eaCzgh;
	}
	public void setEaGfbz(String eaGfbz) 
	{
		this.eaGfbz = eaGfbz;
	}

	public String getEaGfbz() 
	{
		return eaGfbz;
	}
	public void setEaBmh(String eaBmh) 
	{
		this.eaBmh = eaBmh;
	}

	public String getEaBmh() 
	{
		return eaBmh;
	}
	public void setEaAutoSm(String eaAutoSm) 
	{
		this.eaAutoSm = eaAutoSm;
	}

	public String getEaAutoSm() 
	{
		return eaAutoSm;
	}
	public void setEaYeId(String eaYeId) 
	{
		this.eaYeId = eaYeId;
	}

	public String getEaYeId() 
	{
		return eaYeId;
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
	public void setEaZkbmh(String eaZkbmh) 
	{
		this.eaZkbmh = eaZkbmh;
	}

	public String getEaZkbmh() 
	{
		return eaZkbmh;
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
	public void setEaCwh(String eaCwh) 
	{
		this.eaCwh = eaCwh;
	}

	public String getEaCwh() 
	{
		return eaCwh;
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
	public void setEaXtid(String eaXtid) 
	{
		this.eaXtid = eaXtid;
	}

	public String getEaXtid() 
	{
		return eaXtid;
	}
	public void setEaYxtid(String eaYxtid) 
	{
		this.eaYxtid = eaYxtid;
	}

	public String getEaYxtid() 
	{
		return eaYxtid;
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
	public void setEaYhje(String eaYhje) 
	{
		this.eaYhje = eaYhje;
	}

	public String getEaYhje() 
	{
		return eaYhje;
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
	public void setEaFdrfy(String eaFdrfy) 
	{
		this.eaFdrfy = eaFdrfy;
	}

	public String getEaFdrfy() 
	{
		return eaFdrfy;
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
	public void setEaTfyy(String eaTfyy) 
	{
		this.eaTfyy = eaTfyy;
	}

	public String getEaTfyy() 
	{
		return eaTfyy;
	}
	public void setEaFyfsrq(String eaFyfsrq) 
	{
		this.eaFyfsrq = eaFyfsrq;
	}

	public String getEaFyfsrq() 
	{
		return eaFyfsrq;
	}
	public void setEaClgrdh(String eaClgrdh) 
	{
		this.eaClgrdh = eaClgrdh;
	}

	public String getEaClgrdh() 
	{
		return eaClgrdh;
	}
	public void setEaWybz(String eaWybz) 
	{
		this.eaWybz = eaWybz;
	}

	public String getEaWybz() 
	{
		return eaWybz;
	}
	public void setEaBlsfxx(String eaBlsfxx) 
	{
		this.eaBlsfxx = eaBlsfxx;
	}

	public String getEaBlsfxx() 
	{
		return eaBlsfxx;
	}
	public void setEaYhSm(String eaYhSm) 
	{
		this.eaYhSm = eaYhSm;
	}

	public String getEaYhSm() 
	{
		return eaYhSm;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eaId", getEaId())
            .append("eaAno", getEaAno())
            .append("eaJzsh", getEaJzsh())
            .append("eaRbid", getEaRbid())
            .append("eaXmh", getEaXmh())
            .append("eaDj", getEaDj())
            .append("eaSl", getEaSl())
            .append("eaJe", getEaJe())
            .append("eaZxksh", getEaZxksh())
            .append("eaZxysh", getEaZxysh())
            .append("eaKdksh", getEaKdksh())
            .append("eaYsh", getEaYsh())
            .append("eaRq", getEaRq())
            .append("eaCzgh", getEaCzgh())
            .append("eaGfbz", getEaGfbz())
            .append("eaBmh", getEaBmh())
            .append("eaAutoSm", getEaAutoSm())
            .append("eaYeId", getEaYeId())
            .append("eaYbbz", getEaYbbz())
            .append("eaYbzfbl", getEaYbzfbl())
            .append("eaYbspbh", getEaYbspbh())
            .append("eaYbdj", getEaYbdj())
            .append("eaXmgbh", getEaXmgbh())
            .append("eaBxbl", getEaBxbl())
            .append("eaDbbz", getEaDbbz())
            .append("eaZkbmh", getEaZkbmh())
            .append("eaZzysh", getEaZzysh())
            .append("eaDyylz", getEaDyylz())
            .append("eaCwh", getEaCwh())
            .append("eaYbcsbz", getEaYbcsbz())
            .append("eaJcbz", getEaJcbz())
            .append("eaXtid", getEaXtid())
            .append("eaYxtid", getEaYxtid())
            .append("eaIcuYbmh", getEaIcuYbmh())
            .append("eaYbdm", getEaYbdm())
            .append("eaHismac", getEaHismac())
            .append("eaYbspxz", getEaYbspxz())
            .append("eaTcsm", getEaTcsm())
            .append("eaYhje", getEaYhje())
            .append("eaClxx", getEaClxx())
            .append("eaFbsm", getEaFbsm())
            .append("eaZxbz", getEaZxbz())
            .append("eaFdrfy", getEaFdrfy())
            .append("eaYbzfje", getEaYbzfje())
            .append("eaYbzlje", getEaYbzlje())
            .append("eaTxbfYbmh", getEaTxbfYbmh())
            .append("eaTfyy", getEaTfyy())
            .append("eaFyfsrq", getEaFyfsrq())
            .append("eaClgrdh", getEaClgrdh())
            .append("eaWybz", getEaWybz())
            .append("eaBlsfxx", getEaBlsfxx())
            .append("eaYhSm", getEaYhSm())
            .toString();
    }
}
