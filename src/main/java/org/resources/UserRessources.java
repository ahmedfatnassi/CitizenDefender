package org.resources;

import org.database.PostgresJDBC;
import org.models.User;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserRessources {
    @RolesAllowed("ADMIN")
    @GET
    @Path("ahmed")
    public ArrayList<User> getIt() {
      User user = new User("ahmed","fatnassi","ahmedfatnassi23@gmail.com","3216464","0721492");
      User user1= new User();
      ArrayList<User> ahmeds = new ArrayList<>(2);
      ahmeds.add(user);
      ahmeds.add(user1);
      PostgresJDBC pt = new PostgresJDBC();
      pt.connection();
      return ahmeds;
    }

/*@POST
    public Response createUser(){

}*/
}
