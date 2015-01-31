package com.chankan.application.thinktank.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.chankan.application.thinktank.bean.DonorCenter;
import com.chankan.application.thinktank.bean.DonorDetails;
import com.chankan.application.thinktank.bean.DonationTicketDetails;


@Path("/service")
public class DonorResource {
	
	@GET
	@Path("/hospital")
	public String getHospital() 
	{
		return "Hello ThinkTank";
	}
	
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
	
	@Path("/donorSearch/{donorId}")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonorDetails getDonor()
	{
		return null;
	}
	
	@Path("/donor")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<DonorDetails> getDonors()
	{
		return null;
	}
	
	@Path("/donor")
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonorDetails updateDonors()
	{
		return null;
	}
	
	@Path("/ticket")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<DonationTicketDetails> getTickets()
	{
		return null;
	}
	
	@Path("/ticket")
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails registerTicket()
	{
		return null;
	}
	
	@Path("/ticketStatus")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public DonationTicketDetails getTicketStatus()
	{
		return null;
	}
	
}
