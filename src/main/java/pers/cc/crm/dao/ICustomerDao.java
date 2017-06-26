package pers.cc.crm.dao;

import pers.cc.crm.model.Customer;

public interface ICustomerDao {

	/**
	 * 查询所有客户
	 * @return 返回查询结果：查询成功返回客户集合/失败返回null
	 */
	Customer queryAllCustomer();
	
}
