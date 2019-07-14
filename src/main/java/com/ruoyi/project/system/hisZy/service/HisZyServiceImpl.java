package com.ruoyi.project.system.hisZy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.hisZy.mapper.HisZyMapper;
import com.ruoyi.project.system.hisZy.domain.HisZy;
import com.ruoyi.project.system.hisZy.service.IHisZyService;
import com.ruoyi.common.support.Convert;

/**
 * 住院收费数据 服务层实现
 * 
 * @author panda
 * @date 2019-05-30
 */
@Service
public class HisZyServiceImpl implements IHisZyService 
{
	@Autowired
	private HisZyMapper hisZyMapper;

	/**
     * 查询住院收费数据信息
     * 
     * @param id 住院收费数据ID
     * @return 住院收费数据信息
     */
    @Override
	public HisZy selectHisZyById(Integer id)
	{
	    return hisZyMapper.selectHisZyById(id);
	}
	
	/**
     * 查询住院收费数据列表
     * 
     * @param hisZy 住院收费数据信息
     * @return 住院收费数据集合
     */
	@Override
	public List<HisZy> selectHisZyList(HisZy hisZy)
	{
	    return hisZyMapper.selectHisZyList(hisZy);
	}
	
    /**
     * 新增住院收费数据
     * 
     * @param hisZy 住院收费数据信息
     * @return 结果
     */
	@Override
	public int insertHisZy(HisZy hisZy)
	{
	    return hisZyMapper.insertHisZy(hisZy);
	}
	
	/**
     * 修改住院收费数据
     * 
     * @param hisZy 住院收费数据信息
     * @return 结果
     */
	@Override
	public int updateHisZy(HisZy hisZy)
	{
	    return hisZyMapper.updateHisZy(hisZy);
	}

	/**
     * 删除住院收费数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteHisZyByIds(String ids)
	{
		return hisZyMapper.deleteHisZyByIds(Convert.toStrArray(ids));
	}
	
}
