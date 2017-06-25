package pers.cc.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.cc.crm.model.Employee;
import pers.cc.crm.service.IUserService;

/**
 * 管理员控制模块
 * @author cc
 *
 */
@Controller
@RequestMapping("admin/")
public class AdministratorController {

	@Autowired
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping("getalluser")
	public List<Employee> getAllUser() {
		List<Employee> list = userService.getAllUser();
		// 测试打印
		System.out.println(list);
		return list;
	}
	
}
