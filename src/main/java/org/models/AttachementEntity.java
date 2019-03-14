package org.models;

import javax.persistence.Entity;

@Entity
@javax.persistence.Table(name = "attachement", schema = "public", catalog = "citizendefender")
public class AttachementEntity {
    private int id;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String attachementType;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "attachement_type", nullable = false, length = 40)
    public String getAttachementType() {
        return attachementType;
    }

    public void setAttachementType(String attachementType) {
        this.attachementType = attachementType;
    }

    private Integer idPost;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "id_post", nullable = true)
    public Integer getIdPost() {
        return idPost;
    }

    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }

    private Integer idComment;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "id_comment", nullable = true)
    public Integer getIdComment() {
        return idComment;
    }

    public void setIdComment(Integer idComment) {
        this.idComment = idComment;
    }

    private String title;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "title", nullable = true, length = 60)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String description;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "description", nullable = true, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttachementEntity that = (AttachementEntity) o;

        if (id != that.id) return false;
        if (attachementType != null ? !attachementType.equals(that.attachementType) : that.attachementType != null)
            return false;
        if (idPost != null ? !idPost.equals(that.idPost) : that.idPost != null) return false;
        if (idComment != null ? !idComment.equals(that.idComment) : that.idComment != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (attachementType != null ? attachementType.hashCode() : 0);
        result = 31 * result + (idPost != null ? idPost.hashCode() : 0);
        result = 31 * result + (idComment != null ? idComment.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
