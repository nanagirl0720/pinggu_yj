package com.ruoyi.project.system.yjxmKssb.mapper;

import java.util.List;

import com.ruoyi.project.system.yjjx.domin.Yjxm;
import com.ruoyi.project.system.yjxmKssb.domain.YjxmKssb;	

/**
 * 病理体检上报数据 数据层
 * 
 * @author panda
 * @date 2019-05-31
 */
public interface YjxmKssbMapper 
{
	/**
     * 查询病理体检上报数据信息
     * 
     * @param id 病理体检上报数据ID
     * @return 病理体检上报数据信息
     */
	public YjxmKssb selectYjxmKssbById(Integer id);
	
	/**
     * 查询病理体检上报数据列表
     * 
     * @param yjxmKssb 病理体检上报数据信息
     * @return 病理体检上报数据集合
     */
	public List<YjxmKssb> selectYjxmKssbList(YjxmKssb yjxmKssb);
	
	/**
     * 新增病理体检上报数据
     * 
     * @param yjxmKssb 病理体检上报数据信息
     * @return 结果
     */
	public int insertYjxmKssb(YjxmKssb yjxmKssb);
	
	/**
     * 修改病理体检上报数据
     * 
     * @param yjxmKssb 病理体检上报数据信息
     * @return 结果
     */
	public int updateYjxmKssb(YjxmKssb yjxmKssb);
	
	/**
     * 删除病理体检上报数据
     * 
     * @param id 病理体检上报数据ID
     * @return 结果
     */
	public int deleteYjxmKssbById(Integer id);
	
	/**
     * 批量删除病理体检上报数据
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteYjxmKssbByIds(String[] ids);
	

	/**
	 * 医技科室上报
	 * @return
	 */
	public List<YjxmKssb> selectYjxmBlsb();
	
	/**
	 * 根据日期查询上报数据明细
	 * @param rq
	 * @return
	 */
	public  List<YjxmKssb> selectAllByRq(String rq);
	
	/**
	 * 根据日期查看当月上报数据是否核算过
	 * @param rq
	 * @return
	 */
	public int selectSbByRq(String rq);
}