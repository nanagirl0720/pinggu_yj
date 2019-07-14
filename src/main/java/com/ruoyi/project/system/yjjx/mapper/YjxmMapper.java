package com.ruoyi.project.system.yjjx.mapper;

import java.util.List;

import com.ruoyi.project.system.yjjx.domin.Yjxm;

public interface YjxmMapper {

	//查询所有医技项目
	public List<Yjxm> selectAllYjxm();
	
	/**
	 * 查询出体检科上传的病理项目的工作量
	 * @param xmid
	 * @return
	 */
	public List<Yjxm> selectYjxmByKssb(String xmid);
}
