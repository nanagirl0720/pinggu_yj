package com.ruoyi.project.system.yjhsXmgzl.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.yjhsXmgzl.mapper.YjhsXmgzlMapper;
import com.ruoyi.project.system.yjhsXmgzl.domain.YjhsXmgzl;
import com.ruoyi.project.system.yjhsXmgzl.service.IYjhsXmgzlService;
import com.ruoyi.common.support.Convert;

/**
 * 医技核算项目工作量 服务层实现
 * 
 * @author panda
 * @date 2019-05-30
 */
@Service
public class YjhsXmgzlServiceImpl implements IYjhsXmgzlService 
{
	@Autowired
	private YjhsXmgzlMapper yjhsXmgzlMapper;

	/**
     * 查询医技核算项目工作量信息
     * 
     * @param id 医技核算项目工作量ID
     * @return 医技核算项目工作量信息
     */
    @Override
	public YjhsXmgzl selectYjhsXmgzlById(Integer id)
	{
	    return yjhsXmgzlMapper.selectYjhsXmgzlById(id);
	}
	
	/**
     * 查询医技核算项目工作量列表
     * 
     * @param yjhsXmgzl 医技核算项目工作量信息
     * @return 医技核算项目工作量集合
     */
	@Override
	public List<YjhsXmgzl> selectYjhsXmgzlList(YjhsXmgzl yjhsXmgzl)
	{
	    return yjhsXmgzlMapper.selectYjhsXmgzlList(yjhsXmgzl);
	}
	
    /**
     * 新增医技核算项目工作量
     * 
     * @param yjhsXmgzl 医技核算项目工作量信息
     * @return 结果
     */
	@Override
	public int insertYjhsXmgzl(YjhsXmgzl yjhsXmgzl)
	{
	    return yjhsXmgzlMapper.insertYjhsXmgzl(yjhsXmgzl);
	}
	
	/**
     * 修改医技核算项目工作量
     * 
     * @param yjhsXmgzl 医技核算项目工作量信息
     * @return 结果
     */
	@Override
	public int updateYjhsXmgzl(YjhsXmgzl yjhsXmgzl)
	{
	    return yjhsXmgzlMapper.updateYjhsXmgzl(yjhsXmgzl);
	}

	/**
     * 删除医技核算项目工作量对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteYjhsXmgzlByIds(String ids)
	{
		return yjhsXmgzlMapper.deleteYjhsXmgzlByIds(Convert.toStrArray(ids));
	}
	
	
	@Override
	public int selectSbgzlByRq(String rq) {
		return yjhsXmgzlMapper.selectSbgzlByRq(rq);
	}

	/***
	 * 按照日期查询查看当前日期是否核算过工作量
	 */
	@Override
	public int selectYjhsXmgzlByRq(String rq) {
		return  yjhsXmgzlMapper.selectYjhsXmgzlByRq(rq);
	}

	/**
	 * 开始核算：查询医技项目工作量
	 * @return
	 */
	@Override
	public List<YjhsXmgzl> selectYjhsXmgzlByRiq(String rq) {
		List<YjhsXmgzl> yjhsXmgzlList=yjhsXmgzlMapper.selectYjhsXmgzlByRiq(rq);
		return yjhsXmgzlList;
	}

	
	
	@Override
	public List<YjhsXmgzl> selectAllByRq(String rq) {
		return yjhsXmgzlMapper.selectAllByRq(rq);
	}
	
	
}
