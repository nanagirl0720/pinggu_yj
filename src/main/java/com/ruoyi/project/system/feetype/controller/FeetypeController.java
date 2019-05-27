package com.ruoyi.project.system.feetype.controller;

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

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.feetype.domain.Feetype;
import com.ruoyi.project.system.feetype.service.IFeetypeService;

/**
 * 费用类别 信息操作处理
 * 
 * @author panda
 * @date 2018-12-18
 */
@Controller
@RequestMapping("/system/feetype")
public class FeetypeController extends BaseController
{
    private String prefix = "system/feetype";
	
	@Autowired
	private IFeetypeService feetypeService;
	
	@RequiresPermissions("system:feetype:view")
	@GetMapping()
	public String feetype()
	{
	    return prefix + "/feetype";
	}
	
	/**
	 * 查询费用类别列表
	 */
	@RequiresPermissions("system:feetype:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Feetype feetype)
	{
		startPage();
        List<Feetype> list = feetypeService.selectFeetypeList(feetype);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出费用类别列表
	 */
	@RequiresPermissions("system:feetype:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Feetype feetype)
    {
    	List<Feetype> list = feetypeService.selectFeetypeList(feetype);
        ExcelUtil<Feetype> util = new ExcelUtil<Feetype>(Feetype.class);
        return util.exportExcel(list, "feetype");
    }
	
	/**
	 * 新增费用类别
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存费用类别
	 */
	@RequiresPermissions("system:feetype:add")
	@Log(title = "费用类别", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Feetype feetype)
	{		
		return toAjax(feetypeService.insertFeetype(feetype));
	}

	/**
	 * 修改费用类别
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Feetype feetype = feetypeService.selectFeetypeById(id);
		mmap.put("feetype", feetype);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存费用类别
	 */
	@RequiresPermissions("system:feetype:edit")
	@Log(title = "费用类别", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Feetype feetype)
	{		
		return toAjax(feetypeService.updateFeetype(feetype));
	}
	
	/**
	 * 删除费用类别
	 */
	@RequiresPermissions("system:feetype:remove")
	@Log(title = "费用类别", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(feetypeService.deleteFeetypeByIds(ids));
	}
	
    /**
     * 校验费用类别名称
     */
    @PostMapping("/checkFeetypeNameUnique")
    @ResponseBody
    public String checkSpdeptXmNameUnique(Feetype feetype)
    {
        return feetypeService.checkFeetypeNameUnique(feetype);
    }

    /**
     * 校验费用类别编码
     */
    @PostMapping("/checkPostCodeUnique")
    @ResponseBody
    public String checkPostCodeUnique(Feetype feetype)
    {
        return feetypeService.checkFeetypeCodeUnique(feetype);
    }
	
}
