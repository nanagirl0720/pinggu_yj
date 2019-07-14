package com.ruoyi.project.system.hisZy.service;

import com.ruoyi.project.system.hisZy.domain.HisZy;
import java.util.List;

/**
 * 住院收费数据 服务层
 * 
 * @author panda
 * @date 2019-05-30
 */
public interface IHisZyService 
{
	/**
     * 查询住院收费数据信息
     * 
     * @param id 住院收费数据ID
     * @return 住院收费数据信息
     */
	public HisZy selectHisZyById(Integer id);
	
	/**
     * 查询住院收费数据列表
     * 
     * @param hisZy 住院收费数据信息
     * @return 住院收费数据集合
     */
	public List<HisZy> selectHisZyList(HisZy hisZy);
	
	/**
     * 新增住院收费数据
     * 
     * @param hisZy 住院收费数据信息
     * @return 结果
     */
	public int insertHisZy(HisZy hisZy);
	
	/**
     * 修改住院收费数据
     * 
     * @param hisZy 住院收费数据信息
     * @return 结果
     */
	public int updateHisZy(HisZy hisZy);
		
	/**
     * 删除住院收费数据信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteHisZyByIds(String ids);
	
}
