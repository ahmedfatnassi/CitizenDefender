package org.models;

import org.glassfish.jersey.message.filtering.EntityFiltering;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import static javax.persistence.GenerationType.IDENTITY;

@XmlRootElement
@Embeddable
@Entity
    public class User {
        @Id
        @TableGenerator(name="User")
        @GeneratedValue(strategy=GenerationType.TABLE)

        public   long ID ;
    @NotNull
    public String password  ;
    @NotNull
    public  String email ;
    @NotNull
    public String photoprofilelink  ;
    @NotNull
    public String phototcouverturelink ;
    @NotNull
    public String Friends;

    public User(String name , String firstName, String email , String password , String  CIN) {

        this.email = email ;
        this.password = password ;

    }
    public User(){

    }


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoprofilelink() {
        return photoprofilelink;
    }

    public void setPhotoprofilelink(String photoprofilelink) {
        this.photoprofilelink = photoprofilelink;
    }

    public String getPhototcouverturelink() {
        return phototcouverturelink;
    }

    public void setPhototcouverturelink(String phototcouverturelink) {
        this.phototcouverturelink = phototcouverturelink;
    }

    public String getFriends() {
        return Friends;
    }

    public void setFriends(String friends) {
        Friends = friends;
    }
}
