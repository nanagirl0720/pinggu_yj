package com.ruoyi.project.system.feetibi.mapper;

import com.ruoyi.project.system.feetibi.domain.Feetibi;
import java.util.List;	

/**
 * 收入提比 数据层
 * 
 * @author panda
 * @date 2018-12-19
 */
public interface FeetibiMapper 
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
     * 删除收入提比
     * 
     * @param id 收入提比ID
     * @return 结果
     */
	public int deleteFeetibiById(Integer id);
	
	/**
     * 批量删除收入提比
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteFeetibiByIds(String[] ids);
	
    /**
     * 校验提比类型格式
     * 
     * @param tibi 提比值
     * @return 结果
     */
	public Feetibi checkFeeByTibi(String tibi);
	
    /**
     * 校验费用类别是否存在
     * 
     * @param deptid 科室
     * @param feeid 费用类别
     * @param flag 数据来源
     * @return 结果
     */
	public Feetibi checkFeeByFeeType(Integer deptid,Integer feeid,Integer flag);
}