
package com.example.ui.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("comicName")
    @Expose
    private String comicName;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("author")
    @Expose
    private Author_ author;
    @SerializedName("horizontalLogo")
    @Expose
    private String horizontalLogo;
    @SerializedName("categoryVietName")
    @Expose
    private String categoryVietName;
    @SerializedName("comics")
    @Expose
    private List<Object> comics = null;
    @SerializedName("comicsReviewNewest")
    @Expose
    private List<Object> comicsReviewNewest = null;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Author_ getAuthor() {
        return author;
    }

    public void setAuthor(Author_ author) {
        this.author = author;
    }

    public String getHorizontalLogo() {
        return horizontalLogo;
    }

    public void setHorizontalLogo(String horizontalLogo) {
        this.horizontalLogo = horizontalLogo;
    }

    public String getCategoryVietName() {
        return categoryVietName;
    }

    public void setCategoryVietName(String categoryVietName) {
        this.categoryVietName = categoryVietName;
    }

    public List<Object> getComics() {
        return comics;
    }

    public void setComics(List<Object> comics) {
        this.comics = comics;
    }

    public List<Object> getComicsReviewNewest() {
        return comicsReviewNewest;
    }

    public void setComicsReviewNewest(List<Object> comicsReviewNewest) {
        this.comicsReviewNewest = comicsReviewNewest;
    }

}
