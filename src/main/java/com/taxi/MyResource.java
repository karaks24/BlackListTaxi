package com.taxi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("taxi")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
    public String getIt() {
        return "Got it!";
    }
}
