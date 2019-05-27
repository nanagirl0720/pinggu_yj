package com.ruoyi.project.system.feetype.service;

import java.util.List;

import com.ruoyi.project.system.feetype.domain.Feetype;

/**
 * 费用类别 服务层
 * 
 * @author panda
 * @date 2018-12-18
 */
public interface IFeetypeService 
{
	/**
     * 查询费用类别信息
     * 
     * @param id 费用类别ID
     * @return 费用类别信息
     */
	public Feetype selectFeetypeById(Integer id);
	
	/**
     * 查询费用类别列表
     * 
     * @param feetype 费用类别信息
     * @return 费用类别集合
     */
	public List<Feetype> selectFeetypeList(Feetype feetype);
	
	/**
     * 查询所有费用类别信息
     * 
     * @param feetype 费用类别信息
     * @return 费用类别集合
     */
	public List<Feetype> selectFeetypeAll();
	
	/**
     * 新增费用类别
     * 
     * @param feetype 费用类别信息
     * @return 结果
     */
	public int insertFeetype(Feetype feetype);
	
	/**
     * 修改费用类别
     * 
     * @param feetype 费用类别信息
     * @return 结果
     */
	public int updateFeetype(Feetype feetype);
		
	/**
     * 删除费用类别信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteFeetypeByIds(String ids);
	
    /**
     * 校验项目名称
     * 
     * @param feetype 项目信息
     * @return 结果
     */
    public String checkFeetypeNameUnique(Feetype feetype);
    
    /**
     * 校验项目编码
     * 
     * @param feetype 项目信息
     * @return 结果
     */
    public String checkFeetypeCodeUnique(Feetype feetype);
    
}
