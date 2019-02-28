package org.resources;

import org.database.PostgresJDBC;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.models.User;

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
    public ArrayList<User> getIt() {

       /* Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        */EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "local" );
        System.out.println("hellooeew ");
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        User user = new User("ahmed","fatnassi","ahmedfatnassi23@gmail.com","3216464","0721492");
      User user1= new User();
      ArrayList<User> ahmeds = new ArrayList<>(2);
      ahmeds.add(user);
      ahmeds.add(user1);
        entitymanager.persist(user);
        entitymanager.getTransaction( ).commit( );

        /*User user2 = entitymanager.find( User.class,1);
        System.out.println("yyyyyyyyyyeaahhh "+user2.getEmail());
        */entitymanager.close( );
        emfactory.close( );
      return ahmeds;
    }

/*@POST
    public Response createUser(){

}*/
}
