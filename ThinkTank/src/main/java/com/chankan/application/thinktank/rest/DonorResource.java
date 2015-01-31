package com.chankan.application.thinktank.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.chankan.application.thinktank.bean.DonorCenter;
import com.chankan.application.thinktank.bean.DonorDetails;
import com.chankan.application.thinktank.bean.DonationTicketDetails;


@Path("/service")
public class DonorResource {
	
	DonationTicketDetails ticket = new  DonationTicketDetails();
	DonorDetails donor =  new DonorDetails();
	
	List<DonationTicketDetails> ticketList =  new ArrayList<DonationTicketDetails>();
	List<DonorDetails> donorList =  new ArrayList<DonorDetails>();
	
	
	
					/***Hospital URLs****/
	@GET
	@Path("/hospital")
	public String getHospital() 
	{
		return "Hello ThinkTank";
	}
		
				/******DonorCenter URLs*******/
	
	@Path("/donorCenter")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<DonorCenter> getDonorCenter()
	{
		return null;
	}
	
	@Path("/donorCenter")
	@POST
	public DonorCenter updateDonorCenter()
	{
		return null;
	}
	
					/****Donor URLs****/
	
	@Path("/donorSearch/{donorId}")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonorDetails getDonor(@PathParam("donorId") Integer donorId)
	{
		return donorList.get(1);
	}
	
	@Path("/donor")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<DonorDetails> getDonors()
	{
		donor.setDonorDetailsID(1);
		donor.setDonorName("Basanti");
		donor.setDonorType("1");
		
		donorList.add(donor);
		
		return donorList;
	}
	
	@Path("/donor")
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonorDetails updateDonors()
	{
		return null;
	}
	
						/***Ticket URLs****/
	
	
	@Path("/ticket")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<DonationTicketDetails> getTickets()
	{
		
		DonationTicketDetails ticket = new  DonationTicketDetails();
		ticket.setTicketId(1);
		ticket.setTicketRaisedBy("Rampur Hospital");
		ticket.setTicketRaisedTo("Gabbar Singh");
		ticket.setTicketCreationDate(new Date());
		
		ticketList.add(ticket);
		return null;
	}
	
	
	@Path("/ticket")
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails registerTicket()
	{
		return null;
	}
	
	
	@Path("/ticket/{ticketId}")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails getTicket(@PathParam("ticketId") Integer ticketId)
	{
		return ticketList.get(ticketId.intValue());
	}
	
	
	
	@Path("/ticketStatus")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails getTicketStatus()
	{
		return null;
	}
	
}
