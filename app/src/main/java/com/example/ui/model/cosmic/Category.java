
package com.example.ui.model.cosmic;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("categoryId")
    @Expose
    private String categoryId;
    @SerializedName("categoryCode")
    @Expose
    private String categoryCode;
    @SerializedName("categoryEngName")
    @Expose
    private String categoryEngName;
    @SerializedName("categoryVietName")
    @Expose
    private String categoryVietName;
    @SerializedName("categorySlug")
    @Expose
    private String categorySlug;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryEngName() {
        return categoryEngName;
    }

    public void setCategoryEngName(String categoryEngName) {
        this.categoryEngName = categoryEngName;
    }

    public String getCategoryVietName() {
        return categoryVietName;
    }

    public void setCategoryVietName(String categoryVietName) {
        this.categoryVietName = categoryVietName;
    }

    public String getCategorySlug() {
        return categorySlug;
    }

    public void setCategorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
    }

}
