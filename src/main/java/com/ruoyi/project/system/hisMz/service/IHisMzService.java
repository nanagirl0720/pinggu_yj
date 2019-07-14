package com.ruoyi.project.system.hisMz.service;

import com.ruoyi.project.system.hisMz.domain.HisMz;
import java.util.List;

/**
 * 门诊收费数据 服务层
 * 
 * @author panda
 * @date 2019-05-30
 */
public interface IHisMzService 
{
	/**
     * 查询门诊收费数据信息
     * 
     * @param id 门诊收费数据ID
     * @return 门诊收费数据信息
     */
	public HisMz selectHisMzById(Integer id);
	
	/**
     * 查询门诊收费数据列表
     * 
     * @param hisMz 门诊收费数据信息
     * @return 门诊收费数据集合
     */
	public List<HisMz> selectHisMzList(HisMz hisMz);
	
	/**
     * 新增门诊收费数据
     * 
     * @param hisMz 门诊收费数据信息
     * @return 结果
     */
	public int insertHisMz(HisMz hisMz);
	
	/**
     * 修改门诊收费数据
     * 
     * @param hisMz 门诊收费数据信息
     * @return 结果
     */
	public int updateHisMz(HisMz hisMz);
		
	/**
     * 删除门诊收费数据信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteHisMzByIds(String ids);
	
}
