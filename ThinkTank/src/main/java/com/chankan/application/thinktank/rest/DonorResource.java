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
import com.chankan.application.thinktank.exception.ServiceException;


@Path("/service")
public class DonorResource {
	
	DonationTicketDetails ticket = new  DonationTicketDetails();
	DonorDetails donor =  new DonorDetails();
	
	List<DonationTicketDetails> ticketList =  new ArrayList<DonationTicketDetails>();
	List<DonorDetails> donorList =  new ArrayList<DonorDetails>();
	
	
	
					/***Hospital URLs
					 * @throws ServiceException ****/
	@GET
	@Path("/hospital/{hospitalId}")
	public String getHospital(@PathParam("hospitalId") Integer hospitalId) throws ServiceException 
	{
		try
		{
			
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceHospitalException");

		}
		return "Hello ThinkTank";
	}
	
	@POST
	@Path("/hospital")
	public String updateHospital() throws ServiceException 
	{
		try
		{
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceHospitalException");

		}
		return "Hello ThinkTank";
	}
	
				/******DonorCenter URLs
				 * @throws ServiceException *******/
	
	@Path("/donorCenter")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<DonorCenter> getDonorCenter() throws ServiceException
	{
		try
		{
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorCenterException");

		}
		return null;
	}
	
	@Path("/donorCenter")
	@POST
	public DonorCenter updateDonorCenter() throws ServiceException
	{
		try
		{
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorCenterException");

		}
		return null;
	}
	
					/****Donor URLs
					 * @throws ServiceException ****/
	
	@Path("/donorSearch/{donorId}")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonorDetails getDonor(@PathParam("donorId") Integer donorId) throws ServiceException
	{
		try
		{
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorDetailException");

		}
		
		return donorList.get(1);
	}
	
	@Path("/donor")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<DonorDetails> getDonors() throws ServiceException
	{
		try
		{
			
			donor.setDonorDetailsID(1);
			donor.setDonorName("Basanti");
			donor.setDonorType("1");
			
			donorList.add(donor);

		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorDetailException");
		}
		
		
		return donorList;
	}
	
	@Path("/donor")
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonorDetails updateDonors() throws ServiceException
	{
		try
		{
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorDetailException");

		}
		
		return null;
	}
	
						/***Ticket URLs
						 * @throws ServiceException ****/
	
	
	@Path("/ticket")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<DonationTicketDetails> getTickets() throws ServiceException
	{
		try
		{
			DonationTicketDetails ticket = new  DonationTicketDetails();
			ticket.setTicketId(1);
			ticket.setTicketRaisedBy("Rampur Hospital");
			ticket.setTicketRaisedTo("Gabbar Singh");
			ticket.setTicketCreationDate(new Date());
			
			ticketList.add(ticket);
			
			
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorDetailException");
		}
		
		
		
		return ticketList;
	}
	
	
	@Path("/ticket")
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails registerTicket() throws ServiceException
	{
		try
		{
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorTicketDetailException");

		}
		
		return null;
	}
	
	
	@Path("/ticket/{ticketId}")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails getTicket(@PathParam("ticketId") Integer ticketId) throws ServiceException
	{
		try
		{
				}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorTicketDetailException");
			
		}
		
		return ticketList.get(ticketId.intValue());
	}
	
	
	
	@Path("/ticketStatus")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails getTicketStatus() throws ServiceException
	{
		try
		{
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorTicketDetailException");

		}
		
		return null;
	}
	
}
