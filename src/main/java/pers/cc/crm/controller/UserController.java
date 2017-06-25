package pers.cc.crm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pers.cc.crm.model.Employee;
import pers.cc.crm.service.IUserService;

/**
 * 用户控制模块
 * @author cc
 *
 */
@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	
	/**
	 * 用户登录控制器
	 * @param session 会话
	 * @param username 用户名参数
	 * @param password 密码参数
	 * @return 返回地址到主页
	 */
	@RequestMapping(value="login", params={"username!=", "password!="}, method=RequestMethod.POST)
	public String login(HttpSession session, String username, String password) {
		// 测试打印
		System.out.println("Test:login...username=" + username + ",password=" + password);
		// 业务处理
		Employee user = userService.login(username, password);
		if (user != null) session.setAttribute("user", user);
		System.out.println("Test:result," + user);
		System.out.println("Test:session," + session.getAttribute("user"));
		return "index";
	}
	
	/**
	 * 用户登出控制器
	 * @param session 会话
	 * @return 返回地址到主页
	 */
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		if (session.getAttribute("user")!=null) session.removeAttribute("user");
		return "index";
	}
	
}
