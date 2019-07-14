package com.ruoyi.project.system.yjhsKsjx.service;

import com.ruoyi.project.system.yjhsKsjx.domain.YjhsKsjx;
import java.util.List;

/**
 * 医技核算绩效 服务层
 * 
 * @author panda
 * @date 2019-05-30
 */
public interface IYjhsKsjxService 
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
     * 删除医技核算绩效信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteYjhsKsjxByIds(String ids);
	
	/**
	 * 按日期查询当月绩效是否核算
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
