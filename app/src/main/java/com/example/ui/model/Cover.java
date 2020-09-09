
package com.example.ui.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cover {

    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("deepLink")
    @Expose
    private String deepLink;
    @SerializedName("index")
    @Expose
    private Integer index;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("comicId")
    @Expose
    private String comicId;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("comicName")
    @Expose
    private String comicName;
    @SerializedName("type")
    @Expose
    private String type;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComicId() {
        return comicId;
    }

    public void setComicId(String comicId) {
        this.comicId = comicId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
