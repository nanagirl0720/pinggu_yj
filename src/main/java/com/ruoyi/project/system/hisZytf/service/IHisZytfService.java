package com.ruoyi.project.system.hisZytf.service;

import com.ruoyi.project.system.hisZytf.domain.HisZytf;
import java.util.List;

/**
 * 住院退费数据 服务层
 * 
 * @author panda
 * @date 2019-05-30
 */
public interface IHisZytfService 
{
	/**
     * 查询住院退费数据信息
     * 
     * @param id 住院退费数据ID
     * @return 住院退费数据信息
     */
	public HisZytf selectHisZytfById(Integer id);
	
	/**
     * 查询住院退费数据列表
     * 
     * @param hisZytf 住院退费数据信息
     * @return 住院退费数据集合
     */
	public List<HisZytf> selectHisZytfList(HisZytf hisZytf);
	
	/**
     * 新增住院退费数据
     * 
     * @param hisZytf 住院退费数据信息
     * @return 结果
     */
	public int insertHisZytf(HisZytf hisZytf);
	
	/**
     * 修改住院退费数据
     * 
     * @param hisZytf 住院退费数据信息
     * @return 结果
     */
	public int updateHisZytf(HisZytf hisZytf);
		
	/**
     * 删除住院退费数据信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteHisZytfByIds(String ids);
	
}
