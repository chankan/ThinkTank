package com.chankan.application.thinktank.service;

import com.chankan.application.thinktank.bean.DonorClinicalDetails;
import com.chankan.application.thinktank.bean.DonorDetails;
import com.chankan.application.thinktank.dao.DonorClinicalDataDAO;
import com.chankan.application.thinktank.dao.DonorMasterDAO;

public class DonorClinicalDataImpl {
	
	

	public DonorClinicalDetails UpdateAddClinicalData(DonorClinicalDetails clinicalData) throws Exception
	{
		// TODO Auto-generated method stub
		DonorClinicalDataDAO dao = new DonorClinicalDataDAO();
		return dao.UpdateAddClinicalData(clinicalData);
		
		
	}

	public DonorClinicalDetails getDonorClinicalDataById(Integer donorId)
	{
		
		DonorClinicalDataDAO dao = new DonorClinicalDataDAO();
		DonorClinicalDetails getDoonor =  dao.getDonorClinicalDataById(donorId);
		
		return getDoonor;
		
		
		
		// TODO Auto-generated method stub
		
	}

}
