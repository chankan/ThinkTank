package com.chankan.application.thinktank.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.chankan.application.thinktank.bean.DonationTicketDetails;
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
	

	
	public DonorDetails getDonorById(int ID)
	{
		/*
		 * Get donor by single ID
		 */
		
		Session session = DatabaseUtil.getSession();
		
		Criteria crieteria= session.createCriteria(DonorDetails.class);
		crieteria.add(Restrictions.eq("donorDetailsID", ID));
		
		List <DonorDetails> singleDonor = crieteria.list();
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
	public DonorDetails addDonor(DonorDetails newDonor) throws Exception
	{
		Session session = DatabaseUtil.getSession();
		Transaction tx = session.beginTransaction();
		try
		{
			if(newDonor.getDonorDetailsID()>=0)
			{
				session.update(newDonor);
			}
			else
			{
				session.save(newDonor);
			}
			
			tx.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			tx.rollback();
			DatabaseUtil.closeSession(session);
			throw e;
		}
		DatabaseUtil.closeSession(session);

		return newDonor;
	}
	
	
	

	
	
	
	
	
}
