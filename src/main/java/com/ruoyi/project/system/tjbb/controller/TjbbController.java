package com.ruoyi.project.system.tjbb.controller;

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
import com.ruoyi.project.system.tjbb.domain.Tjbb;
import com.ruoyi.project.system.tjbb.service.ITjbbService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 体检报 信息操作处理
 * 
 * @author panda
 * @date 2019-06-10
 */
@Controller
@RequestMapping("/system/tjbb")
public class TjbbController extends BaseController
{
    private String prefix = "system/tjbb";
	
	@Autowired
	private ITjbbService tjbbService;
	
	@RequiresPermissions("system:tjbb:view")
	@GetMapping()
	public String tjbb()
	{
	    return prefix + "/tjbb";
	}
	
	/**
	 * 查询体检报列表
	 */
	@RequiresPermissions("system:tjbb:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Tjbb tjbb)
	{
		startPage();
        List<Tjbb> list = tjbbService.selectTjbbList(tjbb);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出体检报列表
	 */
	@RequiresPermissions("system:tjbb:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Tjbb tjbb)
    {
    	List<Tjbb> list = tjbbService.selectTjbbList(tjbb);
        ExcelUtil<Tjbb> util = new ExcelUtil<Tjbb>(Tjbb.class);
        return util.exportExcel(list, "tjbb");
    }
	
	/**
	 * 新增体检报
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存体检报
	 */
	@RequiresPermissions("system:tjbb:add")
	@Log(title = "体检报", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Tjbb tjbb)
	{		
		return toAjax(tjbbService.insertTjbb(tjbb));
	}

	/**
	 * 修改体检报
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Tjbb tjbb = tjbbService.selectTjbbById(id);
		mmap.put("tjbb", tjbb);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存体检报
	 */
	@RequiresPermissions("system:tjbb:edit")
	@Log(title = "体检报", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Tjbb tjbb)
	{		
		return toAjax(tjbbService.updateTjbb(tjbb));
	}
	
	/**
	 * 删除体检报
	 */
	@RequiresPermissions("system:tjbb:remove")
	@Log(title = "体检报", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tjbbService.deleteTjbbByIds(ids));
	}
	
}
