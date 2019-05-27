package com.ruoyi.project.system.feetype.mapper;

import java.util.List;

import com.ruoyi.project.system.feetype.domain.Feetype;	

/**
 * 费用类别 数据层
 * 
 * @author panda
 * @date 2018-12-18
 */
public interface FeetypeMapper 
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
     * 删除费用类别
     * 
     * @param id 费用类别ID
     * @return 结果
     */
	public int deleteFeetypeById(Integer id);
	
	/**
     * 批量删除费用类别
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteFeetypeByIds(String[] ids);
	
    /**
     * 校验费用类别名称
     * 
     * @param feename 项目名称
     * @return 结果
     */
    public Feetype checkFeetypeNameUnique(String feename);

    /**
     * 校验项目编码
     * 
     * @param feecode 项目编码
     * @return 结果
     */
    public Feetype checkFeetypeCodeUnique(String feecode);
	
}