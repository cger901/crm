package pers.cc.crm.service;

import java.util.List;

import pers.cc.crm.model.Employee;

public interface IUserService {

	/**
	 * 登录校验业务
	 * @param username 提交验证的登录用户名
	 * @param password 提交验证的登录密码
	 * @return 返回校验结果：登录成功返回用户实体/登录失败返回null
	 */
	Employee login(String username, String password);
	/**
	 * 注册用户业务
	 * @param employee 提交注册的新用户数据
	 * @return 返回添加结果：添加成功返回true/失败返回false
	 */
	boolean addUser(Employee employee);
	/**
	 * 注销用户业务
	 * @param employee 提交待删除数据的用户名
	 * @return 返回删除结果：成功删除返回true/失败返回false
	 */
	boolean delUser(String username);
	/**
	 * 更新用户业务
	 * @param employee 提交待修改的用户新数据
	 * @return 返回修改结果：更新成功返回true/失败返回false
	 */
	boolean updateUser(Employee employee);
	/**
	 * 获取所有用户列表
	 * @return 返回获取结果：成功获取返回用户结果集/失败返回null
	 */
	List<Employee> getAllUser();
}
