package com.ruoyi.project.system.yjjx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.project.system.yjjx.domin.Yjxm;
import com.ruoyi.project.system.yjjx.mapper.YjxmMapper;



@Service
public class YjxmServiceImpl implements YjxmService{

	@Autowired
	private YjxmMapper yjxmMapper;
	//查询所有医技项目
	public List<Yjxm> selectAllYjxm(){
		return yjxmMapper.selectAllYjxm();
		
		
	}
	/**
	 * 查询出体检科上传的病理项目的工作量
	 * @param xmid
	 * @return
	 */
	@Override
	public List<Yjxm> selectYjxmByKssb(String xmid) {
		return yjxmMapper.selectYjxmByKssb(xmid);
	}
	
	
	
}
