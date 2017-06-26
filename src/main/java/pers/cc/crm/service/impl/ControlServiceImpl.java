package pers.cc.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.cc.crm.dao.IJurisdictionDao;
import pers.cc.crm.model.Jurisdiction;
import pers.cc.crm.service.IControlService;

@Service
public class ControlServiceImpl implements IControlService {

	@Autowired
	private IJurisdictionDao jurisdictionDao;
	
	@Override
	public Jurisdiction getJurisdiction(String decpartment, String title) {
		return jurisdictionDao.queryJurisdiction(decpartment, title);
	}

	@Override
	public List<Jurisdiction> getAllJurisdiction() {
		return jurisdictionDao.queryAllJurisdiction();
	}

	@Override
	public boolean createJurisdiction(Jurisdiction jurisdiction) {
		return jurisdictionDao.insertJurisdiction(jurisdiction);
	}

	@Override
	public boolean modifyJurisdiction(Jurisdiction jurisdiction) {
		return jurisdictionDao.updateJurisdiction(jurisdiction);
	}

	@Override
	public boolean deleteJurisdiction(Jurisdiction jurisdiction) {
		return jurisdictionDao.removeJurisdiction(jurisdiction);
	}

}
