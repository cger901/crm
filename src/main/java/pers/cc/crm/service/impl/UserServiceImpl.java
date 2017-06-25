package pers.cc.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.cc.crm.dao.IEmployeeDao;
import pers.cc.crm.model.Employee;
import pers.cc.crm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IEmployeeDao employeeDao;
	@Override
	public Employee login(String username, String password) {
		// 测试打印
		System.out.println("Test:server...username=" + username + ",password=" + password);
		return employeeDao.getUser(username, password);
	}
	@Override
	public boolean addUser(Employee employee) {
		return employeeDao.addUser(employee);
	}
	@Override
	public boolean delUser(String username) {
		return employeeDao.delUser(username);
	}
	@Override
	public boolean updateUser(Employee employee) {
		return employeeDao.updateUser(employee);
	}
	@Override
	public List<Employee> getAllUser() {
		return employeeDao.getAllUser();
	}

}
