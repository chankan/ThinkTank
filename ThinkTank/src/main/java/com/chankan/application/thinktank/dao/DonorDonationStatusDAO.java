package com.chankan.application.thinktank.dao;

import java.util.List;

import org.hibernate.Session;

import com.chankan.application.thinktank.bean.DonorDetails;
import com.chankan.application.thinktank.bean.DonorDonationStatus;
import com.chankan.application.thinktank.commonUtils.DatabaseUtil;

public class DonorDonationStatusDAO {

	public List<DonorDonationStatus> getDonorDonationStatus()
	{
		
		Session session = DatabaseUtil.getSession();
		List<DonorDonationStatus> donorDonationStatusList = session.createCriteria(DonorDonationStatus.class).list();
		DatabaseUtil.closeSession(session);

		return donorDonationStatusList;
	}
	
}
