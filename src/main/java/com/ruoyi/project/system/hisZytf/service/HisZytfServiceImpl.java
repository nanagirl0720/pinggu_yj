package com.ruoyi.project.system.hisZytf.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.hisZytf.mapper.HisZytfMapper;
import com.ruoyi.project.system.hisZytf.domain.HisZytf;
import com.ruoyi.project.system.hisZytf.service.IHisZytfService;
import com.ruoyi.common.support.Convert;

/**
 * 住院退费数据 服务层实现
 * 
 * @author panda
 * @date 2019-05-30
 */
@Service
public class HisZytfServiceImpl implements IHisZytfService 
{
	@Autowired
	private HisZytfMapper hisZytfMapper;

	/**
     * 查询住院退费数据信息
     * 
     * @param id 住院退费数据ID
     * @return 住院退费数据信息
     */
    @Override
	public HisZytf selectHisZytfById(Integer id)
	{
	    return hisZytfMapper.selectHisZytfById(id);
	}
	
	/**
     * 查询住院退费数据列表
     * 
     * @param hisZytf 住院退费数据信息
     * @return 住院退费数据集合
     */
	@Override
	public List<HisZytf> selectHisZytfList(HisZytf hisZytf)
	{
	    return hisZytfMapper.selectHisZytfList(hisZytf);
	}
	
    /**
     * 新增住院退费数据
     * 
     * @param hisZytf 住院退费数据信息
     * @return 结果
     */
	@Override
	public int insertHisZytf(HisZytf hisZytf)
	{
	    return hisZytfMapper.insertHisZytf(hisZytf);
	}
	
	/**
     * 修改住院退费数据
     * 
     * @param hisZytf 住院退费数据信息
     * @return 结果
     */
	@Override
	public int updateHisZytf(HisZytf hisZytf)
	{
	    return hisZytfMapper.updateHisZytf(hisZytf);
	}

	/**
     * 删除住院退费数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteHisZytfByIds(String ids)
	{
		return hisZytfMapper.deleteHisZytfByIds(Convert.toStrArray(ids));
	}
	
}
