package org.models;

import javax.persistence.*;

@Entity
@Table(name = "organistaion", schema = "public", catalog = "citizendefender")
public class OrganistaionEntity {
    private int id;
    private String type;
    private String logopath;
    private String apropos;
    private String photocorverpath;
    private String name;
    private String address;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 40)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "logopath", nullable = true, length = 70)
    public String getLogopath() {
        return logopath;
    }

    public void setLogopath(String logopath) {
        this.logopath = logopath;
    }

    @Basic
    @Column(name = "apropos", nullable = true, length = 1000)
    public String getApropos() {
        return apropos;
    }

    public void setApropos(String apropos) {
        this.apropos = apropos;
    }

    @Basic
    @Column(name = "photocorverpath", nullable = true, length = 100)
    public String getPhotocorverpath() {
        return photocorverpath;
    }

    public void setPhotocorverpath(String photocorverpath) {
        this.photocorverpath = photocorverpath;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 60)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 80)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganistaionEntity that = (OrganistaionEntity) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (logopath != null ? !logopath.equals(that.logopath) : that.logopath != null) return false;
        if (apropos != null ? !apropos.equals(that.apropos) : that.apropos != null) return false;
        if (photocorverpath != null ? !photocorverpath.equals(that.photocorverpath) : that.photocorverpath != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (logopath != null ? logopath.hashCode() : 0);
        result = 31 * result + (apropos != null ? apropos.hashCode() : 0);
        result = 31 * result + (photocorverpath != null ? photocorverpath.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
