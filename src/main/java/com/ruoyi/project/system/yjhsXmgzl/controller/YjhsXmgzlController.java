package com.ruoyi.project.system.yjhsXmgzl.controller;

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
import com.ruoyi.project.system.yjhsXmgzl.domain.YjhsXmgzl;
import com.ruoyi.project.system.yjhsXmgzl.service.IYjhsXmgzlService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 医技核算项目工作量 信息操作处理
 * 
 * @author panda
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/yjhsXmgzl")
public class YjhsXmgzlController extends BaseController
{
    private String prefix = "system/yjhsXmgzl";
	
	@Autowired
	private IYjhsXmgzlService yjhsXmgzlService;
	
	@RequiresPermissions("system:yjhsXmgzl:view")
	@GetMapping()
	public String yjhsXmgzl()
	{
	    return prefix + "/yjhsXmgzl";
	}
	
	/**
	 * 查询医技核算项目工作量列表
	 */
	@RequiresPermissions("system:yjhsXmgzl:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(YjhsXmgzl yjhsXmgzl)
	{
		startPage();
        List<YjhsXmgzl> list = yjhsXmgzlService.selectYjhsXmgzlList(yjhsXmgzl);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出医技核算项目工作量列表
	 */
	@RequiresPermissions("system:yjhsXmgzl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(YjhsXmgzl yjhsXmgzl)
    {
    	List<YjhsXmgzl> list = yjhsXmgzlService.selectYjhsXmgzlList(yjhsXmgzl);
        ExcelUtil<YjhsXmgzl> util = new ExcelUtil<YjhsXmgzl>(YjhsXmgzl.class);
        return util.exportExcel(list, "yjhsXmgzl");
    }
	
	/**
	 * 新增医技核算项目工作量
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存医技核算项目工作量
	 */
	@RequiresPermissions("system:yjhsXmgzl:add")
	@Log(title = "医技核算项目工作量", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(YjhsXmgzl yjhsXmgzl)
	{		
		return toAjax(yjhsXmgzlService.insertYjhsXmgzl(yjhsXmgzl));
	}

	/**
	 * 修改医技核算项目工作量
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		YjhsXmgzl yjhsXmgzl = yjhsXmgzlService.selectYjhsXmgzlById(id);
		mmap.put("yjhsXmgzl", yjhsXmgzl);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存医技核算项目工作量
	 */
	@RequiresPermissions("system:yjhsXmgzl:edit")
	@Log(title = "医技核算项目工作量", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(YjhsXmgzl yjhsXmgzl)
	{		
		return toAjax(yjhsXmgzlService.updateYjhsXmgzl(yjhsXmgzl));
	}
	
	/**
	 * 删除医技核算项目工作量
	 */
	@RequiresPermissions("system:yjhsXmgzl:remove")
	@Log(title = "医技核算项目工作量", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(yjhsXmgzlService.deleteYjhsXmgzlByIds(ids));
	}
	
}
