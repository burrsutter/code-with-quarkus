package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String stuff() {
        return "default stuff";
    }

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("bye")
    @Produces(MediaType.TEXT_PLAIN)
    public String bye() {
        return "Bye from RESTEasy Reactive";
    }
    
}