package pers.cc.crm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import pers.cc.crm.dao.IJurisdictionDao;
import pers.cc.crm.model.Jurisdiction;
import priv.cc.crm.test.TestDataSourcecSingleton;

@Repository
public class JurisdictionDaoImpl implements IJurisdictionDao {

	@Override
	public Jurisdiction queryJurisdiction(String decpartment, String title) {
		// 查询结果，默认值null
		Jurisdiction result = null;
		// 测试用例
		if (decpartment!=null && title!=null) {
			for(Jurisdiction jur : TestDataSourcecSingleton.getJurisdictions()) {
				if (jur.getDecpartmentName().equals(decpartment) && jur.getTitleName().equals(title)) {
					result = jur;
					break;
				}
			}
		}
		// 返回结果
		return result;
	}

	@Override
	public List<Jurisdiction> queryAllJurisdiction() {
		// 查询结果，默认值null
		List<Jurisdiction> result = null;
		// 测试用例
		result = TestDataSourcecSingleton.getJurisdictions();
		// 返回结果
		return result;
	}

	@Override
	public boolean insertJurisdiction(Jurisdiction jurisdiction) {
		// 查询结果，默认值false
		boolean result = true;
		// 测试用例
		if (jurisdiction!=null && jurisdiction.getDecpartmentName()!=null && jurisdiction.getTitleName()!=null) {
			for(Jurisdiction jur : TestDataSourcecSingleton.getJurisdictions()) {
				if (jur.getDecpartmentName().equals(jurisdiction.getDecpartmentName()) && jur.getTitleName().equals(jurisdiction.getTitleName())) {
					result = false;
					break;
				}
			}
			if (result) TestDataSourcecSingleton.getJurisdictions().add(jurisdiction);
		}
		// 返回结果
		return result;
	}

	@Override
	public boolean updateJurisdiction(Jurisdiction jurisdiction) {
		// 查询结果，默认值false
		boolean result = false;
		// 测试用例
		if (jurisdiction!=null && jurisdiction.getDecpartmentName()!=null && jurisdiction.getTitleName()!=null) {
			for(Jurisdiction jur : TestDataSourcecSingleton.getJurisdictions()) {
				if (jur.getDecpartmentName().equals(jurisdiction.getDecpartmentName()) && jur.getTitleName().equals(jurisdiction.getTitleName())) {
					jur = jurisdiction;
					result = true;
					break;
				}
			}
		}
		// 返回结果
		return result;
	}

	@Override
	public boolean removeJurisdiction(Jurisdiction jurisdiction) {
		// 查询结果，默认值false
		boolean result = false;
		// 测试用例
		if (jurisdiction!=null && jurisdiction.getDecpartmentName()!=null && jurisdiction.getTitleName()!=null) {
			for(Jurisdiction jur : TestDataSourcecSingleton.getJurisdictions()) {
				if (jur.getDecpartmentName().equals(jurisdiction.getDecpartmentName()) && jur.getTitleName().equals(jurisdiction.getTitleName())) {
					TestDataSourcecSingleton.getJurisdictions().remove(jur);
					result = true;
					break;
				}
			}
		}
		// 返回结果
		return result;
	}

}
