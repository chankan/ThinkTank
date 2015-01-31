package com.chankan.application.thinktank.dao;

public class MainTest {

	public static void main(String[] args) {
		
		
		
		
		HospitalMasterDAO hao = new HospitalMasterDAO();
		System.out.println("total list of donationCenter"+hao.getHospital().size());
		
		System.out.println("total list of donationCenter"+hao.getDonationCenter().size());

	}

}
