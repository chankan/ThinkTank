package com.chankan.application.thinktank.dao;

import java.util.List;

import org.hibernate.Session;

import com.chankan.application.thinktank.bean.DonorDetails;
import com.chankan.application.thinktank.bean.HospitalMaster;
import com.chankan.application.thinktank.commonUtils.DatabaseUtil;

public class DonorMasterDAO {
	
	public List<DonorDetails> getDonors()
	{
	/*
	 * Jitendra: This will list all donor present in the DB
	 * 
	 * */
		Session session = DatabaseUtil.getSession();
		List<DonorDetails> donorList = session.createCriteria(DonorDetails.class).list();
		DatabaseUtil.closeSession(session);

		return donorList;
	}
	
	

}
