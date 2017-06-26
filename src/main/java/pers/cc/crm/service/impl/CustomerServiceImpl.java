package pers.cc.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.cc.crm.dao.ICustomerDao;
import pers.cc.crm.model.Customer;
import pers.cc.crm.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	public List<Customer> getAllCustomer() {
		return customerDao.queryAllCustomer();
	}

}
