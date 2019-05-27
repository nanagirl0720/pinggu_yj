package com.ruoyi.project.system.mzkdsr.controller;

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

import com.ruoyi.common.utils.DataUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.mzkdsr.domain.Mzkdsr;
import com.ruoyi.project.system.mzkdsr.service.IMzkdsrService;

/**
 * 门诊开单收入数据 信息操作处理
 * 
 * @author panda
 * @date 2018-12-25
 */
@Controller
@RequestMapping("/system/mzkdsr")
public class MzkdsrController extends BaseController
{
    private String prefix = "system/mzkdsr";
	
	@Autowired
	private IMzkdsrService mzkdsrService;
	
	@RequiresPermissions("system:mzkdsr:view")
	@GetMapping()
	public String mzkdsr()
	{
	    return prefix + "/mzkdsr";
	}
	
	/**
	 * 查询门诊开单收入数据列表
	 */
	@RequiresPermissions("system:mzkdsr:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Mzkdsr mzkdsr)
	{
		startPage();
        List<Mzkdsr> list = mzkdsrService.selectMzkdsrList(mzkdsr);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出门诊开单收入数据列表
	 */
	@RequiresPermissions("system:mzkdsr:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Mzkdsr mzkdsr)
    {
    	List<Mzkdsr> list = mzkdsrService.selectMzkdsrList(mzkdsr);
        ExcelUtil<Mzkdsr> util = new ExcelUtil<Mzkdsr>(Mzkdsr.class);
        return util.exportExcel(list, "mzkdsr");
    }
	
	/**
	 * 新增门诊开单收入数据
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存门诊开单收入数据
	 */
	@RequiresPermissions("system:mzkdsr:add")
	@Log(title = "门诊开单收入数据", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Mzkdsr mzkdsr)
	{		
		return toAjax(mzkdsrService.insertMzkdsr(mzkdsr));
	}

	/**
	 * 修改门诊开单收入数据
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Mzkdsr mzkdsr = mzkdsrService.selectMzkdsrById(id);
		mmap.put("mzkdsr", mzkdsr);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存门诊开单收入数据
	 */
	@RequiresPermissions("system:mzkdsr:edit")
	@Log(title = "门诊开单收入数据", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Mzkdsr mzkdsr)
	{		
		return toAjax(mzkdsrService.updateMzkdsr(mzkdsr));
	}
	
	/**
	 * 删除门诊开单收入数据
	 */
	@RequiresPermissions("system:mzkdsr:remove")
	@Log(title = "门诊开单收入数据", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(mzkdsrService.deleteMzkdsrByIds(ids));
	}
	
	/**
	 * 门诊开单提纯收入核算
	 */
	@RequiresPermissions("system:mzkdsr:mzaccounting")
	@Log(title = "门诊开单收入提纯", businessType = BusinessType.OTHER)
	@PostMapping("/mzaccounting")
	@ResponseBody
	public String mzaccounting(Mzkdsr mzkdsr)
	{	
		DataUtils dataUtils = new DataUtils();
		dataUtils.MzKdSr(mzkdsr.getTjdata());
		return prefix + "/mzkdsr";
	}
	
}
