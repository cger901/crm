package priv.cc.crm.test;

import java.util.ArrayList;
import java.util.List;

import pers.cc.crm.model.*;

/**
 * 测试数据源
 * 
 * @author cc
 *
 */
public final class TestDataSourcecSingleton {
	
	private static List<Employee> employees;
	private static List<Customer> customers;
	private static List<Jurisdiction> jurisdictions;
	private static List<Documentary> records;
	
	private TestDataSourcecSingleton() {}
	
	public static List<Employee> getEmployees() {
		if (employees==null) employees = new ArrayList<>();
		return employees;
	}
	public static List<Customer> getCustomers() {
		if (customers==null) customers = new ArrayList<>();
		return customers;
	}
	public static List<Jurisdiction> getJurisdictions() {
		if (jurisdictions==null) jurisdictions = new ArrayList<>();
		return jurisdictions;
	}
	public static List<Documentary> getRecords() {
		if (records==null) records = new ArrayList<>();
		return records;
	}
	
	static{
		getEmployees().add(new Employee("admin", "123456", "开发部", "技术总监"));
		System.out.println("Test:测试数据初始化完成。");
	}
	
}
