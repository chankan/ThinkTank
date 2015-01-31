package com.chankan.application.thinktank.bean;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DonorDonationStatus {

	private int donorDonationStatusID;
	private int donorDetailsID;
	private int donorClinicalID;
	private int hospitalID;
	private String donationType;
	private int status;
	private String comments;
	private int donationTicketID;

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

	public int getdonorClinicalID() {
		return donorClinicalID;
	}

	public void setdonorClinicalID(int donorClinicalID) {
		this.donorClinicalID = donorClinicalID;
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

	public int getDonorClinicalID() {
		return donorClinicalID;
	}

	public void setDonorClinicalID(int donorClinicalID) {
		this.donorClinicalID = donorClinicalID;
	}

	public int getDonationTicketID() {
		return donationTicketID;
	}

	public void setDonationTicketID(int donationTicketID) {
		this.donationTicketID = donationTicketID;
	}

}
