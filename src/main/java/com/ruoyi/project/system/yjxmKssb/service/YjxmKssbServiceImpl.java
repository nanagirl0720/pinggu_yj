package com.ruoyi.project.system.yjxmKssb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.yjxmKssb.mapper.YjxmKssbMapper;
import com.ruoyi.project.system.yjxmKssb.domain.YjxmKssb;
import com.ruoyi.project.system.yjxmKssb.service.IYjxmKssbService;
import com.ruoyi.common.support.Convert;

/**
 * 病理体检上报数据 服务层实现
 * 
 * @author panda
 * @date 2019-05-31
 */
@Service
public class YjxmKssbServiceImpl implements IYjxmKssbService 
{
	@Autowired
	private YjxmKssbMapper yjxmKssbMapper;

	/**
     * 查询病理体检上报数据信息
     * 
     * @param id 病理体检上报数据ID
     * @return 病理体检上报数据信息
     */
    @Override
	public YjxmKssb selectYjxmKssbById(Integer id)
	{
	    return yjxmKssbMapper.selectYjxmKssbById(id);
	}
	
	/**
     * 查询病理体检上报数据列表
     * 
     * @param yjxmKssb 病理体检上报数据信息
     * @return 病理体检上报数据集合
     */
	@Override
	public List<YjxmKssb> selectYjxmKssbList(YjxmKssb yjxmKssb)
	{
	    return yjxmKssbMapper.selectYjxmKssbList(yjxmKssb);
	}
	
    /**
     * 新增病理体检上报数据
     * 
     * @param yjxmKssb 病理体检上报数据信息
     * @return 结果
     */
	@Override
	public int insertYjxmKssb(YjxmKssb yjxmKssb)
	{
	    return yjxmKssbMapper.insertYjxmKssb(yjxmKssb);
	}
	
	/**
     * 修改病理体检上报数据
     * 
     * @param yjxmKssb 病理体检上报数据信息
     * @return 结果
     */
	@Override
	public int updateYjxmKssb(YjxmKssb yjxmKssb)
	{
	    return yjxmKssbMapper.updateYjxmKssb(yjxmKssb);
	}

	/**
     * 删除病理体检上报数据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteYjxmKssbByIds(String ids)
	{
		return yjxmKssbMapper.deleteYjxmKssbByIds(Convert.toStrArray(ids));
	}


	@Override
	public List<YjxmKssb> selectYjxmBlsb() {
		return yjxmKssbMapper.selectYjxmBlsb();
	}

	
	@Override
	public List<YjxmKssb> selectAllByRq(String rq) {
		return yjxmKssbMapper.selectAllByRq(rq);
	}


	@Override
	public int selectSbByRq(String rq) {
		return yjxmKssbMapper.selectSbByRq(rq);
	}


	
	
}
