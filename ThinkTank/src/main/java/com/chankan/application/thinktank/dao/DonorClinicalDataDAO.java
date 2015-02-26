package com.chankan.application.thinktank.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.chankan.application.thinktank.bean.DonorClinicalDetails;
import com.chankan.application.thinktank.bean.DonorDetails;
import com.chankan.application.thinktank.commonUtils.DatabaseUtil;

public class DonorClinicalDataDAO
{

	public DonorClinicalDetails getDonorClinicalDataById(int ID)
	{
		/*
		 * Get donor by single ID
		 */
		
		Session session = DatabaseUtil.getSession();
		
		Criteria crieteria= session.createCriteria(DonorClinicalDetails.class);
		crieteria.add(Restrictions.eq("donorDetailsID", ID));
		
		List <DonorClinicalDetails> singleDonor = crieteria.list();
		DatabaseUtil.closeSession(session);
		if (singleDonor != null && singleDonor.size() == 1)
		{
			
			return singleDonor.get(0);
		}

		return null;
		
	}
	
	
	public DonorClinicalDetails UpdateAddClinicalData(DonorClinicalDetails clinicalData)
	{
		
		Session session = DatabaseUtil.getSession();
		Transaction tx = session.beginTransaction();
		try
		{
			if(clinicalData.getDonorDetailsID()>=0)
			{
				session.update(clinicalData);
			}
			else
			{
				session.save(clinicalData);
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

		return clinicalData;
		
		
	}
	
	
	
}
