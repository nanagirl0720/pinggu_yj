package com.ruoyi.project.system.hisZytf.controller;

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
import com.ruoyi.project.system.hisZytf.domain.HisZytf;
import com.ruoyi.project.system.hisZytf.service.IHisZytfService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 住院退费数据 信息操作处理
 * 
 * @author panda
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/hisZytf")
public class HisZytfController extends BaseController
{
    private String prefix = "system/hisZytf";
	
	@Autowired
	private IHisZytfService hisZytfService;
	
	@RequiresPermissions("system:hisZytf:view")
	@GetMapping()
	public String hisZytf()
	{
	    return prefix + "/hisZytf";
	}
	
	/**
	 * 查询住院退费数据列表
	 */
	@RequiresPermissions("system:hisZytf:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(HisZytf hisZytf)
	{
		startPage();
        List<HisZytf> list = hisZytfService.selectHisZytfList(hisZytf);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出住院退费数据列表
	 */
	@RequiresPermissions("system:hisZytf:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HisZytf hisZytf)
    {
    	List<HisZytf> list = hisZytfService.selectHisZytfList(hisZytf);
        ExcelUtil<HisZytf> util = new ExcelUtil<HisZytf>(HisZytf.class);
        return util.exportExcel(list, "hisZytf");
    }
	
	/**
	 * 新增住院退费数据
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存住院退费数据
	 */
	@RequiresPermissions("system:hisZytf:add")
	@Log(title = "住院退费数据", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(HisZytf hisZytf)
	{		
		return toAjax(hisZytfService.insertHisZytf(hisZytf));
	}

	/**
	 * 修改住院退费数据
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		HisZytf hisZytf = hisZytfService.selectHisZytfById(id);
		mmap.put("hisZytf", hisZytf);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存住院退费数据
	 */
	@RequiresPermissions("system:hisZytf:edit")
	@Log(title = "住院退费数据", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(HisZytf hisZytf)
	{		
		return toAjax(hisZytfService.updateHisZytf(hisZytf));
	}
	
	/**
	 * 删除住院退费数据
	 */
	@RequiresPermissions("system:hisZytf:remove")
	@Log(title = "住院退费数据", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(hisZytfService.deleteHisZytfByIds(ids));
	}
	
}
