package com.chankan.application.thinktank.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DonorClinicalDetails {
	private int clinicalID;
	private int donorDetailsID;
	private Date donorDateOfBirth;
	private int sex;
	private int weight;
	private Date lastPlatletDonationDate;
	private Date lastBloodDonationDate;
	private int status;
	private int isSufferingFromDiseases;
	private int isDrugConsumption;
	private int isPregnancySymptoms;
	private Double hemoglobinLevel;
	private String Comments;
	
	
	
	
	public Double getHemoglobinLevel() {
		return hemoglobinLevel;
	}
	public void setHemoglobinLevel(Double hemoglobinLevel) {
		this.hemoglobinLevel = hemoglobinLevel;
	}
	public int getClinicalID() {
		return clinicalID;
	}
	public void setClinicalID(int clinicalID) {
		this.clinicalID = clinicalID;
	}
	public int getDonorDetailsID() {
		return donorDetailsID;
	}
	public void setDonorDetailsID(int donorDetailsID) {
		this.donorDetailsID = donorDetailsID;
	}
	public Date getDonorDateOfBirth() {
		return donorDateOfBirth;
	}
	public void setDonorDateOfBirth(Date donorDateOfBirth) {
		this.donorDateOfBirth = donorDateOfBirth;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Date getLastPlatletDonationDate() {
		return lastPlatletDonationDate;
	}
	public void setLastPlatletDonationDate(Date lastPlatletDonationDate) {
		this.lastPlatletDonationDate = lastPlatletDonationDate;
	}
	public Date getLastBloodDonationDate() {
		return lastBloodDonationDate;
	}
	public void setLastBloodDonationDate(Date lastBloodDonationDate) {
		this.lastBloodDonationDate = lastBloodDonationDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getIsSufferingFromDiseases() {
		return isSufferingFromDiseases;
	}
	public void setIsSufferingFromDiseases(int isSufferingFromDiseases) {
		this.isSufferingFromDiseases = isSufferingFromDiseases;
	}
	public int getIsDrugConsumption() {
		return isDrugConsumption;
	}
	public void setIsDrugConsumption(int isDrugConsumption) {
		this.isDrugConsumption = isDrugConsumption;
	}
	public int getIsPregnancySymptoms() {
		return isPregnancySymptoms;
	}
	public void setIsPregnancySymptoms(int isPregnancySymptoms) {
		this.isPregnancySymptoms = isPregnancySymptoms;
	}
	
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	
	
	
}
