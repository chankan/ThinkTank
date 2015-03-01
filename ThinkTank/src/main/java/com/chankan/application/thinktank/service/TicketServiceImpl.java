package com.chankan.application.thinktank.service;


import java.util.List;

import com.chankan.application.thinktank.bean.*;
import com.chankan.application.thinktank.dao.TicketMasterDAO;

public class TicketServiceImpl {
	
	public List<DonationTicketDetails> getTickets()
	{
		TicketMasterDAO dao = new TicketMasterDAO();
		System.out.println("TicketMasterDAO");
		return dao.getTickets();
		
	}

	public DonationTicketDetails getTicketsByID(Integer ticketID)
	{
		TicketMasterDAO dao = new TicketMasterDAO();
		DonationTicketDetails ticketByID = dao.getTicket(ticketID);
		return ticketByID;
	}
	
	
	public DonationTicketDetails addTicket(DonationTicketDetails newTicket) throws Exception
	{
		TicketMasterDAO dao = new TicketMasterDAO();
		dao.addTicket(newTicket);
		return newTicket;
	}

}
