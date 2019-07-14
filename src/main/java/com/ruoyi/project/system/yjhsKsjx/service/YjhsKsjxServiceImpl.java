package com.ruoyi.project.system.yjhsKsjx.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.yjhsKsjx.mapper.YjhsKsjxMapper;
import com.ruoyi.project.system.yjhsKsjx.domain.YjhsKsjx;
import com.ruoyi.project.system.yjhsKsjx.service.IYjhsKsjxService;
import com.ruoyi.common.support.Convert;

/**
 * 医技核算绩效 服务层实现
 * 
 * @author panda
 * @date 2019-05-30
 */
@Service
public class YjhsKsjxServiceImpl implements IYjhsKsjxService 
{
	@Autowired
	private YjhsKsjxMapper yjhsKsjxMapper;

	/**
     * 查询医技核算绩效信息
     * 
     * @param id 医技核算绩效ID
     * @return 医技核算绩效信息
     */
    @Override
	public YjhsKsjx selectYjhsKsjxById(Integer id)
	{
	    return yjhsKsjxMapper.selectYjhsKsjxById(id);
	}
	
	/**
     * 查询医技核算绩效列表
     * 
     * @param yjhsKsjx 医技核算绩效信息
     * @return 医技核算绩效集合
     */
	@Override
	public List<YjhsKsjx> selectYjhsKsjxList(YjhsKsjx yjhsKsjx)
	{
	    return yjhsKsjxMapper.selectYjhsKsjxList(yjhsKsjx);
	}
	
    /**
     * 新增医技核算绩效
     * 
     * @param yjhsKsjx 医技核算绩效信息
     * @return 结果
     */
	@Override
	public int insertYjhsKsjx(YjhsKsjx yjhsKsjx)
	{
	    return yjhsKsjxMapper.insertYjhsKsjx(yjhsKsjx);
	}
	
	/**
     * 修改医技核算绩效
     * 
     * @param yjhsKsjx 医技核算绩效信息
     * @return 结果
     */
	@Override
	public int updateYjhsKsjx(YjhsKsjx yjhsKsjx)
	{
	    return yjhsKsjxMapper.updateYjhsKsjx(yjhsKsjx);
	}

	/**
     * 删除医技核算绩效对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteYjhsKsjxByIds(String ids)
	{
		return yjhsKsjxMapper.deleteYjhsKsjxByIds(Convert.toStrArray(ids));
	}

	/**
	 * 查询当前日期是否核算
	 */
	@Override
	public int selectYjhsKsjxByRq(String rq) {
		int result=yjhsKsjxMapper.selectYjhsKsjxByRq(rq);
		return result;
	}

	/**
	 * 查询当月医技工作量绩效
	 * @return
	 */
	@Override
	public List<YjhsKsjx> selectYjjx() {
		List<YjhsKsjx> yjhsKsjxList=yjhsKsjxMapper.selectYjjx();
		return yjhsKsjxList;
	}
	
	
	
}
