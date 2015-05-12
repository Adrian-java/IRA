package com.eclinic.rest.resources;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.eclinic.db.model.Task;
import com.eclinic.db.query.TaskQuery;

@Named
@Path("/task")
public class TaskResources {

	private TaskQuery taskQuery;
	
	@POST
    @Path("/add")
    @Produces({ MediaType.APPLICATION_JSON})
	@Consumes({ MediaType.APPLICATION_JSON})
    public Response addTask(Task task) {
		taskQuery.addTask(task);
       return Response.ok(task).build();
    }
	
	@POST
    @Path("delete")
    @Produces({ MediaType.APPLICATION_JSON})
    @Consumes({ MediaType.APPLICATION_JSON})
    public Response deleteTask(Task task) {
       return null;
    }
	
	@POST
    @Path("modify")
    @Produces({ MediaType.APPLICATION_JSON})
    @Consumes({ MediaType.APPLICATION_JSON})
    public Response modifyTask(Task task) {
       return null;
    }

}
