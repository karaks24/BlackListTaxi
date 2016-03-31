package com.taxi.controllers;

import com.google.inject.Inject;
import com.taxi.model.User;
import com.taxi.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("taxi")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

    @Inject
    UserService userService;

    @GET
    @Path("/user")
    public User getUser() {
        return userService.get();
    }

    @GET
    @Path("/message")
    public String getMessage() {
        return "Message from server";
    }
}
