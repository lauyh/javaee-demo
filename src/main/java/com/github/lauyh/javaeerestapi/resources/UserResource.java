package com.github.lauyh.javaeerestapi.resources;

import com.github.lauyh.javaeerestapi.model.HttpResponse;
import com.github.lauyh.javaeerestapi.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    final Logger logger = Logger.getLogger(UserResource.class.getName());
    @GET
    @Path("/getUserInfo")
    public HttpResponse<Person> getUserInfo(){
        logger.log(Level.INFO,">> start of getUserInfo");
        Person person = new Person("Clarkson", 44);
        HttpResponse<Person> res = new HttpResponse<>();
        res.setErrorCode("0");
        res.setStatusCode(200);
        res.setErrorMessage("");
        res.setData(person);
//        logger.log(Level.INFO,"response --> {}", res);
        logger.log(Level.INFO,"> end of getUserInfo");
        return res;
    }

    @GET
    @Path("/getAllUser")
    public HttpResponse<List<Person>> getAllUserInfo(){
        logger.log(Level.INFO,"> start of getAllUserInfo");
        Person person = new Person("Clarkson", 44);
        Person person2 = new Person("Hammond", 56);
        List<Person> data = new ArrayList<>();
        data.add(person);
        data.add(person2);
        HttpResponse<List<Person>> res = new HttpResponse<>();
        res.setErrorCode("0");
        res.ok();
        res.setErrorMessage("");
        res.setData(data);
//        logger.log(Level.INFO,"response --> {}", res);
        logger.log(Level.INFO,"> end of getAllUserInfo");
        return res;
    }

    @POST
    @Path("/register")
    public HttpResponse<Person> register(Person person){
//        logger.trace("> start of register");
        HttpResponse<Person> res = new HttpResponse<>();
        res.setErrorCode("0");
        res.setStatusCode(201);
        res.setErrorMessage("");
        res.setData(person);
//        logger.trace("> end of register");
        return res;
    }

}
