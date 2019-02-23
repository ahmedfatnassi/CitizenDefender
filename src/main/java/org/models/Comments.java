package org.models;

import java.util.ArrayList;
import java.util.Date;

public class Comments {
    private Date creation ;
    private long IDuser ;
    private String  desription ;
    private ArrayList<Long> personID ;

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    private String imageLink ;

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public long getIDuser() {
        return IDuser;
    }

    public void setIDuser(long IDuser) {
        this.IDuser = IDuser;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public ArrayList<Long> getPersonID() {
        return personID;
    }

    public void setPersonID(ArrayList<Long> personID) {
        this.personID = personID;
    }
}
