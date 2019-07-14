package com.ruoyi.project.system.yjhsKsjx.controller;

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
import com.ruoyi.project.system.yjhsKsjx.domain.YjhsKsjx;
import com.ruoyi.project.system.yjhsKsjx.service.IYjhsKsjxService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 医技核算绩效 信息操作处理
 * 
 * @author panda
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/system/yjhsKsjx")
public class YjhsKsjxController extends BaseController
{
    private String prefix = "system/yjhsKsjx";
	
	@Autowired
	private IYjhsKsjxService yjhsKsjxService;
	
	@RequiresPermissions("system:yjhsKsjx:view")
	@GetMapping()
	public String yjhsKsjx()
	{
	    return prefix + "/yjhsKsjx";
	}
	
	/**
	 * 查询医技核算绩效列表
	 */
	@RequiresPermissions("system:yjhsKsjx:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(YjhsKsjx yjhsKsjx)
	{
		startPage();
        List<YjhsKsjx> list = yjhsKsjxService.selectYjhsKsjxList(yjhsKsjx);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出医技核算绩效列表
	 */
	@RequiresPermissions("system:yjhsKsjx:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(YjhsKsjx yjhsKsjx)
    {
    	List<YjhsKsjx> list = yjhsKsjxService.selectYjhsKsjxList(yjhsKsjx);
        ExcelUtil<YjhsKsjx> util = new ExcelUtil<YjhsKsjx>(YjhsKsjx.class);
        return util.exportExcel(list, "yjhsKsjx");
    }
	
	/**
	 * 新增医技核算绩效
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存医技核算绩效
	 */
	@RequiresPermissions("system:yjhsKsjx:add")
	@Log(title = "医技核算绩效", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(YjhsKsjx yjhsKsjx)
	{		
		return toAjax(yjhsKsjxService.insertYjhsKsjx(yjhsKsjx));
	}

	/**
	 * 修改医技核算绩效
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		YjhsKsjx yjhsKsjx = yjhsKsjxService.selectYjhsKsjxById(id);
		mmap.put("yjhsKsjx", yjhsKsjx);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存医技核算绩效
	 */
	@RequiresPermissions("system:yjhsKsjx:edit")
	@Log(title = "医技核算绩效", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(YjhsKsjx yjhsKsjx)
	{		
		return toAjax(yjhsKsjxService.updateYjhsKsjx(yjhsKsjx));
	}
	
	/**
	 * 删除医技核算绩效
	 */
	@RequiresPermissions("system:yjhsKsjx:remove")
	@Log(title = "医技核算绩效", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(yjhsKsjxService.deleteYjhsKsjxByIds(ids));
	}
	
}
