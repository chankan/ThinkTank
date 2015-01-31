package com.chankan.application.thinktank.bean;
import java.util.Date;


public class PlatletsDonationDetails {

	private int platletDonationDetailsID;
	private int hospitalID;
	private int donorDetailsID;
	private int DonorClinicalID;
	private int ticketID;
	private Date donationDate;
	private String DonationType;
	private String Comments;
	
	
	public Date getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}
	public int getPlatletDonationDetailsID() {
		return platletDonationDetailsID;
	}
	public void setPlatletDonationDetailsID(int platletDonationDetailsID) {
		this.platletDonationDetailsID = platletDonationDetailsID;
	}
	public int getHospitalID() {
		return hospitalID;
	}
	public void setHospitalID(int hospitalID) {
		this.hospitalID = hospitalID;
	}
	public int getDonorDetailsID() {
		return donorDetailsID;
	}
	public void setDonorDetailsID(int donorDetailsID) {
		this.donorDetailsID = donorDetailsID;
	}
	public int getDonorClinicalID() {
		return DonorClinicalID;
	}
	public void setDonorClinicalID(int donorClinicalID) {
		DonorClinicalID = donorClinicalID;
	}
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public String getDonationType() {
		return DonationType;
	}
	public void setDonationType(String donationType) {
		DonationType = donationType;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	
	
	
	
}
