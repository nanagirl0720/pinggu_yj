package com.ruoyi.project.system.ks.mapper;

import com.ruoyi.project.system.ks.domain.Ks;
import java.util.List;	

/**
 * 科室字典 数据层
 * 
 * @author panda
 * @date 2019-05-30
 */
public interface KsMapper 
{
	/**
     * 查询科室字典信息
     * 
     * @param id 科室字典ID
     * @return 科室字典信息
     */
	public Ks selectKsById(Integer id);
	
	/**
     * 查询科室字典列表
     * 
     * @param ks 科室字典信息
     * @return 科室字典集合
     */
	public List<Ks> selectKsList(Ks ks);
	
	/**
     * 新增科室字典
     * 
     * @param ks 科室字典信息
     * @return 结果
     */
	public int insertKs(Ks ks);
	
	/**
     * 修改科室字典
     * 
     * @param ks 科室字典信息
     * @return 结果
     */
	public int updateKs(Ks ks);
	
	/**
     * 删除科室字典
     * 
     * @param id 科室字典ID
     * @return 结果
     */
	public int deleteKsById(Integer id);
	
	/**
     * 批量删除科室字典
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteKsByIds(String[] ids);
	
}