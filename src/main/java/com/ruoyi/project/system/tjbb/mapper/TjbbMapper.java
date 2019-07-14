package com.ruoyi.project.system.tjbb.mapper;

import com.ruoyi.project.system.tjbb.domain.Tjbb;
import java.util.List;	

/**
 * 体检报 数据层
 * 
 * @author panda
 * @date 2019-06-10
 */
public interface TjbbMapper 
{
	/**
     * 查询体检报信息
     * 
     * @param id 体检报ID
     * @return 体检报信息
     */
	public Tjbb selectTjbbById(Integer id);
	
	/**
     * 查询体检报列表
     * 
     * @param tjbb 体检报信息
     * @return 体检报集合
     */
	public List<Tjbb> selectTjbbList(Tjbb tjbb);
	
	/**
     * 新增体检报
     * 
     * @param tjbb 体检报信息
     * @return 结果
     */
	public int insertTjbb(Tjbb tjbb);
	
	/**
     * 修改体检报
     * 
     * @param tjbb 体检报信息
     * @return 结果
     */
	public int updateTjbb(Tjbb tjbb);
	
	/**
     * 删除体检报
     * 
     * @param id 体检报ID
     * @return 结果
     */
	public int deleteTjbbById(Integer id);
	
	/**
     * 批量删除体检报
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTjbbByIds(String[] ids);
	
}