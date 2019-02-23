package org.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;

@XmlRootElement
public class Post {

    private Date  date  ;
    private long Id ;
    private String desription  ;
    private ArrayList<String> photolinks ;
    private ArrayList<String> videolinks ;
    private ArrayList<String> adoptersID ;
    private ArrayList<String> commentiD;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public ArrayList<String> getPhotolinks() {
        return photolinks;
    }

    public void setPhotolinks(ArrayList<String> photolinks) {
        this.photolinks = photolinks;
    }

    public ArrayList<String> getVideolinks() {
        return videolinks;
    }

    public void setVideolinks(ArrayList<String> videolinks) {
        this.videolinks = videolinks;
    }

    public ArrayList<String> getAdopters() {
        return adoptersID;
    }

    public void setAdopters(ArrayList<String> adopters) {
        this.adoptersID = adopters;
    }

    public ArrayList<String> getCommentiD() {
        return commentiD;
    }

    public void setCommentiD(ArrayList<String> commentiD) {
        this.commentiD = commentiD;
    }
}
