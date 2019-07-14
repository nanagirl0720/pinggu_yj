package com.ruoyi.project.system.hisMz.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.hisMz.mapper.HisMzMapper;
import com.ruoyi.project.system.hisMz.domain.HisMz;
import com.ruoyi.project.system.hisMz.service.IHisMzService;
import com.ruoyi.common.support.Convert;

/**
 * 门诊收费数据 服务层实现
 * 
 * @author panda
 * @date 2019-05-30
 */
@Service
public class HisMzServiceImpl implements IHisMzService 
{
	@Autowired
	private HisMzMapper hisMzMapper;

	/**
     * 查询门诊收费数据信息
     * 
     * @param id 门诊收费数据ID
     * @return 门诊收费数据信息
     */
    @Override
	public HisMz selectHisMzById(Integer id)
	{
	    return hisMzMapper.selectHisMzById(id);
	}
	
	/**
     * 查询门诊收费数据列表
     * 
     * @param hisMz 门诊收费数据信息
     * @return 门诊收费数据集合
     */
	@Override
	public List<HisMz> selectHisMzList(HisMz hisMz)
	{
	    return hisMzMapper.selectHisMzList(hisMz);
	}
	
    /**
     * 新增门诊收费数据
     * 
     * @param hisMz 门诊收费数据信息
     * @return 结果
     */
	@Override
	public int insertHisMz(HisMz hisMz)
	{
	    return hisMzMapper.insertHisMz(hisMz);
	}
	
	/**
     * 修改门诊收费数据
     * 
     * @param hisMz 门诊收费数据信息
     * @return 结果
     */
	@Override
	public int updateHisMz(HisMz hisMz)
	{
	    return hisMzMapper.updateHisMz(hisMz);
	}

	/**
     * 删除门诊收费数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteHisMzByIds(String ids)
	{
		return hisMzMapper.deleteHisMzByIds(Convert.toStrArray(ids));
	}
	
}
