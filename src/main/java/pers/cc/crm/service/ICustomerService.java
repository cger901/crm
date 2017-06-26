package pers.cc.crm.service;

import java.util.List;

import pers.cc.crm.model.Customer;

public interface ICustomerService {

	/**
	 * 获取所有客户
	 * @return 返回获取结果：成功获取返回客户集合/失败返回null
	 */
	List<Customer> getAllCustomer();
	
}
