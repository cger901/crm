package pers.cc.crm.model;

/**
 * 员工类
 * 
 * @author cc
 *
 */
public class Employee {

	/**
	 * 员工姓名
	 */
	private String employeeName;
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 部门
	 */
	private String department;
	/**
	 * 职务
	 */
	private String title;
	
	public Employee(String employeeName, String password, String department, String title) {
		this.employeeName = employeeName;
		this.password = password;
		this.department = department;
		this.title = title;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", password=" + password + ", department=" + department
				+ ", title=" + title + "]";
	}
	
}
