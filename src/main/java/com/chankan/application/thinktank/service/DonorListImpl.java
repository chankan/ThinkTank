package com.chankan.application.thinktank.service;

import java.util.List;

import com.chankan.application.thinktank.bean.DonorDetails;
import com.chankan.application.thinktank.dao.DonorMasterDAO;

public class DonorListImpl {
	public List<DonorDetails> getDonors()
	{
		DonorMasterDAO dao = new DonorMasterDAO();
		return dao.getDonors();
		
	}

	public DonorDetails addDonors(DonorDetails newDonor) throws Exception
	{
		// TODO Auto-generated method stub
		DonorMasterDAO dao = new DonorMasterDAO();
		return dao.addDonor(newDonor);
		
		
	}

	public DonorDetails getDonorByID(Integer donorId)
	{
		
		DonorMasterDAO dao = new DonorMasterDAO();
		DonorDetails getDoonor =  dao.getDonorById(donorId);
		
		return getDoonor;
		
		
		
		// TODO Auto-generated method stub
		
	}
	
	

}
