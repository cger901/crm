package pers.cc.crm.model;

public class Jurisdiction {

	/**
	 * 职务名称
	 */
	private String titleName;
	/**
	 * 部门名称
	 */
	private String decpartmentName;
	/**
	 * 行政级别
	 * <p>
	 * 该职务潜在的默认管理权限。
	 * 当“角色：管理员”选项为true时，可以操作所属部门内所有级别低于自身的用户信息。
	 */
	private int administrativeLevel;
	/**
	 * 角色：管理员
	 * <p>
	 * 设置开启了该选项的用户（true）成为管理员，拥有对其他用户的默认管理权限。
	 */
	private boolean administrator;
	/**
	 * 权限：访问服务器
	 */
	private boolean accessable;
	/**
	 * 权限：查看用户
	 */
	private boolean userViewable;
	/**
	 * 权限：添加用户（必须具备管理员）
	 */
	private boolean userAddable;
	/**
	 * 权限：修改用户
	 */
	private boolean userUpdateable;
	/**
	 * 权限：删除用户（必须具备管理员）
	 */
	private boolean userRemoveable;
	/**
	 * 权限：查看客户
	 */
	private boolean customerViewable;
	/**
	 * 权限：添加客户
	 */
	private boolean customerAddable;
	/**
	 * 权限：修改客户
	 */
	private boolean customerUpdateable;
	/**
	 * 权限：删除客户
	 */
	private boolean customerRemoveable;
	/**
	 * 权限：查看跟单记录
	 */
	private boolean documentaryViewable;
	/**
	 * 权限：添加跟单记录
	 */
	private boolean documentaryAddable;
	/**
	 * 权限：修改跟单记录
	 */
	private boolean documentaryUpdateable;
	/**
	 * 权限：删除跟单记录
	 */
	private boolean documentaryRemoveable;
	/**
	 * 权限：Excle文件导入
	 */
	private boolean excleImport;
	/**
	 * 权限：Excle文件导出
	 */
	private boolean excleExport;
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getDecpartmentName() {
		return decpartmentName;
	}
	public void setDecpartmentName(String decpartmentName) {
		this.decpartmentName = decpartmentName;
	}
	public int getAdministrativeLevel() {
		return administrativeLevel;
	}
	public void setAdministrativeLevel(int administrativeLevel) {
		this.administrativeLevel = administrativeLevel;
	}
	public boolean isAdministrator() {
		return administrator;
	}
	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}
	public boolean isAccessable() {
		return accessable;
	}
	public void setAccessable(boolean accessable) {
		this.accessable = accessable;
	}
	public boolean isUserViewable() {
		return userViewable;
	}
	public void setUserViewable(boolean userViewable) {
		this.userViewable = userViewable;
	}
	public boolean isUserAddable() {
		return userAddable;
	}
	public void setUserAddable(boolean userAddable) {
		this.userAddable = userAddable;
	}
	public boolean isUserUpdateable() {
		return userUpdateable;
	}
	public void setUserUpdateable(boolean userUpdateable) {
		this.userUpdateable = userUpdateable;
	}
	public boolean isUserRemoveable() {
		return userRemoveable;
	}
	public void setUserRemoveable(boolean userRemoveable) {
		this.userRemoveable = userRemoveable;
	}
	public boolean isCustomerViewable() {
		return customerViewable;
	}
	public void setCustomerViewable(boolean customerViewable) {
		this.customerViewable = customerViewable;
	}
	public boolean isCustomerAddable() {
		return customerAddable;
	}
	public void setCustomerAddable(boolean customerAddable) {
		this.customerAddable = customerAddable;
	}
	public boolean isCustomerUpdateable() {
		return customerUpdateable;
	}
	public void setCustomerUpdateable(boolean customerUpdateable) {
		this.customerUpdateable = customerUpdateable;
	}
	public boolean isCustomerRemoveable() {
		return customerRemoveable;
	}
	public void setCustomerRemoveable(boolean customerRemoveable) {
		this.customerRemoveable = customerRemoveable;
	}
	public boolean isDocumentaryViewable() {
		return documentaryViewable;
	}
	public void setDocumentaryViewable(boolean documentaryViewable) {
		this.documentaryViewable = documentaryViewable;
	}
	public boolean isDocumentaryAddable() {
		return documentaryAddable;
	}
	public void setDocumentaryAddable(boolean documentaryAddable) {
		this.documentaryAddable = documentaryAddable;
	}
	public boolean isDocumentaryUpdateable() {
		return documentaryUpdateable;
	}
	public void setDocumentaryUpdateable(boolean documentaryUpdateable) {
		this.documentaryUpdateable = documentaryUpdateable;
	}
	public boolean isDocumentaryRemoveable() {
		return documentaryRemoveable;
	}
	public void setDocumentaryRemoveable(boolean documentaryRemoveable) {
		this.documentaryRemoveable = documentaryRemoveable;
	}
	public boolean isExcleImport() {
		return excleImport;
	}
	public void setExcleImport(boolean excleImport) {
		this.excleImport = excleImport;
	}
	public boolean isExcleExport() {
		return excleExport;
	}
	public void setExcleExport(boolean excleExport) {
		this.excleExport = excleExport;
	}
	
}
