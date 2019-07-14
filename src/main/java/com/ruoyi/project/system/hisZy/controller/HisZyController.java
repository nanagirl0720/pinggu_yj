package com.ruoyi.project.system.hisZy.controller;

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
import com.ruoyi.project.system.hisZy.domain.HisZy;
import com.ruoyi.project.system.hisZy.service.IHisZyService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 住院收费数据 信息操作处理
 * 
 * @author panda
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/hisZy")
public class HisZyController extends BaseController
{
    private String prefix = "system/hisZy";
	
	@Autowired
	private IHisZyService hisZyService;
	
	@RequiresPermissions("system:hisZy:view")
	@GetMapping()
	public String hisZy()
	{
	    return prefix + "/hisZy";
	}
	
	/**
	 * 查询住院收费数据列表
	 */
	@RequiresPermissions("system:hisZy:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(HisZy hisZy)
	{
		startPage();
        List<HisZy> list = hisZyService.selectHisZyList(hisZy);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出住院收费数据列表
	 */
	@RequiresPermissions("system:hisZy:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HisZy hisZy)
    {
    	List<HisZy> list = hisZyService.selectHisZyList(hisZy);
        ExcelUtil<HisZy> util = new ExcelUtil<HisZy>(HisZy.class);
        return util.exportExcel(list, "hisZy");
    }
	
	/**
	 * 新增住院收费数据
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存住院收费数据
	 */
	@RequiresPermissions("system:hisZy:add")
	@Log(title = "住院收费数据", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(HisZy hisZy)
	{		
		return toAjax(hisZyService.insertHisZy(hisZy));
	}

	/**
	 * 修改住院收费数据
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		HisZy hisZy = hisZyService.selectHisZyById(id);
		mmap.put("hisZy", hisZy);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存住院收费数据
	 */
	@RequiresPermissions("system:hisZy:edit")
	@Log(title = "住院收费数据", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(HisZy hisZy)
	{		
		return toAjax(hisZyService.updateHisZy(hisZy));
	}
	
	/**
	 * 删除住院收费数据
	 */
	@RequiresPermissions("system:hisZy:remove")
	@Log(title = "住院收费数据", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(hisZyService.deleteHisZyByIds(ids));
	}
	
}
