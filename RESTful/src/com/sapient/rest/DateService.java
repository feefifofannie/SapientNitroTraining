package com.sapient.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;;

@Path("/date")
public class DateService {
	List<String> dates = new ArrayList<String>();
	
	@GET
	@Path("/query")
	@Produces(MediaType.TEXT_HTML)
	//for queryParam, pass parameters in url with ?attribute=value&attribute=value
	public String queryDate(@QueryParam("year") int year, @QueryParam("month") int month, @QueryParam("day") int day){
		return "<b>"+day+":"+month+":"+year+"</b>";
	}
	
	@GET
	@Path("/fetch/{year}/{month}/{day}")
	@Produces(MediaType.TEXT_HTML)
	//for pathParam, pass parameters in url in correct order divided by /
	public String fetchDate(@PathParam("year") int year, @PathParam("month") int month, @PathParam("day") int day){
		return "<b>"+day+":"+month+":"+year+"</b>";
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.TEXT_HTML)
	//for pathParam, pass parameters in url in correct order divided by /
	public String setDate(@FormParam("year") int year, @FormParam("month") int month, @FormParam("day") int day){
		return "<b>"+day+":"+month+":"+year+"</b>";
	}
	
	 @PUT
	 @Path("/update")
	 @Produces(MediaType.TEXT_HTML)
	 public String createDate(@FormParam("year") int year, @FormParam("month") int month, @FormParam("day") int day){
		 return day+":"+month+":"+year+" updated";
	 }
	 
	 @DELETE
	 @Path("/delete")
	 @Produces(MediaType.TEXT_HTML)
	 public String deleteDate(@FormParam("year") int year, @FormParam("month") int month, @FormParam("day") int day){
		 return day+":"+month+":"+year+" deleted";
	 }
}
