package com.example.ui.model;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category {
    @SerializedName("type")
    private String type;
    @SerializedName("typeName")
    private String typeName;
    @SerializedName("orderIndex")
    private int orderIndex;
    @SerializedName("content")
    private List<Content> content;

    public Category(String type, String typeName, int orderIndex, List<Content> content) {
        this.type = type;
        this.typeName = typeName;
        this.orderIndex = orderIndex;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(int orderIndex) {
        this.orderIndex = orderIndex;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }
}
