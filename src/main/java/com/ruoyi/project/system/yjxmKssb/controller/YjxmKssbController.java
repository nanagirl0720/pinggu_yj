package com.ruoyi.project.system.yjxmKssb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.yjjx.domin.Yjxm;
import com.ruoyi.project.system.yjjx.service.YjxmService;
import com.ruoyi.project.system.yjxmKssb.domain.YjxmKssb;
import com.ruoyi.project.system.yjxmKssb.service.IYjxmKssbService;

/**
 * 病理体检上报数据 信息操作处理
 * 
 * @author panda
 * @date 2019-05-31
 */
@Controller
@RequestMapping("/system/yjxmKssb")
public class YjxmKssbController extends BaseController
{
    private String prefix = "system/yjxmKssb";
	
	@Autowired
	private IYjxmKssbService yjxmKssbService;
	
	@Autowired
	private YjxmService yjxmService;
	
	@RequiresPermissions("system:yjxmKssb:view")
	@GetMapping()
	public String yjxmKssb()
	{
	    return prefix + "/yjxmKssb";
	}
	
	/**
	 * 查询病理体检上报数据列表
	 */
	@RequiresPermissions("system:yjxmKssb:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(YjxmKssb yjxmKssb)
	{
		startPage();
        List<YjxmKssb> list = yjxmKssbService.selectYjxmBlsb();
		return getDataTable(list);
	}
	
	
	/**
	 * 导出病理体检上报数据列表
	 */
	@RequiresPermissions("system:yjxmKssb:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(YjxmKssb yjxmKssb)
    {
    	List<YjxmKssb> list = yjxmKssbService.selectYjxmKssbList(yjxmKssb);
        ExcelUtil<YjxmKssb> util = new ExcelUtil<YjxmKssb>(YjxmKssb.class);
        return util.exportExcel(list, "yjxmKssb");
    }
	
	/**
	 * 新增病理体检上报数据
	 */
	@GetMapping("/add")
	public String add(String xmid,HttpSession session )
	{
		List<Yjxm> yjxmList=yjxmService.selectYjxmByKssb(xmid);
		session.setAttribute("list", yjxmList);
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存病理体检上报数据
	 */
	@RequiresPermissions("system:yjxmKssb:add")
	@Log(title = "病理体检上报数据", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(YjxmKssb yjxmKssb)
	{		
		return toAjax(yjxmKssbService.insertYjxmKssb(yjxmKssb));
	}

	/**
	 * 修改病理体检上报数据
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		YjxmKssb yjxmKssb = yjxmKssbService.selectYjxmKssbById(id);
		mmap.put("yjxmKssb", yjxmKssb);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存病理体检上报数据
	 */
	@RequiresPermissions("system:yjxmKssb:edit")
	@Log(title = "病理体检上报数据", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(YjxmKssb yjxmKssb)
	{		
		return toAjax(yjxmKssbService.updateYjxmKssb(yjxmKssb));
	}
	
	/**
	 * 删除病理体检上报数据
	 */
	@RequiresPermissions("system:yjxmKssb:remove")
	@Log(title = "病理体检上报数据", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(yjxmKssbService.deleteYjxmKssbByIds(ids));
	}
	
}
