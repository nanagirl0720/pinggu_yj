package com.ruoyi.project.system.spdeptXm.service;

import java.util.List;

import com.ruoyi.project.system.spdeptXm.domain.SpdeptXm;

/**
 * 特殊科室操作项目 服务层
 * 
 * @author panda
 * @date 2018-12-18
 */
public interface ISpdeptXmService 
{
	/**
     * 查询特殊科室操作项目信息
     * 
     * @param id 特殊科室操作项目ID
     * @return 特殊科室操作项目信息
     */
	public SpdeptXm selectSpdeptXmById(Integer id);
	
	/**
     * 查询特殊科室操作项目列表
     * 
     * @param spdeptXm 特殊科室操作项目信息
     * @return 特殊科室操作项目集合
     */
	public List<SpdeptXm> selectSpdeptXmList(SpdeptXm spdeptXm);
	
	/**
     * 新增特殊科室操作项目
     * 
     * @param spdeptXm 特殊科室操作项目信息
     * @return 结果
     */
	public int insertSpdeptXm(SpdeptXm spdeptXm);
	
	/**
     * 修改特殊科室操作项目
     * 
     * @param spdeptXm 特殊科室操作项目信息
     * @return 结果
     */
	public int updateSpdeptXm(SpdeptXm spdeptXm);
		
	/**
     * 删除特殊科室操作项目信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteSpdeptXmByIds(String ids);
	
    /**
     * 校验项目名称
     * 
     * @param spdeptXm 项目信息
     * @return 结果
     */
    public String checkSpdeptXmNameUnique(SpdeptXm spdeptXm);
    
    /**
     * 校验项目编码
     * 
     * @param spdeptXm 项目信息
     * @return 结果
     */
    public String checkSpdeptXmCodeUnique(SpdeptXm spdeptXm);
    
    public String checkSpdeptXmCodeList(String xmcode);
}
