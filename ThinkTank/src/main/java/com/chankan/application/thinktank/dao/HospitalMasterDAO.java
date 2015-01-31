package com.chankan.application.thinktank.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.chankan.application.thinktank.bean.DonationTicketDetails;
import com.chankan.application.thinktank.bean.HospitalMaster;
import com.chankan.application.thinktank.commonUtils.DatabaseUtil;


public class HospitalMasterDAO {

	public List<HospitalMaster> getHospital()
	{
		
		Session session = DatabaseUtil.getSession();
		List<HospitalMaster> hospitalList = session.createCriteria(HospitalMaster.class).list();
		DatabaseUtil.closeSession(session);

		return hospitalList;
	
	}
	
	public List<HospitalMaster> getDonationCenter()
	{
		int i =0;
		Session session = DatabaseUtil.getSession();
		Criteria crieteria = session.createCriteria(HospitalMaster.class);
		crieteria.add(Restrictions.eq("isDonationCenter", i));
		List <HospitalMaster> listOfDonationCenter = crieteria.list();
		//List<HospitalMaster> hospitalList = .list();
		DatabaseUtil.closeSession(session);
		return listOfDonationCenter;
	
	}
	
	

}
