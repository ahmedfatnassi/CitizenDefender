package org.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
    public class User {
    private   long ID ;
    private String password  ;
    private  String email ;
    private String photoprofilelink  ;
    private String phototcouverturelink ;
    private String Friends;

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

    public User(String name , String firstName, String email , String password , String  CIN) {


        this.email = email ;
        this.password = password ;

    }
    public User(){

    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }






    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }









}
