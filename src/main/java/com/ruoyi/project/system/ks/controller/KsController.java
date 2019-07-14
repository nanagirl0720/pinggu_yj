package com.ruoyi.project.system.ks.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.ks.domain.Ks;
import com.ruoyi.project.system.ks.service.IKsService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 科室字典 信息操作处理
 * 
 * @author panda
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/ks")
public class KsController extends BaseController
{
    private String prefix = "system/ks";
	
	@Autowired
	private IKsService ksService;
	
	@RequiresPermissions("system:ks:view")
	@GetMapping()
	public String ks()
	{
	    return prefix + "/ks";
	}
	
	/**
	 * 查询科室字典列表
	 */
	@RequiresPermissions("system:ks:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Ks ks)
	{
		startPage();
        List<Ks> list = ksService.selectKsList(ks);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出科室字典列表
	 */
	@RequiresPermissions("system:ks:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ks ks)
    {
    	List<Ks> list = ksService.selectKsList(ks);
        ExcelUtil<Ks> util = new ExcelUtil<Ks>(Ks.class);
        return util.exportExcel(list, "ks");
    }
	
	/**
	 * 新增科室字典
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存科室字典
	 */
	@RequiresPermissions("system:ks:add")
	@Log(title = "科室字典", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Ks ks)
	{		
		return toAjax(ksService.insertKs(ks));
	}

	/**
	 * 修改科室字典
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Ks ks = ksService.selectKsById(id);
		mmap.put("ks", ks);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存科室字典
	 */
	@RequiresPermissions("system:ks:edit")
	@Log(title = "科室字典", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Ks ks)
	{		
		return toAjax(ksService.updateKs(ks));
	}
	
	/**
	 * 删除科室字典
	 */
	@RequiresPermissions("system:ks:remove")
	@Log(title = "科室字典", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(ksService.deleteKsByIds(ids));
	}
	
}
