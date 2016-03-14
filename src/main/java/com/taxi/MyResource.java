package com.taxi;

import com.google.inject.Inject;
import com.taxi.service.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("taxi")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

    @Inject
    Service service;

    @GET
    public String getIt() {
        return service.sayHello();
    }
}
