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
import com.chankan.application.thinktank.bean.HospitalMaster;
import com.chankan.application.thinktank.dao.HospitalMasterDAO;
import com.chankan.application.thinktank.dao.TicketMasterDAO;
import com.chankan.application.thinktank.exception.ServiceException;
import com.chankan.application.thinktank.service.TicketServiceImpl;


@Path("/service")
public class DonorResource {
	
	DonationTicketDetails ticket = new  DonationTicketDetails();
	DonorDetails donor =  new DonorDetails();
	
	List<DonationTicketDetails> ticketList =  new ArrayList<DonationTicketDetails>();
	List<DonorDetails> donorList =  new ArrayList<DonorDetails>();
	
	
	
					/***Hospital URLs
					 * @throws ServiceException ****/
	
	@GET
	@Path("/hospital")
	public List<HospitalMaster> getHospitals() throws ServiceException 
	{
		List<HospitalMaster> hospitalList=null;
		HospitalMasterDAO hospitalDAO = null; 
		try
		{
			hospitalList = new ArrayList<HospitalMaster>();
			hospitalDAO = new HospitalMasterDAO();
			
			hospitalList = hospitalDAO.getHospital();
					if(hospitalList==null)
						throw new Exception();
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceHospitalException");

		}
		return hospitalList;
	}
	
	
	@GET
	@Path("/hospital/{hospitalId}")
	public HospitalMaster getHospital(@PathParam("hospitalId") Integer hospitalId) throws ServiceException 
	{
		HospitalMaster hospital = null;
		try
		{
			List<HospitalMaster> hospitalList = getHospitals();
			hospital = hospitalList.get(hospitalId);
			
			if(hospital==null)
				throw new Exception();
			
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceHospitalException");

		}
		return hospital;
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
	public List<HospitalMaster> getDonorCenters() throws ServiceException
	{
		
		List<HospitalMaster> donorCenterList=null;
		HospitalMasterDAO hospitalDAO = null; 
		try
		{
			donorCenterList = new ArrayList<HospitalMaster>();
			hospitalDAO = new HospitalMasterDAO();
			
			donorCenterList = hospitalDAO.getDonationCenter();
					if(donorCenterList==null)
						throw new Exception();
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
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public HospitalMaster getDonorCenter(@PathParam("donorCenterId") Integer donorCenterId) throws ServiceException
	{
		List<HospitalMaster> donorCenterList=null;
		HospitalMaster donorCenter=null;
		try
		{
			donorCenterList  = getDonorCenters();
			donorCenter = donorCenterList.get(donorCenterId);
		
			if(donorCenter==null)
				throw new Exception();
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorDetailException");

		}
		
		return donorCenter;
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
		List<DonationTicketDetails> ticketList = null; 
		try
		{
			TicketServiceImpl ticketImpl = new TicketServiceImpl();	
			ticketList = ticketImpl.getTickets();
		
			if(ticketList==null)
				throw new Exception();	
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonationTicketDetailException");
		}
		
		return ticketList;
	}
	
	
	@Path("/ticket/{Ticket}")
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails registerTicket(@PathParam("Ticket") DonationTicketDetails newTicket) throws ServiceException
	{
		try
		{
			TicketServiceImpl ticketImpl = new TicketServiceImpl();
			ticketImpl.addTicket(newTicket);
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorTicketDetailException");

		}
		
		return newTicket;
	}
	
	
	@Path("/ticket/{ticketId}")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails getTicket(@PathParam("ticketId") Integer ticketId) throws ServiceException
	{
		
		DonationTicketDetails donationTicketDetails=null;
		try
		{
			TicketServiceImpl ticketImpl = new TicketServiceImpl();	
			donationTicketDetails = ticketImpl.getTicketsByID(ticketId);
		
			if(donationTicketDetails==null)
				throw new Exception();
		}
		catch(Exception serviceException)
		{
			throw new ServiceException("ServiceDonorTicketDetailException");
			
		}
		
		return donationTicketDetails;
	}
	
	
	

	
}
