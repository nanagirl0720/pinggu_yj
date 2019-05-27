package com.ruoyi.project.system.mzkdsr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.mzkdsr.mapper.MzkdsrMapper;
import com.ruoyi.project.system.mzkdsr.domain.Mzkdsr;
import com.ruoyi.project.system.mzkdsr.service.IMzkdsrService;
import com.ruoyi.common.support.Convert;

/**
 * 门诊开单收入数据 服务层实现
 * 
 * @author panda
 * @date 2018-12-25
 */
@Service
public class MzkdsrServiceImpl implements IMzkdsrService 
{
	@Autowired
	private MzkdsrMapper mzkdsrMapper;

	/**
     * 查询门诊开单收入数据信息
     * 
     * @param id 门诊开单收入数据ID
     * @return 门诊开单收入数据信息
     */
    @Override
	public Mzkdsr selectMzkdsrById(Integer id)
	{
	    return mzkdsrMapper.selectMzkdsrById(id);
	}
	
	/**
     * 查询门诊开单收入数据列表
     * 
     * @param mzkdsr 门诊开单收入数据信息
     * @return 门诊开单收入数据集合
     */
	@Override
	public List<Mzkdsr> selectMzkdsrList(Mzkdsr mzkdsr)
	{
	    return mzkdsrMapper.selectMzkdsrList(mzkdsr);
	}
	
    /**
     * 新增门诊开单收入数据
     * 
     * @param mzkdsr 门诊开单收入数据信息
     * @return 结果
     */
	@Override
	public int insertMzkdsr(Mzkdsr mzkdsr)
	{
	    return mzkdsrMapper.insertMzkdsr(mzkdsr);
	}
	
	/**
     * 修改门诊开单收入数据
     * 
     * @param mzkdsr 门诊开单收入数据信息
     * @return 结果
     */
	@Override
	public int updateMzkdsr(Mzkdsr mzkdsr)
	{
	    return mzkdsrMapper.updateMzkdsr(mzkdsr);
	}

	/**
     * 删除门诊开单收入数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMzkdsrByIds(String ids)
	{
		return mzkdsrMapper.deleteMzkdsrByIds(Convert.toStrArray(ids));
	}
	
}
