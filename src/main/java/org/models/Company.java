package org.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Company extends User  {
    private String apropos  ;
    private String website ;


    public String getApropos() {
        return apropos;
    }

    public void setApropos(String apropos) {
        this.apropos = apropos;
    }





}
