package com.ruoyi.project.system.spdeptXm.controller;

import java.io.InputStream;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.dept.service.IDeptService;
import com.ruoyi.project.system.spdeptXm.domain.SpdeptXm;
import com.ruoyi.project.system.spdeptXm.service.ISpdeptXmService;

/**
 * 特殊科室操作项目 信息操作处理
 * 
 * @author panda
 * @date 2018-12-18
 */
@Controller
@RequestMapping("/system/spdeptXm")
public class SpdeptXmController extends BaseController
{
    private String prefix = "system/spdeptXm";
	
	@Autowired
	private ISpdeptXmService spdeptXmService;
	
	@Autowired
	private IDeptService deptService;
	
	@RequiresPermissions("system:spdeptXm:view")
	@GetMapping()
	public String spdeptXm(HttpSession session)
	{
		session.setAttribute("list", deptService.selectDeptAll());
	    return prefix + "/spdeptXm";
	}
	
	/**
	 * 查询特殊科室操作项目列表
	 */
	@RequiresPermissions("system:spdeptXm:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(SpdeptXm spdeptXm)
	{
		startPage();
        List<SpdeptXm> list = spdeptXmService.selectSpdeptXmList(spdeptXm);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出特殊科室操作项目列表
	 */
	@RequiresPermissions("system:spdeptXm:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SpdeptXm spdeptXm)
    {
    	List<SpdeptXm> list = spdeptXmService.selectSpdeptXmList(spdeptXm);
        ExcelUtil<SpdeptXm> util = new ExcelUtil<SpdeptXm>(SpdeptXm.class);
        return util.exportExcel(list, "spdeptXm");
    }
	
	/**
	 * 新增特殊科室操作项目
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存特殊科室操作项目
	 */
	@RequiresPermissions("system:spdeptXm:add")
	@Log(title = "特殊科室操作项目", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(SpdeptXm spdeptXm)
	{		
		return toAjax(spdeptXmService.insertSpdeptXm(spdeptXm));
	}
	
	/**
	 * 导入特殊科室操作项目
	 */
	@GetMapping("/importexcel")
	public String importexcel()
	{
	    return prefix + "/importexcel";
	}
	
	/**
	 * 导入保存特殊科室操作项目
	 * @throws Exception 
	 */
	@RequiresPermissions("system:spdeptXm:importexcel")
	@Log(title = "导入特殊科室操作项目", businessType = BusinessType.INSERT)
	@PostMapping("/importexcel")
	@ResponseBody
	public List<SpdeptXm> importexcel(@RequestParam("file") MultipartFile file) throws Exception 
	{
		InputStream input = file.getInputStream();
		ExcelUtil<SpdeptXm> util = new ExcelUtil<SpdeptXm>(SpdeptXm.class);
		List<SpdeptXm> xmlist = util.importExcel(input);
		
		return xmlist;
	}
	
	/**
	 * 修改特殊科室操作项目
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		SpdeptXm spdeptXm = spdeptXmService.selectSpdeptXmById(id);
		mmap.put("spdeptXm", spdeptXm);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存特殊科室操作项目
	 */
	@RequiresPermissions("system:spdeptXm:edit")
	@Log(title = "特殊科室操作项目", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(SpdeptXm spdeptXm)
	{		
		return toAjax(spdeptXmService.updateSpdeptXm(spdeptXm));
	}
	
	/**
	 * 删除特殊科室操作项目
	 */
	@RequiresPermissions("system:spdeptXm:remove")
	@Log(title = "特殊科室操作项目", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(spdeptXmService.deleteSpdeptXmByIds(ids));
	}
	
    /**
     * 校验项目名称
     */
    @PostMapping("/checkSpdeptXmNameUnique")
    @ResponseBody
    public String checkSpdeptXmNameUnique(SpdeptXm spdeptXm)
    {
        return spdeptXmService.checkSpdeptXmNameUnique(spdeptXm);
    }

    /**
     * 校验项目编码
     */
    @PostMapping("/checkSpdeptXmCodeUnique")
    @ResponseBody
    public String checkPostCodeUnique(SpdeptXm spdeptXm)
    {
        return spdeptXmService.checkSpdeptXmCodeUnique(spdeptXm);
    }
	
}
