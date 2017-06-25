package pers.cc.crm.model;

/**
 * 客户类
 * 
 * @author cc
 *
 */
public class Customer {

	/**
	 * 客户编号
	 * <p>
	 * 主键，由当天日期和客户的电话号码组成。
	 */
	private long customerID;
	/**
	 * 客户姓名
	 */
	private String customerName;
	/**
	 * 邀请人姓名
	 */
	private String inviterName;
	/**
	 * 客户手机号码
	 */
	private String mobilePhone;
	
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getInviterName() {
		return inviterName;
	}
	public void setInviterName(String inviterName) {
		this.inviterName = inviterName;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
}
