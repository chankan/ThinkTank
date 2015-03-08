package com.chankan.application.thinktank.dao;

import com.chankan.application.thinktank.service.TicketServiceImpl;

public class MainTest {

	public static void main(String[] args) {
		
		
		
		
		HospitalMasterDAO hao = new HospitalMasterDAO();
		System.out.println("total list of donationCenter"+hao.getHospital().size());
		
		System.out.println("total list of donationCenter"+hao.getDonationCenter().size());
		
		
		TicketServiceImpl aa = new TicketServiceImpl();
		
		System.out.println("Count of tickets+" +aa.getTickets().size());
		
		System.out.println("Ticket by ID :"+aa.getTicketsByID(9000).getTicketRaisedBy());
		
		

	}

}
