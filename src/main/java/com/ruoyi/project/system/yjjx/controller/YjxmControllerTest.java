package com.ruoyi.project.system.yjjx.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ruoyi.project.system.yjjx.domin.Yjxm;
import com.ruoyi.project.system.yjjx.service.YjxmService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YjxmControllerTest extends YjxmController {

	@Autowired
	private YjxmService yjxmService;
	@Test
	public void testSelectAllYjxm() {
		List<Yjxm> yjxmList=yjxmService.selectAllYjxm();
		for (Yjxm yjxm : yjxmList) {
			System.out.println(yjxm.toString());
		}
	}

	
}
