package pers.cc.crm.dao;

import java.util.List;

import pers.cc.crm.model.Jurisdiction;

public interface IJurisdictionDao {

	/**
	 * 根据部门和职务查询权限
	 * @param decpartment 查询的部门
	 * @param title 查询的职务名称
	 * @return 返回查询结果：查询成功返回权限实体/失败返回null
	 */
	Jurisdiction queryJurisdiction(String decpartment, String title);
	/**
	 * 查询所有权限
	 * @return 返回查询结果：查询成功返回结果集合/失败返回null
	 */
	List<Jurisdiction> queryAllJurisdiction();
	/**
	 * 插入一个权限
	 * @param jurisdiction 提交的待建立权限实体
	 * @return 返回创建结果：建立成功返回true/失败返回false
	 */
	boolean insertJurisdiction(Jurisdiction jurisdiction);
	/**
	 * 修改一个权限
	 * @param jurisdiction 提交的待修改权限实体
	 * @return 返回修改结果：成功修改返回true/失败返回false
	 */
	boolean updateJurisdiction(Jurisdiction jurisdiction);
	/**
	 * 删除一个权限
	 * @param jurisdiction 提交的待删除权限实体
	 * @return 返回删除结果：成功删除返回true/失败返回false
	 */
	boolean removeJurisdiction(Jurisdiction jurisdiction);
	
}
