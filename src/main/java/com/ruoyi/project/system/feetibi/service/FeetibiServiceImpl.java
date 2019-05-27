package com.ruoyi.project.system.feetibi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.support.Convert;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.project.system.feetibi.domain.Feetibi;
import com.ruoyi.project.system.feetibi.mapper.FeetibiMapper;

/**
 * 收入提比 服务层实现
 * 
 * @author panda
 * @date 2018-12-19
 */
@Service
public class FeetibiServiceImpl implements IFeetibiService 
{
	@Autowired
	private FeetibiMapper feetibiMapper;

	/**
     * 查询收入提比信息
     * 
     * @param id 收入提比ID
     * @return 收入提比信息
     */
    @Override
	public Feetibi selectFeetibiById(Integer id)
	{
	    return feetibiMapper.selectFeetibiById(id);
	}
	
	/**
     * 查询收入提比列表
     * 
     * @param feetibi 收入提比信息
     * @return 收入提比集合
     */
	@Override
	public List<Feetibi> selectFeetibiList(Feetibi feetibi)
	{
	    return feetibiMapper.selectFeetibiList(feetibi);
	}
	
    /**
     * 新增收入提比
     * 
     * @param feetibi 收入提比信息
     * @return 结果
     */
	@Override
	public int insertFeetibi(Feetibi feetibi)
	{
	    return feetibiMapper.insertFeetibi(feetibi);
	}
	
	/**
     * 修改收入提比
     * 
     * @param feetibi 收入提比信息
     * @return 结果
     */
	@Override
	public int updateFeetibi(Feetibi feetibi)
	{
	    return feetibiMapper.updateFeetibi(feetibi);
	}

	/**
     * 删除收入提比对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteFeetibiByIds(String ids)
	{
		return feetibiMapper.deleteFeetibiByIds(Convert.toStrArray(ids));
	}

    /**
     * 校验提比是否为数值类型
     * 
     * @param feetibi 提比信息
     * @return 结果
     */
	@Override
	public String checkFeeByTibi(Feetibi feetibi) {
		Feetibi info = feetibiMapper.checkFeeByTibi(feetibi.getTibi().toString());
        if (StringUtils.isNotNull(info) && feetibi.getTibi().toString()=="/^[0-9]+.?[0-9]*/")
        {
            return UserConstants.SPDEPTXM_INDEX_NOT_UNIQUE;
        }
        return UserConstants.SPDEPTXM_INDEX_UNIQUE;
	}

/*    *//**
     * 校验费用类别是否唯一
     * 
     * @param feetibi 提比信息
     * @return 结果
     *//*
	@Override
	public String checkFeeByFeeType(Feetibi feetibi) {
		Long tibid = StringUtils.isNull(feetibi.getId()) ? -1L : feetibi.getId(); 
		Feetibi info = feetibiMapper.checkFeeByFeeType(feetibi.getDeptid(), feetibi.getFeeid(), feetibi.getFlag());
		if (StringUtils.isNotNull(info) && info.getId().longValue() != tibid.longValue())
        {
            return UserConstants.SPDEPTXM_INDEXFEE_NOT_UNIQUE;
        }
        return UserConstants.SPDEPTXM_INDEXFEE_UNIQUE;
	}*/
	
}
