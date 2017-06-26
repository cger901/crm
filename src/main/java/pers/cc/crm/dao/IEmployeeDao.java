package pers.cc.crm.dao;

import java.util.List;

import pers.cc.crm.model.Employee;

public interface IEmployeeDao {

	/**
	 * 根据提交的用户名和密码获取用户
	 * @param username 提交的用户名
	 * @param password 提交的密码
	 * @return 返回查询结果：查询成功返回用户实体/查询失败返回null
	 */
	Employee getUser(String username, String password);
	/**
	 * 获取所有用户
	 * @return 返回查询结果：查询成功返回用户结果集/失败返回null
	 */
	List<Employee> getAllUser();
	/**
	 * 插入一条新用户数据
	 * @param employee 提交的新用户数据
	 * @return 返回添加结果：添加成功返回true/失败返回false
	 */
	boolean addUser(Employee employee);
	/**
	 * 删除一条用户数据
	 * @param employee 待删除数据的用户名
	 * @return 返回删除结果：成功删除返回true/失败返回false
	 */
	boolean delUser(String username);
	/**
	 * 修改一条用户数据
	 * @param employee 提交修改的用户新数据
	 * @return 返回修改结果：更新成功返回true/失败返回false
	 */
	boolean updateUser(Employee employee);
	
}
