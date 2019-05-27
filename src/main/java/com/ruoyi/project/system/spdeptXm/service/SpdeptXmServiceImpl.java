package com.ruoyi.project.system.spdeptXm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.support.Convert;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.project.system.spdeptXm.domain.SpdeptXm;
import com.ruoyi.project.system.spdeptXm.mapper.SpdeptXmMapper;

/**
 * 特殊科室操作项目 服务层实现
 * 
 * @author panda
 * @date 2018-12-18
 */
@Service
public class SpdeptXmServiceImpl implements ISpdeptXmService 
{
	@Autowired
	private SpdeptXmMapper spdeptXmMapper;

	/**
     * 查询特殊科室操作项目信息
     * 
     * @param id 特殊科室操作项目ID
     * @return 特殊科室操作项目信息
     */
    @Override
	public SpdeptXm selectSpdeptXmById(Integer id)
	{
	    return spdeptXmMapper.selectSpdeptXmById(id);
	}
    
	/**
     * 查询特殊科室操作项目列表
     * 
     * @param spdeptXm 特殊科室操作项目信息
     * @return 特殊科室操作项目集合
     */
	@Override
	public List<SpdeptXm> selectSpdeptXmList(SpdeptXm spdeptXm)
	{
	    return spdeptXmMapper.selectSpdeptXmList(spdeptXm);
	}
	
    /**
     * 新增特殊科室操作项目
     * 
     * @param spdeptXm 特殊科室操作项目信息
     * @return 结果
     */
	@Override
	public int insertSpdeptXm(SpdeptXm spdeptXm)
	{
		spdeptXm.setCreateBy(ShiroUtils.getLoginName());
	    return spdeptXmMapper.insertSpdeptXm(spdeptXm);
	}
	
	/**
     * 修改特殊科室操作项目
     * 
     * @param spdeptXm 特殊科室操作项目信息
     * @return 结果
     */
	@Override
	public int updateSpdeptXm(SpdeptXm spdeptXm)
	{
	    return spdeptXmMapper.updateSpdeptXm(spdeptXm);
	}

	/**
     * 删除特殊科室操作项目对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteSpdeptXmByIds(String ids)
	{
		return spdeptXmMapper.deleteSpdeptXmByIds(Convert.toStrArray(ids));
	}
	
    /**
     * 校验项目名称是否唯一
     * 
     * @param spdeptXm 项目信息
     * @return 结果
     */
	@Override
	public String checkSpdeptXmNameUnique(SpdeptXm spdeptXm) {
        Long xmId = StringUtils.isNull(spdeptXm.getId()) ? -1L : spdeptXm.getId();
        SpdeptXm info = spdeptXmMapper.checkSpdeptXmNameUnique(spdeptXm.getXmname());
        if (StringUtils.isNotNull(info) && info.getId().longValue() != xmId.longValue())
        {
            return UserConstants.SPDEPTXM_NAME_NOT_UNIQUE;
        }
        return UserConstants.SPDEPTXM_NAME_UNIQUE;
	}
	
    /**
     * 校验项目编码是否唯一
     * 
     * @param spdeptXm 项目信息
     * @return 结果
     */
	@Override
	public String checkSpdeptXmCodeUnique(SpdeptXm spdeptXm) {
        Long xmId = StringUtils.isNull(spdeptXm.getId()) ? -1L : spdeptXm.getId();
        SpdeptXm info = spdeptXmMapper.checkSpdeptXmCodeUnique(spdeptXm.getXmcode());
        if (StringUtils.isNotNull(info) && info.getId().longValue() != xmId.longValue())
        {
            return UserConstants.SPDEPTXM_CODE_NOT_UNIQUE;
        }
        return UserConstants.SPDEPTXM_CODE_UNIQUE;
	}

	/***/
	@Override
	public String checkSpdeptXmCodeList(String xmcode) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
