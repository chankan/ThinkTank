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

	public void addDonors() {
		// TODO Auto-generated method stub
		
	}

	public DonorDetails getDonorByID(Integer donorId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
