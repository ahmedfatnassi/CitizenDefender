package org.resources;

import org.database.PostgresJDBC;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import org.models.PostEntity;

import javax.annotation.security.DenyAll;
import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserRessources {
    @DenyAll
    @GET
    @Path("ahmed")
    public PostEntity getIt() {

        // just test of creation an post in webservice


        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "local" );
        EntityManager entitymanager = emfactory.createEntityManager( );

        entitymanager.getTransaction( ).begin( );


        PostEntity post = new PostEntity();
        post.setTitle("zertyuiop");
        post.setContent("azertyuiopkjhbvfgyu");


        entitymanager.persist(post);
        entitymanager.getTransaction().commit();

        /*User user2 = entitymanager.find( User.class,1);
        System.out.println("yyyyyyyyyyeaahhh "+user2.getEmail());
        */entitymanager.close( );
        emfactory.close( );
      return post;
    }

/*@POST
    public Response createUser(){

}*/
}
