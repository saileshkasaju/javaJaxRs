/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.webapp.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path(value = "student")
public class StudentAPI {
    
    @GET
    @Produces(value = "text/plain")
    public String index() {
        return "<h1>JAX RS WORKS</h1>";
    }
    
    @Path(value = "/{id}/{name}")
    @GET
    public String detail (@PathParam("id")int id) {        
        return "Id is : " + id;
    }
    
    @Path(value="/edit") 
    @POST
    public String edit(@FormParam("id")int id) {
        return "<h1>Edit id: " + id + "</h1>";
    }
}