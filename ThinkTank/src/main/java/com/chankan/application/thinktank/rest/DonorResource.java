package com.chankan.application.thinktank.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/service")
public class DonorResource {
	
	@GET
	@Path("/hospital")
	public String getHospital() {
		return "Hello ThinkTank";
	}

}
