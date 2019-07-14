package com.ruoyi.project.system.yjhsKsjx.mapper;

import com.ruoyi.project.system.yjhsKsjx.domain.YjhsKsjx;
import java.util.List;	

/**
 * 医技核算绩效 数据层
 * 
 * @author panda
 * @date 2019-05-30
 */
public interface YjhsKsjxMapper 
{
	/**
     * 查询医技核算绩效信息
     * 
     * @param id 医技核算绩效ID
     * @return 医技核算绩效信息
     */
	public YjhsKsjx selectYjhsKsjxById(Integer id);
	
	/**
     * 查询医技核算绩效列表
     * 
     * @param yjhsKsjx 医技核算绩效信息
     * @return 医技核算绩效集合
     */
	public List<YjhsKsjx> selectYjhsKsjxList(YjhsKsjx yjhsKsjx);
	
	/**
     * 新增医技核算绩效
     * 
     * @param yjhsKsjx 医技核算绩效信息
     * @return 结果
     */
	public int insertYjhsKsjx(YjhsKsjx yjhsKsjx);
	
	/**
     * 修改医技核算绩效
     * 
     * @param yjhsKsjx 医技核算绩效信息
     * @return 结果
     */
	public int updateYjhsKsjx(YjhsKsjx yjhsKsjx);
	
	/**
     * 删除医技核算绩效
     * 
     * @param id 医技核算绩效ID
     * @return 结果
     */
	public int deleteYjhsKsjxById(Integer id);
	
	/**
     * 批量删除医技核算绩效
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteYjhsKsjxByIds(String[] ids);
	
	/**
	 * 根据日期查询是否存在当月绩效数据
	 * @param rq
	 * @return
	 */
	public int selectYjhsKsjxByRq(String rq);
	
	/**
	 * 查询当月医技工作量绩效
	 * @return
	 */
	public List<YjhsKsjx> selectYjjx();
}