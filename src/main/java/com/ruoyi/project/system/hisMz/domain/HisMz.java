package com.ruoyi.project.system.hisMz.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 门诊收费数据表 sys_his_mz
 * 
 * @author panda
 * @date 2019-05-30
 */
public class HisMz extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 门诊收费主键 */
	private Integer id;

	/** 住院号 */
	private String eaZyh;
	/** 收费编号id */
	private String eaSfbhId;
	/**  */
	private String eaFpxh;
	/** 收费项目id */
	private String eaSfxmId;
	/**  */
	private String eaGfbz;
	/** 执行科室id */
	private String eaZxksh;
	/** 执行医生号 */
	private String eaZxysh;
	/** 开单科室号 */
	private String eaKdksh;
	/** 医生号 */
	private String eaYsh;
	/** 单价 */
	private String eaDj;
	/** 数量 */
	private String eaSl;
	/** 操作工号 */
	private String eaCzgh;
	/** 收费日期 */
	private String eaSfrq;
	/**  */
	private String eaLrbz;
	/** 金额 */
	private String eaJe;
	/**  */
	private String eaZfje;
	/**  */
	private String eaZxsj;
	/**  */
	private String eaMzyskfkId;
	/**  */
	private String eaLsYpid;
	/**  */
	private String eaLsXmid;
	/**  */
	private String eaRq;
	/**  */
	private String eaPsbz;
	/**  */
	private String eaTmbz;
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
	private String eaJeTy;
	/**  */
	private String eaFhgh;
	/**  */
	private String eaFhrq;
	/**  */
	private String eaXtid;
	/**  */
	private String eaYbcsbz;
	/**  */
	private String eaJcbz;
	/**  */
	private String eaBbxh;
	/**  */
	private String eaSybz;
	/**  */
	private String eaYxmid;
	/**  */
	private String eaBzTf;
	/**  */
	private String eaYfId;
	/**  */
	private String eaLbh;
	/**  */
	private String eaYbdm;
	/**  */
	private String eaDxmid;
	/**  */
	private String eaTzid;
	/**  */
	private String eaHismac;
	/**  */
	private String eaYnjskZkkjylsh;
	/**  */
	private String eaYhSm;
	/**  */
	private String eaYhje;
	/**  */
	private String eaTcsm;
	/**  */
	private String eaMzbid;
	/**  */
	private String eaZlsm;
	/**  */
	private String eaTsbz;
	/**  */
	private String eaGqbz;
	/**  */
	private String eaYbspxz;
	/**  */
	private String eaZfxmbz;
	/**  */
	private String eaXm;
	/**  */
	private String eaXb;
	/**  */
	private String eaNl;
	/**  */
	private String eaZd;
	/**  */
	private String eaDyylz;
	/**  */
	private String eaJzbz;
	/**  */
	private String eaGszh;
	/**  */
	private String eaMzyzkId;
	/**  */
	private String eaZxcs;
	/**  */
	private String eaBazdkId;
	/**  */
	private String eaPrintRq;
	/**  */
	private String eaPrintLsh;
	/**  */
	private String eaYnjskZklx;
	/**  */
	private String eaFbid;
	/**  */
	private String eaTfsl;
	/**  */
	private String eaTfje;
	/**  */
	private String eaTfyy;
	/**  */
	private String cisId;
	/**  */
	private String eaYysj;
	/**  */
	private String eaYygh;
	/**  */
	private String eaGcpId;
	/**  */
	private String eaShbz;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	
	
	public void setEaZyh(String eaZyh) 
	{
		this.eaZyh = eaZyh;
	}

	public String getEaZyh() 
	{
		return eaZyh;
	}
	public void setEaSfbhId(String eaSfbhId) 
	{
		this.eaSfbhId = eaSfbhId;
	}

	public String getEaSfbhId() 
	{
		return eaSfbhId;
	}
	public void setEaFpxh(String eaFpxh) 
	{
		this.eaFpxh = eaFpxh;
	}

	public String getEaFpxh() 
	{
		return eaFpxh;
	}
	public void setEaSfxmId(String eaSfxmId) 
	{
		this.eaSfxmId = eaSfxmId;
	}

	public String getEaSfxmId() 
	{
		return eaSfxmId;
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
	public void setEaCzgh(String eaCzgh) 
	{
		this.eaCzgh = eaCzgh;
	}

	public String getEaCzgh() 
	{
		return eaCzgh;
	}
	public void setEaSfrq(String eaSfrq) 
	{
		this.eaSfrq = eaSfrq;
	}

	public String getEaSfrq() 
	{
		return eaSfrq;
	}
	public void setEaLrbz(String eaLrbz) 
	{
		this.eaLrbz = eaLrbz;
	}

	public String getEaLrbz() 
	{
		return eaLrbz;
	}
	public void setEaJe(String eaJe) 
	{
		this.eaJe = eaJe;
	}

	public String getEaJe() 
	{
		return eaJe;
	}
	public void setEaZfje(String eaZfje) 
	{
		this.eaZfje = eaZfje;
	}

	public String getEaZfje() 
	{
		return eaZfje;
	}
	public void setEaZxsj(String eaZxsj) 
	{
		this.eaZxsj = eaZxsj;
	}

	public String getEaZxsj() 
	{
		return eaZxsj;
	}
	public void setEaMzyskfkId(String eaMzyskfkId) 
	{
		this.eaMzyskfkId = eaMzyskfkId;
	}

	public String getEaMzyskfkId() 
	{
		return eaMzyskfkId;
	}
	public void setEaLsYpid(String eaLsYpid) 
	{
		this.eaLsYpid = eaLsYpid;
	}

	public String getEaLsYpid() 
	{
		return eaLsYpid;
	}
	public void setEaLsXmid(String eaLsXmid) 
	{
		this.eaLsXmid = eaLsXmid;
	}

	public String getEaLsXmid() 
	{
		return eaLsXmid;
	}
	public void setEaRq(String eaRq) 
	{
		this.eaRq = eaRq;
	}

	public String getEaRq() 
	{
		return eaRq;
	}
	public void setEaPsbz(String eaPsbz) 
	{
		this.eaPsbz = eaPsbz;
	}

	public String getEaPsbz() 
	{
		return eaPsbz;
	}
	public void setEaTmbz(String eaTmbz) 
	{
		this.eaTmbz = eaTmbz;
	}

	public String getEaTmbz() 
	{
		return eaTmbz;
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
	public void setEaJeTy(String eaJeTy) 
	{
		this.eaJeTy = eaJeTy;
	}

	public String getEaJeTy() 
	{
		return eaJeTy;
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
	public void setEaBbxh(String eaBbxh) 
	{
		this.eaBbxh = eaBbxh;
	}

	public String getEaBbxh() 
	{
		return eaBbxh;
	}
	public void setEaSybz(String eaSybz) 
	{
		this.eaSybz = eaSybz;
	}

	public String getEaSybz() 
	{
		return eaSybz;
	}
	public void setEaYxmid(String eaYxmid) 
	{
		this.eaYxmid = eaYxmid;
	}

	public String getEaYxmid() 
	{
		return eaYxmid;
	}
	public void setEaBzTf(String eaBzTf) 
	{
		this.eaBzTf = eaBzTf;
	}

	public String getEaBzTf() 
	{
		return eaBzTf;
	}
	public void setEaYfId(String eaYfId) 
	{
		this.eaYfId = eaYfId;
	}

	public String getEaYfId() 
	{
		return eaYfId;
	}
	public void setEaLbh(String eaLbh) 
	{
		this.eaLbh = eaLbh;
	}

	public String getEaLbh() 
	{
		return eaLbh;
	}
	public void setEaYbdm(String eaYbdm) 
	{
		this.eaYbdm = eaYbdm;
	}

	public String getEaYbdm() 
	{
		return eaYbdm;
	}
	public void setEaDxmid(String eaDxmid) 
	{
		this.eaDxmid = eaDxmid;
	}

	public String getEaDxmid() 
	{
		return eaDxmid;
	}
	public void setEaTzid(String eaTzid) 
	{
		this.eaTzid = eaTzid;
	}

	public String getEaTzid() 
	{
		return eaTzid;
	}
	public void setEaHismac(String eaHismac) 
	{
		this.eaHismac = eaHismac;
	}

	public String getEaHismac() 
	{
		return eaHismac;
	}
	public void setEaYnjskZkkjylsh(String eaYnjskZkkjylsh) 
	{
		this.eaYnjskZkkjylsh = eaYnjskZkkjylsh;
	}

	public String getEaYnjskZkkjylsh() 
	{
		return eaYnjskZkkjylsh;
	}
	public void setEaYhSm(String eaYhSm) 
	{
		this.eaYhSm = eaYhSm;
	}

	public String getEaYhSm() 
	{
		return eaYhSm;
	}
	public void setEaYhje(String eaYhje) 
	{
		this.eaYhje = eaYhje;
	}

	public String getEaYhje() 
	{
		return eaYhje;
	}
	public void setEaTcsm(String eaTcsm) 
	{
		this.eaTcsm = eaTcsm;
	}

	public String getEaTcsm() 
	{
		return eaTcsm;
	}
	public void setEaMzbid(String eaMzbid) 
	{
		this.eaMzbid = eaMzbid;
	}

	public String getEaMzbid() 
	{
		return eaMzbid;
	}
	public void setEaZlsm(String eaZlsm) 
	{
		this.eaZlsm = eaZlsm;
	}

	public String getEaZlsm() 
	{
		return eaZlsm;
	}
	public void setEaTsbz(String eaTsbz) 
	{
		this.eaTsbz = eaTsbz;
	}

	public String getEaTsbz() 
	{
		return eaTsbz;
	}
	public void setEaGqbz(String eaGqbz) 
	{
		this.eaGqbz = eaGqbz;
	}

	public String getEaGqbz() 
	{
		return eaGqbz;
	}
	public void setEaYbspxz(String eaYbspxz) 
	{
		this.eaYbspxz = eaYbspxz;
	}

	public String getEaYbspxz() 
	{
		return eaYbspxz;
	}
	public void setEaZfxmbz(String eaZfxmbz) 
	{
		this.eaZfxmbz = eaZfxmbz;
	}

	public String getEaZfxmbz() 
	{
		return eaZfxmbz;
	}
	public void setEaXm(String eaXm) 
	{
		this.eaXm = eaXm;
	}

	public String getEaXm() 
	{
		return eaXm;
	}
	public void setEaXb(String eaXb) 
	{
		this.eaXb = eaXb;
	}

	public String getEaXb() 
	{
		return eaXb;
	}
	public void setEaNl(String eaNl) 
	{
		this.eaNl = eaNl;
	}

	public String getEaNl() 
	{
		return eaNl;
	}
	public void setEaZd(String eaZd) 
	{
		this.eaZd = eaZd;
	}

	public String getEaZd() 
	{
		return eaZd;
	}
	public void setEaDyylz(String eaDyylz) 
	{
		this.eaDyylz = eaDyylz;
	}

	public String getEaDyylz() 
	{
		return eaDyylz;
	}
	public void setEaJzbz(String eaJzbz) 
	{
		this.eaJzbz = eaJzbz;
	}

	public String getEaJzbz() 
	{
		return eaJzbz;
	}
	public void setEaGszh(String eaGszh) 
	{
		this.eaGszh = eaGszh;
	}

	public String getEaGszh() 
	{
		return eaGszh;
	}
	public void setEaMzyzkId(String eaMzyzkId) 
	{
		this.eaMzyzkId = eaMzyzkId;
	}

	public String getEaMzyzkId() 
	{
		return eaMzyzkId;
	}
	public void setEaZxcs(String eaZxcs) 
	{
		this.eaZxcs = eaZxcs;
	}

	public String getEaZxcs() 
	{
		return eaZxcs;
	}
	public void setEaBazdkId(String eaBazdkId) 
	{
		this.eaBazdkId = eaBazdkId;
	}

	public String getEaBazdkId() 
	{
		return eaBazdkId;
	}
	public void setEaPrintRq(String eaPrintRq) 
	{
		this.eaPrintRq = eaPrintRq;
	}

	public String getEaPrintRq() 
	{
		return eaPrintRq;
	}
	public void setEaPrintLsh(String eaPrintLsh) 
	{
		this.eaPrintLsh = eaPrintLsh;
	}

	public String getEaPrintLsh() 
	{
		return eaPrintLsh;
	}
	public void setEaYnjskZklx(String eaYnjskZklx) 
	{
		this.eaYnjskZklx = eaYnjskZklx;
	}

	public String getEaYnjskZklx() 
	{
		return eaYnjskZklx;
	}
	public void setEaFbid(String eaFbid) 
	{
		this.eaFbid = eaFbid;
	}

	public String getEaFbid() 
	{
		return eaFbid;
	}
	public void setEaTfsl(String eaTfsl) 
	{
		this.eaTfsl = eaTfsl;
	}

	public String getEaTfsl() 
	{
		return eaTfsl;
	}
	public void setEaTfje(String eaTfje) 
	{
		this.eaTfje = eaTfje;
	}

	public String getEaTfje() 
	{
		return eaTfje;
	}
	public void setEaTfyy(String eaTfyy) 
	{
		this.eaTfyy = eaTfyy;
	}

	public String getEaTfyy() 
	{
		return eaTfyy;
	}
	public void setCisId(String cisId) 
	{
		this.cisId = cisId;
	}

	public String getCisId() 
	{
		return cisId;
	}
	public void setEaYysj(String eaYysj) 
	{
		this.eaYysj = eaYysj;
	}

	public String getEaYysj() 
	{
		return eaYysj;
	}
	public void setEaYygh(String eaYygh) 
	{
		this.eaYygh = eaYygh;
	}

	public String getEaYygh() 
	{
		return eaYygh;
	}
	public void setEaGcpId(String eaGcpId) 
	{
		this.eaGcpId = eaGcpId;
	}

	public String getEaGcpId() 
	{
		return eaGcpId;
	}
	public void setEaShbz(String eaShbz) 
	{
		this.eaShbz = eaShbz;
	}

	public String getEaShbz() 
	{
		return eaShbz;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eaZyh", getEaZyh())
            .append("eaSfbhId", getEaSfbhId())
            .append("eaFpxh", getEaFpxh())
            .append("eaSfxmId", getEaSfxmId())
            .append("eaGfbz", getEaGfbz())
            .append("eaZxksh", getEaZxksh())
            .append("eaZxysh", getEaZxysh())
            .append("eaKdksh", getEaKdksh())
            .append("eaYsh", getEaYsh())
            .append("eaDj", getEaDj())
            .append("eaSl", getEaSl())
            .append("eaCzgh", getEaCzgh())
            .append("eaSfrq", getEaSfrq())
            .append("eaLrbz", getEaLrbz())
            .append("eaJe", getEaJe())
            .append("eaZfje", getEaZfje())
            .append("eaZxsj", getEaZxsj())
            .append("eaMzyskfkId", getEaMzyskfkId())
            .append("eaLsYpid", getEaLsYpid())
            .append("eaLsXmid", getEaLsXmid())
            .append("eaRq", getEaRq())
            .append("eaPsbz", getEaPsbz())
            .append("eaTmbz", getEaTmbz())
            .append("eaYbbz", getEaYbbz())
            .append("eaYbzfbl", getEaYbzfbl())
            .append("eaYbspbh", getEaYbspbh())
            .append("eaYbdj", getEaYbdj())
            .append("eaXmgbh", getEaXmgbh())
            .append("eaJeTy", getEaJeTy())
            .append("eaFhgh", getEaFhgh())
            .append("eaFhrq", getEaFhrq())
            .append("eaXtid", getEaXtid())
            .append("eaYbcsbz", getEaYbcsbz())
            .append("eaJcbz", getEaJcbz())
            .append("eaBbxh", getEaBbxh())
            .append("eaSybz", getEaSybz())
            .append("eaYxmid", getEaYxmid())
            .append("eaBzTf", getEaBzTf())
            .append("eaYfId", getEaYfId())
            .append("eaLbh", getEaLbh())
            .append("eaYbdm", getEaYbdm())
            .append("eaDxmid", getEaDxmid())
            .append("eaTzid", getEaTzid())
            .append("eaHismac", getEaHismac())
            .append("eaYnjskZkkjylsh", getEaYnjskZkkjylsh())
            .append("eaYhSm", getEaYhSm())
            .append("eaYhje", getEaYhje())
            .append("eaTcsm", getEaTcsm())
            .append("eaMzbid", getEaMzbid())
            .append("eaZlsm", getEaZlsm())
            .append("eaTsbz", getEaTsbz())
            .append("eaGqbz", getEaGqbz())
            .append("eaYbspxz", getEaYbspxz())
            .append("eaZfxmbz", getEaZfxmbz())
            .append("eaXm", getEaXm())
            .append("eaXb", getEaXb())
            .append("eaNl", getEaNl())
            .append("eaZd", getEaZd())
            .append("eaDyylz", getEaDyylz())
            .append("eaJzbz", getEaJzbz())
            .append("eaGszh", getEaGszh())
            .append("eaMzyzkId", getEaMzyzkId())
            .append("eaZxcs", getEaZxcs())
            .append("eaBazdkId", getEaBazdkId())
            .append("eaPrintRq", getEaPrintRq())
            .append("eaPrintLsh", getEaPrintLsh())
            .append("eaYnjskZklx", getEaYnjskZklx())
            .append("eaFbid", getEaFbid())
            .append("eaTfsl", getEaTfsl())
            .append("eaTfje", getEaTfje())
            .append("eaTfyy", getEaTfyy())
            .append("cisId", getCisId())
            .append("eaYysj", getEaYysj())
            .append("eaYygh", getEaYygh())
            .append("eaGcpId", getEaGcpId())
            .append("eaShbz", getEaShbz())
            .toString();
    }
}
