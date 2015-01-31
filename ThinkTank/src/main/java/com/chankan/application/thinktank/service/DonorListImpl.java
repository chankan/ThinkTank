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

}
