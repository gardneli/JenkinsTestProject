/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitchology.jenkinstestproject;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;

/**
* REST Web Service
*
* @author mkuchtiak
*/
@Stateless
@Path("/helloWorld")
public class HelloWorldResource {
/* Test 
 
 * 
 * 
 */
    @EJB
    private NamedStorageBean nameStorage = new NamedStorageBean();

    /**
* Retrieves representation of an instance of helloworld.HelloWorldResource
*
* @return an instance of java.lang.String
*/
    @GET
    @Produces("text/html")
    public String getXml() {
        return String.format("<html><body><h1>Hello %s!</h1></body></html>",
                nameStorage.getName());
    }

    /**
* PUT method for updating an instance of HelloWorldResource
*
* @param content representation for the resource
* @return an HTTP response with content of the updated or created resource.
*/
    @PUT
    @Consumes("text/plain")
    public void putXml(String content) {
        nameStorage.setName(content);
    }
}