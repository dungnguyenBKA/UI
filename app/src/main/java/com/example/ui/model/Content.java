
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
    @SerializedName("verticalLogo")
    @Expose
    private String verticalLogo;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("chapCount")
    @Expose
    private Integer chapCount;
    @SerializedName("newestChapter")
    @Expose
    private String newestChapter;
    @SerializedName("adultContent")
    @Expose
    private Boolean adultContent;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("viewCount")
    @Expose
    private Integer viewCount;
    @SerializedName("likedCount")
    @Expose
    private Integer likedCount;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("author")
    @Expose
    private Author_ author;
    @SerializedName("averageRate")
    @Expose
    private Integer averageRate;
    @SerializedName("avgRate")
    @Expose
    private Double avgRate;
    @SerializedName("reviewCount")
    @Expose
    private Integer reviewCount;
    @SerializedName("horizontalLogo")
    @Expose
    private String horizontalLogo;
    @SerializedName("categoryVietName")
    @Expose
    private String categoryVietName;
    @SerializedName("comics")
    @Expose
    private List<Content> comics = null;
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

    public Integer getChapCount() {
        return chapCount;
    }

    public void setChapCount(Integer chapCount) {
        this.chapCount = chapCount;
    }

    public String getNewestChapter() {
        return newestChapter;
    }

    public void setNewestChapter(String newestChapter) {
        this.newestChapter = newestChapter;
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

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getLikedCount() {
        return likedCount;
    }

    public void setLikedCount(Integer likedCount) {
        this.likedCount = likedCount;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Author_ getAuthor() {
        return author;
    }

    public void setAuthor(Author_ author) {
        this.author = author;
    }

    public Integer getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(Integer averageRate) {
        this.averageRate = averageRate;
    }

    public Double getAvgRate() {
        return avgRate;
    }

    public void setAvgRate(Double avgRate) {
        this.avgRate = avgRate;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
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

    public List<Content> getComics() {
        return comics;
    }

    public void setComics(List<Content> comics) {
        this.comics = comics;
    }

    public List<Object> getComicsReviewNewest() {
        return comicsReviewNewest;
    }

    public void setComicsReviewNewest(List<Object> comicsReviewNewest) {
        this.comicsReviewNewest = comicsReviewNewest;
    }

}
