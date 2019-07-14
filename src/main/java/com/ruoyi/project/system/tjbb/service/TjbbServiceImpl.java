package com.ruoyi.project.system.tjbb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.tjbb.mapper.TjbbMapper;
import com.ruoyi.project.system.tjbb.domain.Tjbb;
import com.ruoyi.project.system.tjbb.service.ITjbbService;
import com.ruoyi.common.support.Convert;

/**
 * 体检报 服务层实现
 * 
 * @author panda
 * @date 2019-06-10
 */
@Service
public class TjbbServiceImpl implements ITjbbService 
{
	@Autowired
	private TjbbMapper tjbbMapper;

	/**
     * 查询体检报信息
     * 
     * @param id 体检报ID
     * @return 体检报信息
     */
    @Override
	public Tjbb selectTjbbById(Integer id)
	{
	    return tjbbMapper.selectTjbbById(id);
	}
	
	/**
     * 查询体检报列表
     * 
     * @param tjbb 体检报信息
     * @return 体检报集合
     */
	@Override
	public List<Tjbb> selectTjbbList(Tjbb tjbb)
	{
	    return tjbbMapper.selectTjbbList(tjbb);
	}
	
    /**
     * 新增体检报
     * 
     * @param tjbb 体检报信息
     * @return 结果
     */
	@Override
	public int insertTjbb(Tjbb tjbb)
	{
	    return tjbbMapper.insertTjbb(tjbb);
	}
	
	/**
     * 修改体检报
     * 
     * @param tjbb 体检报信息
     * @return 结果
     */
	@Override
	public int updateTjbb(Tjbb tjbb)
	{
	    return tjbbMapper.updateTjbb(tjbb);
	}

	/**
     * 删除体检报对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTjbbByIds(String ids)
	{
		return tjbbMapper.deleteTjbbByIds(Convert.toStrArray(ids));
	}
	
}
