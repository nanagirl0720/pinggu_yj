package com.ruoyi.project.system.yjhsXmgzl.service;

import com.ruoyi.project.system.yjhsXmgzl.domain.YjhsXmgzl;
import java.util.List;

/**
 * 医技核算项目工作量 服务层
 * 
 * @author panda
 * @date 2019-05-30
 */
public interface IYjhsXmgzlService 
{
	/**
     * 查询医技核算项目工作量信息
     * 
     * @param id 医技核算项目工作量ID
     * @return 医技核算项目工作量信息
     */
	public YjhsXmgzl selectYjhsXmgzlById(Integer id);
	
	/**
     * 查询医技核算项目工作量列表
     * 
     * @param yjhsXmgzl 医技核算项目工作量信息
     * @return 医技核算项目工作量集合
     */
	public List<YjhsXmgzl> selectYjhsXmgzlList(YjhsXmgzl yjhsXmgzl);
	
	/**
     * 新增医技核算项目工作量
     * 
     * @param yjhsXmgzl 医技核算项目工作量信息
     * @return 结果
     */
	public int insertYjhsXmgzl(YjhsXmgzl yjhsXmgzl);
	
	/**
     * 修改医技核算项目工作量
     * 
     * @param yjhsXmgzl 医技核算项目工作量信息
     * @return 结果
     */
	public int updateYjhsXmgzl(YjhsXmgzl yjhsXmgzl);
		
	/**
     * 删除医技核算项目工作量信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteYjhsXmgzlByIds(String ids);
	
	/**
	 * 查看当前日期是否核算过工作量
	 * @param rq
	 * @return
	 */
	public int selectYjhsXmgzlByRq(String rq);
	
	/**
	 * 根据日期查看上报数据是否参与核算过
	 * @param rq
	 * @return
	 */
	public int selectSbgzlByRq(String rq);
	
	/**
	 * 开始核算：查询医技项目工作量
	 * @return
	 */
	public List<YjhsXmgzl> selectYjhsXmgzlByRiq(String rq);
	
	public  List<YjhsXmgzl> selectAllByRq(String rq);
}
