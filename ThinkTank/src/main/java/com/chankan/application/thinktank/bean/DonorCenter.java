package com.chankan.application.thinktank.bean;

public class DonorCenter 
{

	private int hospitalId;
	private String hospitalName;
	private String hospitalAddress;
	private String city;
	private String state;
	private String pinCode;
	private String mapLatitude;
	private String mapLongitude;
	private String primaryPhoneNo;
	private String secondaryPhoneNo;
	private  String comments;
	
	
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getMapLatitude() {
		return mapLatitude;
	}
	public void setMapLatitude(String mapLatitude) {
		this.mapLatitude = mapLatitude;
	}
	public String getMapLongitude() {
		return mapLongitude;
	}
	public void setMapLongitude(String mapLongitude) {
		this.mapLongitude = mapLongitude;
	}
	public String getPrimaryPhoneNo() {
		return primaryPhoneNo;
	}
	public void setPrimaryPhoneNo(String primaryPhoneNo) {
		this.primaryPhoneNo = primaryPhoneNo;
	}
	public String getSecondaryPhoneNo() {
		return secondaryPhoneNo;
	}
	public void setSecondaryPhoneNo(String secondaryPhoneNo) {
		this.secondaryPhoneNo = secondaryPhoneNo;
	}
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	

}
