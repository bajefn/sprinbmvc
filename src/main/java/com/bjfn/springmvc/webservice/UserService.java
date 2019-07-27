package com.bjfn.springmvc.webservice;

import com.bjfn.springmvc.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


public interface UserService {

    public String sayHello(String name);
    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> findAll();
}
