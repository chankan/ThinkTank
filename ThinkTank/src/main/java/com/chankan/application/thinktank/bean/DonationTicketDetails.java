package com.chankan.application.thinktank.bean;

import java.util.Date;


public class DonationTicketDetails {

private int ticketId;
private String ticketRaisedBy;
private String ticketDetails;
private String ticketSeverity;
private Date ticketCreationDate;
private String ticketCreatedBy;
private String ticketStatus;
private String ticketRaisedTo;
private String comments;

public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public String getTicketRaisedBy() {
	return ticketRaisedBy;
}
public void setTicketRaisedBy(String ticketRaisedBy) {
	this.ticketRaisedBy = ticketRaisedBy;
}
public String getTicketDetails() {
	return ticketDetails;
}
public void setTicketDetails(String ticketDetails) {
	this.ticketDetails = ticketDetails;
}
public String getTicketSeverity() {
	return ticketSeverity;
}
public void setTicketSeverity(String ticketSeverity) {
	this.ticketSeverity = ticketSeverity;
}
public Date getTicketCreationDate() {
	return ticketCreationDate;
}
public void setTicketCreationDate(Date ticketCreationDate) {
	this.ticketCreationDate = ticketCreationDate;
}
public String getTicketCreatedBy() {
	return ticketCreatedBy;
}
public void setTicketCreatedBy(String ticketCreatedBy) {
	this.ticketCreatedBy = ticketCreatedBy;
}
public String getTicketStatus() {
	return ticketStatus;
}
public void setTicketStatus(String ticketStatus) {
	this.ticketStatus = ticketStatus;
}
public String getTicketRaisedTo() {
	return ticketRaisedTo;
}
public void setTicketRaisedTo(String ticketRaisedTo) {
	this.ticketRaisedTo = ticketRaisedTo;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}




}
