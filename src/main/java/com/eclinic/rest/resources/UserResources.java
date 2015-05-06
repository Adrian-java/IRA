package com.eclinic.rest.resources;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.eclinic.db.model.Users;
import com.eclinic.db.query.UsersQuery;

@Named
@Path("/u")
public class UserResources {

	private UsersQuery usersQuery;
	
	@POST
    @Path("add")
    @Produces({ MediaType.APPLICATION_JSON})
	@Consumes({ MediaType.APPLICATION_JSON})
    public Response addUser(Users user) {
		usersQuery.addUser(user);
       return Response.ok(user).build();
    }
	
	@POST
    @Path("delete")
    @Produces({ MediaType.APPLICATION_JSON})
    @Consumes({ MediaType.APPLICATION_JSON})
    public Response deleteUser(Users user) {
       return null;
    }
	
	@POST
    @Path("modify")
    @Produces({ MediaType.APPLICATION_JSON})
    @Consumes({ MediaType.APPLICATION_JSON})
    public Response modifyUser(Users user) {
       return null;
    }

	public UsersQuery getUsersQuery() {
		return usersQuery;
	}

	public void setUsersQuery(UsersQuery usersQuery) {
		this.usersQuery = usersQuery;
	}
}
