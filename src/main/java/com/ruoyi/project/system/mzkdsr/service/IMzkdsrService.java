package com.ruoyi.project.system.mzkdsr.service;

import com.ruoyi.project.system.mzkdsr.domain.Mzkdsr;
import java.util.List;

/**
 * 门诊开单收入数据 服务层
 * 
 * @author panda
 * @date 2018-12-25
 */
public interface IMzkdsrService 
{
	/**
     * 查询门诊开单收入数据信息
     * 
     * @param id 门诊开单收入数据ID
     * @return 门诊开单收入数据信息
     */
	public Mzkdsr selectMzkdsrById(Integer id);
	
	/**
     * 查询门诊开单收入数据列表
     * 
     * @param mzkdsr 门诊开单收入数据信息
     * @return 门诊开单收入数据集合
     */
	public List<Mzkdsr> selectMzkdsrList(Mzkdsr mzkdsr);
	
	/**
     * 新增门诊开单收入数据
     * 
     * @param mzkdsr 门诊开单收入数据信息
     * @return 结果
     */
	public int insertMzkdsr(Mzkdsr mzkdsr);
	
	/**
     * 修改门诊开单收入数据
     * 
     * @param mzkdsr 门诊开单收入数据信息
     * @return 结果
     */
	public int updateMzkdsr(Mzkdsr mzkdsr);
		
	/**
     * 删除门诊开单收入数据信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMzkdsrByIds(String ids);
	
}
