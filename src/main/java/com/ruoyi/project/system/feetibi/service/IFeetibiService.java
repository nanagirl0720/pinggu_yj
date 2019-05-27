package com.ruoyi.project.system.feetibi.service;

import com.ruoyi.project.system.feetibi.domain.Feetibi;
import java.util.List;

/**
 * 收入提比 服务层
 * 
 * @author panda
 * @date 2018-12-19
 */
public interface IFeetibiService 
{
	/**
     * 查询收入提比信息
     * 
     * @param id 收入提比ID
     * @return 收入提比信息
     */
	public Feetibi selectFeetibiById(Integer id);
	
	/**
     * 查询收入提比列表
     * 
     * @param feetibi 收入提比信息
     * @return 收入提比集合
     */
	public List<Feetibi> selectFeetibiList(Feetibi feetibi);
	
	/**
     * 新增收入提比
     * 
     * @param feetibi 收入提比信息
     * @return 结果
     */
	public int insertFeetibi(Feetibi feetibi);
	
	/**
     * 修改收入提比
     * 
     * @param feetibi 收入提比信息
     * @return 结果
     */
	public int updateFeetibi(Feetibi feetibi);
		
	/**
     * 删除收入提比信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteFeetibiByIds(String ids);
	
    /**
     * 校验提比类型格式
     * 
     * @param feetibi 提比信息
     * @return 结果
     */
	public String checkFeeByTibi(Feetibi feetibi);
	
/*    *//**
     * 校验费用类型是否存在
     * 
     * @param feetibi 提比信息
     * @return 结果
     *//*
	public String checkFeeByFeeType(Feetibi feetibi);*/
}
