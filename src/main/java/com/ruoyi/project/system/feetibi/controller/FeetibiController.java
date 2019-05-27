package com.ruoyi.project.system.feetibi.controller;

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
import com.ruoyi.project.system.dept.service.IDeptService;
import com.ruoyi.project.system.feetibi.domain.Feetibi;
import com.ruoyi.project.system.feetibi.service.IFeetibiService;
import com.ruoyi.project.system.feetype.service.IFeetypeService;

/**
 * 收入提比 信息操作处理
 * 
 * @author panda
 * @date 2018-12-19
 */
@Controller
@RequestMapping("/system/feetibi")
public class FeetibiController extends BaseController
{
    private String prefix = "system/feetibi";
	
	@Autowired
	private IFeetibiService feetibiService;
	
	@Autowired
	private IDeptService deptService;
	
	@Autowired
	private IFeetypeService feetypeService;
	
	@RequiresPermissions("system:feetibi:view")
	@GetMapping()
	public String feetibi(HttpSession session)
	{
		session.setAttribute("deptlist", deptService.selectDeptAll());
		session.setAttribute("feelist", feetypeService.selectFeetypeAll());
	    return prefix + "/feetibi";
	}
	
	/**
	 * 查询收入提比列表
	 */
	@RequiresPermissions("system:feetibi:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Feetibi feetibi)
	{
		startPage();
        List<Feetibi> list = feetibiService.selectFeetibiList(feetibi);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出收入提比列表
	 */
	@RequiresPermissions("system:feetibi:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Feetibi feetibi)
    {
    	List<Feetibi> list = feetibiService.selectFeetibiList(feetibi);
        ExcelUtil<Feetibi> util = new ExcelUtil<Feetibi>(Feetibi.class);
        return util.exportExcel(list, "feetibi");
    }
	
	/**
	 * 新增收入提比
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存收入提比
	 */
	@RequiresPermissions("system:feetibi:add")
	@Log(title = "收入提比", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Feetibi feetibi)
	{		
		return toAjax(feetibiService.insertFeetibi(feetibi));
	}

	/**
	 * 修改收入提比
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Feetibi feetibi = feetibiService.selectFeetibiById(id);
		mmap.put("feetibi", feetibi);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存收入提比
	 */
	@RequiresPermissions("system:feetibi:edit")
	@Log(title = "收入提比", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Feetibi feetibi)
	{		
		return toAjax(feetibiService.updateFeetibi(feetibi));
	}
	
	/**
	 * 删除收入提比
	 */
	@RequiresPermissions("system:feetibi:remove")
	@Log(title = "收入提比", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(feetibiService.deleteFeetibiByIds(ids));
	}
	
    /**
     * 校验提比指标值类型
     */
    @PostMapping("/checkFeeByTibi")
    @ResponseBody
    public String checkFeeByTibi(Feetibi feetibi)
    {
        return feetibiService.checkFeeByTibi(feetibi);
    }
    
/*    *//**
     * 校验费用类型是否存在
     *//*
    @PostMapping("/checkFeeByFeeType")
    @ResponseBody
    public String checkFeeByFeeType(Feetibi feetibi)
    {
        return feetibiService.checkFeeByFeeType(feetibi);
    }*/
}
