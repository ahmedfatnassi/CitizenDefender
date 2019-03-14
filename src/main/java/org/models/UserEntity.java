package org.models;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "public", catalog = "citizendefender")
public class UserEntity {
    private int id;
    private String name;
    private String email;
    private String password;
    private Integer cin;
    private String photopath;
    private String couverturepath;
    private Boolean isadmin;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 60)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "cin", nullable = true)
    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    @Basic
    @Column(name = "photopath", nullable = true, length = -1)
    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

    @Basic
    @Column(name = "couverturepath", nullable = true, length = -1)
    public String getCouverturepath() {
        return couverturepath;
    }

    public void setCouverturepath(String couverturepath) {
        this.couverturepath = couverturepath;
    }

    @Basic
    @Column(name = "isadmin", nullable = true)
    public Boolean getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (cin != null ? !cin.equals(that.cin) : that.cin != null) return false;
        if (photopath != null ? !photopath.equals(that.photopath) : that.photopath != null) return false;
        if (couverturepath != null ? !couverturepath.equals(that.couverturepath) : that.couverturepath != null)
            return false;
        if (isadmin != null ? !isadmin.equals(that.isadmin) : that.isadmin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (cin != null ? cin.hashCode() : 0);
        result = 31 * result + (photopath != null ? photopath.hashCode() : 0);
        result = 31 * result + (couverturepath != null ? couverturepath.hashCode() : 0);
        result = 31 * result + (isadmin != null ? isadmin.hashCode() : 0);
        return result;
    }
}
