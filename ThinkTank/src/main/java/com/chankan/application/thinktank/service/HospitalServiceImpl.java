package com.chankan.application.thinktank.service;

import java.util.List;

import com.chankan.application.thinktank.bean.HospitalMaster;
import com.chankan.application.thinktank.dao.HospitalMasterDAO;

public class HospitalServiceImpl {
	
	
	public List<HospitalMaster> getHospital()
	{
		HospitalMasterDAO dao = new HospitalMasterDAO();
		return dao.getHospital();
	}
	
	public List<HospitalMaster> getDonationCenter()
	{
		HospitalMasterDAO dao = new HospitalMasterDAO();
		return dao.getDonationCenter();
	}

}
