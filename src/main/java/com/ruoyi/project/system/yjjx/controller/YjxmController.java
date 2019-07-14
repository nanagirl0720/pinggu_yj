package com.ruoyi.project.system.yjjx.controller;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.dept.service.IDeptService;
import com.ruoyi.project.system.yjjx.domin.Yjxm;
import com.ruoyi.project.system.yjjx.service.YjxmService;

/**
 * 医技项目数据 信息操作处理
 * 
 */
@Controller
@RequestMapping("/system/yjxm")
public class YjxmController extends BaseController
{
    private String prefix = "system/yjxm";
	
	@Autowired
	private YjxmService yjxmService;
	@Autowired
	private IDeptService deptService;
	
	@RequiresPermissions("system:yjxm:view")
	@GetMapping()
	public String yjxm(Model model)
	{
		model.addAttribute("list", deptService.selectDeptAll());
	    return prefix + "/yjxm";
	}
	
	/**
	 * 查询医技项目数据列表
	 */
	@RequiresPermissions("system:yjxm:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Yjxm yjxm)
	{
		startPage();
        List<Yjxm> list = yjxmService.selectAllYjxm();
		return getDataTable(list);
	}
	
	
	/**
	 * 导出医技项目数据列表
	 */
	@RequiresPermissions("system:yjxm:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Yjxm yjxm)
    {
    	List<Yjxm> list = yjxmService.selectAllYjxm();
        ExcelUtil<Yjxm> util = new ExcelUtil<Yjxm>(Yjxm.class);
        return util.exportExcel(list, "yjxm");
    }
	
	/**
	 * 新增医技项目数据
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	
}
