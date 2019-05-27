package com.ruoyi.project.system.feetype.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.support.Convert;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.project.system.feetype.domain.Feetype;
import com.ruoyi.project.system.feetype.mapper.FeetypeMapper;

/**
 * 费用类别 服务层实现
 * 
 * @author panda
 * @date 2018-12-18
 */
@Service
public class FeetypeServiceImpl implements IFeetypeService 
{
	@Autowired
	private FeetypeMapper feetypeMapper;

	/**
     * 查询费用类别信息
     * 
     * @param id 费用类别ID
     * @return 费用类别信息
     */
    @Override
	public Feetype selectFeetypeById(Integer id)
	{
	    return feetypeMapper.selectFeetypeById(id);
	}
	
	/**
     * 查询费用类别列表
     * 
     * @param feetype 费用类别信息
     * @return 费用类别集合
     */
	@Override
	public List<Feetype> selectFeetypeList(Feetype feetype)
	{
	    return feetypeMapper.selectFeetypeList(feetype);
	}
	
    /**
     * 新增费用类别
     * 
     * @param feetype 费用类别信息
     * @return 结果
     */
	@Override
	public int insertFeetype(Feetype feetype)
	{
	    return feetypeMapper.insertFeetype(feetype);
	}
	
	/**
     * 修改费用类别
     * 
     * @param feetype 费用类别信息
     * @return 结果
     */
	@Override
	public int updateFeetype(Feetype feetype)
	{
	    return feetypeMapper.updateFeetype(feetype);
	}

	/**
     * 删除费用类别对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteFeetypeByIds(String ids)
	{
		return feetypeMapper.deleteFeetypeByIds(Convert.toStrArray(ids));
	}

    /**
     * 校验费用类别名称是否唯一
     * 
     * @param feetype 项目信息
     * @return 结果
     */
	@Override
	public String checkFeetypeNameUnique(Feetype feetype) {
        Long feeId = StringUtils.isNull(feetype.getId()) ? -1L : feetype.getId();
        Feetype info = feetypeMapper.checkFeetypeNameUnique(feetype.getFeename());
        if (StringUtils.isNotNull(info) && info.getId().longValue() != feeId.longValue())
        {
            return UserConstants.FEETYPE_NAME_NOT_UNIQUE;
        }
        return UserConstants.FEETYPE_NAME_UNIQUE;
	}

    /**
     * 校验费用类别编码是否唯一
     * 
     * @param feetype 项目信息
     * @return 结果
     */
	@Override
	public String checkFeetypeCodeUnique(Feetype feetype) {
		Long feeId = StringUtils.isNull(feetype.getId()) ? -1L : feetype.getId();
		Feetype info = feetypeMapper.checkFeetypeCodeUnique(feetype.getFeecode());
        if (StringUtils.isNotNull(info) && info.getId().longValue() != feeId.longValue())
        {
            return UserConstants.FEETYPE_CODE_NOT_UNIQUE;
        }
        return UserConstants.FEETYPE_CODE_UNIQUE;
	}

	/**
     * 查询所有费用类别信息
     * 
     * @param feetype 费用类别信息
     * @return 费用类别集合
     */
	@Override
	public List<Feetype> selectFeetypeAll() {
		return selectFeetypeList(new Feetype());
	}
	
}
