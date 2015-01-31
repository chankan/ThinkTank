package com.chankan.application.thinktank.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.chankan.application.thinktank.bean.DonorClinicalDetails;
import com.chankan.application.thinktank.bean.PlatletsDonationDetails;
import com.chankan.application.thinktank.commonUtils.DatabaseUtil;

public class plateletsDonationDetailsDAO 
{

	public PlatletsDonationDetails getDonationationInfo(int ID)
	{
		/*
		 * Get donor by single ID
		 */
		
		Session session = DatabaseUtil.getSession();
		
		Criteria crieteria= session.createCriteria(PlatletsDonationDetails.class);
		crieteria.add(Restrictions.eq("donorDetailsID", ID));
		
		List <PlatletsDonationDetails> singleDonor = crieteria.list();
		DatabaseUtil.closeSession(session);
		if (singleDonor != null && singleDonor.size() == 1)
		{
			
			return singleDonor.get(0);
		}
		else
		{
			return null;
		}
	
		
		
		
	}
	
	
	
	
	
	
	
}
