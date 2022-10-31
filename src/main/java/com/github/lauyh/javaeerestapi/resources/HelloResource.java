package com.github.lauyh.javaeerestapi.resources;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/hello-world")
public class HelloResource {
//    final Logger logger = LoggerFactory.getLogger(HelloResource.class);

    Logger logger = Logger.getLogger(HelloResource.class.getName());

    @GET
    @Produces("text/plain")
    public String hello() {
//        logger.debug("hello func is being called");
        logger.log(Level.INFO,"hello func is being called");
        return "Hello, World!";
    }

    @GET
    @Path("/greeting")
    @Produces("text/plain")
    public String greeting(){return "Greeting";}

    @GET
    @Path("/greet/{name}")
    public Response greetWithName(@PathParam("name")  String name){

        return Response.ok("Hello " + name).build();
    }
}