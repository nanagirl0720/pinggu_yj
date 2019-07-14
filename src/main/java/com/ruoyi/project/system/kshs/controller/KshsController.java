package com.ruoyi.project.system.kshs.controller;


import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruoyi.project.system.yjhsKsjx.domain.YjhsKsjx;
import com.ruoyi.project.system.yjhsKsjx.service.IYjhsKsjxService;
import com.ruoyi.project.system.yjhsXmgzl.domain.YjhsXmgzl;
import com.ruoyi.project.system.yjhsXmgzl.service.IYjhsXmgzlService;
import com.ruoyi.project.system.yjxmKssb.domain.YjxmKssb;
import com.ruoyi.project.system.yjxmKssb.service.IYjxmKssbService;

@Controller
@RequestMapping("/system/kshs")
public class KshsController {
	
	private String prefix="system/kshs";
	@Autowired
	private IYjhsKsjxService iYjhsKsjxService;
	@Autowired
	private IYjhsXmgzlService iYjhsXmgzlService;
	@Autowired 
	private IYjxmKssbService iYjxmKssbService;
 
	int resultGzl=0;
	@RequiresPermissions("system:kshs:view")
	@GetMapping
	public String kshs() {
		return prefix+"/kshs";
	}
	
	@RequestMapping("/hs")
	public String yjhs(String rq) {
		int resultJx=iYjhsKsjxService.selectYjhsKsjxByRq(rq);
		int resultGzl=iYjhsXmgzlService.selectYjhsXmgzlByRq(rq);
		int sbGzl=iYjhsXmgzlService.selectSbgzlByRq(rq);
		List<YjhsXmgzl> yjhsXmgzlList=null;
		List<YjhsKsjx> yjhsKsjxList=null;
		
		System.out.println("*****************************rq**************************");
		System.out.println(rq);
		if(resultJx>1) {
			System.out.println("本月医技绩效已经核算过啦！");
			if(sbGzl>1) {
				System.out.println(sbGzl);
			}else {
				yjhsXmgzlList=iYjhsXmgzlService.selectAllByRq(rq);
				for (YjhsXmgzl yjhsXmgzl : yjhsXmgzlList) {
					iYjhsXmgzlService.insertYjhsXmgzl(yjhsXmgzl);
				}
				System.out.println("上报工作量核算完成完成！！");
				if(resultGzl>1) {
					System.out.println("本月医技工作量已经核算过啦！");
				}else {
					//以上代表还没有开始核算当月医技绩效
					yjhsXmgzlList=iYjhsXmgzlService.selectYjhsXmgzlByRiq(rq);
					for (YjhsXmgzl yjhsXmgzl : yjhsXmgzlList) {
						resultGzl=iYjhsXmgzlService.insertYjhsXmgzl(yjhsXmgzl);				
				}
				System.out.println(resultGzl);
				}
			}
		}else {
			if(resultGzl>1) {
				System.out.println("本月医技工作量已经核算过啦！");
				if(sbGzl>1) {
					System.out.println(sbGzl);
				}else {
					yjhsXmgzlList=iYjhsXmgzlService.selectAllByRq(rq);
					for (YjhsXmgzl yjhsXmgzl : yjhsXmgzlList) {
						iYjhsXmgzlService.insertYjhsXmgzl(yjhsXmgzl);
					}
					System.out.println("上报工作量核算完成完成！！");
				}
			}else {
				if(sbGzl>1) {
					System.out.println(sbGzl);
				}else {
					yjhsXmgzlList=iYjhsXmgzlService.selectAllByRq(rq);
					for (YjhsXmgzl yjhsXmgzl : yjhsXmgzlList) {
						iYjhsXmgzlService.insertYjhsXmgzl(yjhsXmgzl);
					}
					System.out.println("上报工作量核算完成完成！！");
				}
				//以上代表还没有开始核算当月医技工作量绩效
				yjhsXmgzlList=iYjhsXmgzlService.selectYjhsXmgzlByRiq(rq);
				for (YjhsXmgzl yjhsXmgzl : yjhsXmgzlList) {
					resultGzl=iYjhsXmgzlService.insertYjhsXmgzl(yjhsXmgzl);				
				}
				//以上代表还没有开始核算当月医技科室绩效
				yjhsKsjxList=iYjhsKsjxService.selectYjjx();
				for (YjhsKsjx yjhsksjx : yjhsKsjxList) {
					iYjhsKsjxService.insertYjhsKsjx(yjhsksjx);
				}
				}
			}
		
		return "/system/kshs/kshs";
	}
}
