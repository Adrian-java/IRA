package com.eclinic.rest.resources;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Named
@Path("/")
public class HelloRestService {


    // curl http://localhost:8080/resteasy_spring_p1/rest/Hello/text?msg=Hi%20There
    @GET
    @Path("text")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayTextHello(@QueryParam("msg") String msg) {
        return Response.ok("abc").build();
    }

    // curl -X POST -H "Content-Type: application/json" -d '{"msg":"Hi There","gender":"MALE"}'
    // http://localhost:8080/resteasy_spring_p1/rest/Hello/javabean
    @POST
    @Path("javas")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response sayJavaBeanHello() {
        return Response.ok("hello").build();
    }
}