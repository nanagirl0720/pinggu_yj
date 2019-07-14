package com.ruoyi.project.system.hisMz.controller;

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
import com.ruoyi.project.system.hisMz.domain.HisMz;
import com.ruoyi.project.system.hisMz.service.IHisMzService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 门诊收费数据 信息操作处理
 * 
 * @author panda
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/hisMz")
public class HisMzController extends BaseController
{
    private String prefix = "system/hisMz";
	
	@Autowired
	private IHisMzService hisMzService;
	
	@RequiresPermissions("system:hisMz:view")
	@GetMapping()
	public String hisMz()
	{
	    return prefix + "/hisMz";
	}
	
	/**
	 * 查询门诊收费数据列表
	 */
	@RequiresPermissions("system:hisMz:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(HisMz hisMz)
	{
		startPage();
        List<HisMz> list = hisMzService.selectHisMzList(hisMz);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出门诊收费数据列表
	 */
	@RequiresPermissions("system:hisMz:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HisMz hisMz)
    {
    	List<HisMz> list = hisMzService.selectHisMzList(hisMz);
        ExcelUtil<HisMz> util = new ExcelUtil<HisMz>(HisMz.class);
        return util.exportExcel(list, "hisMz");
    }
	
	/**
	 * 新增门诊收费数据
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存门诊收费数据
	 */
	@RequiresPermissions("system:hisMz:add")
	@Log(title = "门诊收费数据", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(HisMz hisMz)
	{		
		return toAjax(hisMzService.insertHisMz(hisMz));
	}

	/**
	 * 修改门诊收费数据
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		HisMz hisMz = hisMzService.selectHisMzById(id);
		mmap.put("hisMz", hisMz);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存门诊收费数据
	 */
	@RequiresPermissions("system:hisMz:edit")
	@Log(title = "门诊收费数据", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(HisMz hisMz)
	{		
		return toAjax(hisMzService.updateHisMz(hisMz));
	}
	
	/**
	 * 删除门诊收费数据
	 */
	@RequiresPermissions("system:hisMz:remove")
	@Log(title = "门诊收费数据", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(hisMzService.deleteHisMzByIds(ids));
	}
	
}
