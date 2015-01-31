package com.chankan.application.thinktank.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.chankan.application.thinktank.bean.DonationTicketDetails;
import com.chankan.application.thinktank.commonUtils.DatabaseUtil;

public class TicketMasterDAO {

	public List<DonationTicketDetails> getTickets()
	{
		Session session = DatabaseUtil.getSession();
		List<DonationTicketDetails> ticketList = session.createCriteria(DonationTicketDetails.class).list();
		DatabaseUtil.closeSession(session);

		return ticketList;
	}
	
	
	public DonationTicketDetails getTicket(int ID)
	{
		Session session = DatabaseUtil.getSession();
		
		Query query = session.createQuery("FROM Donation_Ticket_Details WHERE Ticket_ID= :ID");
		query.setParameter("ticketID", ID);
		List <DonationTicketDetails> ticketList = query.list();
		DatabaseUtil.closeSession(session);
		if (ticketList != null && ticketList.size() == 1)
		{
			return ticketList.get(0);
		}

		return null;
		
		
	}
	
	
	public DonationTicketDetails addTicket(DonationTicketDetails newTicket) throws Exception
	{
		Session session = DatabaseUtil.getSession();
		Transaction tx = session.beginTransaction();
		try
		{
			session.save(newTicket);
			tx.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			tx.rollback();
			DatabaseUtil.closeSession(session);
			throw e;
		}
		DatabaseUtil.closeSession(session);

		return newTicket;
	}
	
	
	
	
}
