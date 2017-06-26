package pers.cc.crm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import pers.cc.crm.dao.ICustomerDao;
import pers.cc.crm.model.Customer;
import priv.cc.crm.test.TestDataSourcecSingleton;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@Override
	public List<Customer> queryAllCustomer() {
		// 查询结果，默认值null
		List<Customer> result = null;
		result = TestDataSourcecSingleton.getCustomers();
		// 返回结果
		return result;
	}

}
