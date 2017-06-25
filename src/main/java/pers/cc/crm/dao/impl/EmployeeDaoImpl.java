package pers.cc.crm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import pers.cc.crm.dao.IEmployeeDao;
import pers.cc.crm.model.Employee;
import priv.cc.crm.test.TestDataSourcecSingleton;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public Employee getUser(String username, String password) {
		// 查询结果，默认值null
		Employee user = null;
		// 测试用例
		for(Employee emp : TestDataSourcecSingleton.getEmployees()) {
			if (emp.getEmployeeName().equals(username) && emp.getPassword().equals(password)) {
				user = emp;
				break;
			}
		}
		// 测试打印
		System.out.println("Test:query," + user);
		// 返回结果
		return user;
	}

	@Override
	public boolean addUser(Employee user) {
		// 添加结果，默认值null
		boolean result = true;
		// 测试用例
		if (user!=null && user.getEmployeeName()!=null && user.getPassword()!=null) {
			for(Employee emp : TestDataSourcecSingleton.getEmployees()) {
				if (emp.getEmployeeName().equals(user.getEmployeeName())) {
					result = false;
					break;
				}
			}
			if (result) TestDataSourcecSingleton.getEmployees().add(user);
		}
		// 返回结果
		return result;
	}

	@Override
	public boolean delUser(String username) {
		// 删除结果，默认值null
		boolean result = false;
		// 测试用例
		if (username!=null) {
			for(Employee emp : TestDataSourcecSingleton.getEmployees()) {
				if (emp.getEmployeeName().equals(username)) {
					TestDataSourcecSingleton.getEmployees().remove(emp);
					result = true;
					break;
				}
			}
		}
		// 返回结果
		return result;
	}

	@Override
	public boolean updateUser(Employee user) {
		// 更新结果，默认值null
		boolean result = false;
		// 测试用例
		if (result) {
			for(Employee emp : TestDataSourcecSingleton.getEmployees()) {
				if (emp.getEmployeeName().equals(user.getEmployeeName())) {
					emp = user;
					result = true;
					break;
				}
			}
		}
		// 返回结果
		return result;
	}

	@Override
	public List<Employee> getAllUser() {
		// 查询结果，默认值null
		List<Employee> result = null;
		// 测试用例
		result = TestDataSourcecSingleton.getEmployees();
		// 返回结果
		return result;
	}

}
