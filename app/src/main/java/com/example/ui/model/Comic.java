
package com.example.ui.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comic {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("comicName")
    @Expose
    private String comicName;
    @SerializedName("verticalLogo")
    @Expose
    private String verticalLogo;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("adultContent")
    @Expose
    private Boolean adultContent;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("author")
    @Expose
    private Author__ author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public String getVerticalLogo() {
        return verticalLogo;
    }

    public void setVerticalLogo(String verticalLogo) {
        this.verticalLogo = verticalLogo;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAdultContent() {
        return adultContent;
    }

    public void setAdultContent(Boolean adultContent) {
        this.adultContent = adultContent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Author__ getAuthor() {
        return author;
    }

    public void setAuthor(Author__ author) {
        this.author = author;
    }

}
