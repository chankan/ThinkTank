package com.chankan.application.thinktank.bean;

public class DonorDonationStatus {

	private int donorDonationStatusID;
	private int donorDetailsID;
	private int donorClinicalID;
	private int hospitalID;
	private String donationType;
	private int status;
	private String comments;

	public int getDonorDonationStatusID() {
		return donorDonationStatusID;
	}

	public void setDonorDonationStatusID(int donorDonationStatusID) {
		this.donorDonationStatusID = donorDonationStatusID;
	}

	public int getDonorDetailsID() {
		return donorDetailsID;
	}

	public void setDonorDetailsID(int donorDetailsID) {
		this.donorDetailsID = donorDetailsID;
	}

	public int getDonorClinicalData() {
		return donorClinicalID;
	}

	public void setDonorClinicalData(int donorClinicalData) {
		this.donorClinicalID = donorClinicalData;
	}

	public int getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(int hospitalID) {
		this.hospitalID = hospitalID;
	}

	public String getDonationType() {
		return donationType;
	}

	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
