package com.ruoyi.project.system.ks.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.ks.mapper.KsMapper;
import com.ruoyi.project.system.ks.domain.Ks;
import com.ruoyi.project.system.ks.service.IKsService;
import com.ruoyi.common.support.Convert;

/**
 * 科室字典 服务层实现
 * 
 * @author panda
 * @date 2019-05-30
 */
@Service
public class KsServiceImpl implements IKsService 
{
	@Autowired
	private KsMapper ksMapper;

	/**
     * 查询科室字典信息
     * 
     * @param id 科室字典ID
     * @return 科室字典信息
     */
    @Override
	public Ks selectKsById(Integer id)
	{
	    return ksMapper.selectKsById(id);
	}
	
	/**
     * 查询科室字典列表
     * 
     * @param ks 科室字典信息
     * @return 科室字典集合
     */
	@Override
	public List<Ks> selectKsList(Ks ks)
	{
	    return ksMapper.selectKsList(ks);
	}
	
    /**
     * 新增科室字典
     * 
     * @param ks 科室字典信息
     * @return 结果
     */
	@Override
	public int insertKs(Ks ks)
	{
	    return ksMapper.insertKs(ks);
	}
	
	/**
     * 修改科室字典
     * 
     * @param ks 科室字典信息
     * @return 结果
     */
	@Override
	public int updateKs(Ks ks)
	{
	    return ksMapper.updateKs(ks);
	}

	/**
     * 删除科室字典对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteKsByIds(String ids)
	{
		return ksMapper.deleteKsByIds(Convert.toStrArray(ids));
	}
	
}
