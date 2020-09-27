
package com.example.ui.model.cosmic;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("typeName")
    @Expose
    private String typeName;
    @SerializedName("covers")
    @Expose
    private List<Cover> covers = null;
    @SerializedName("orderIndex")
    @Expose
    private Integer orderIndex;
    @SerializedName("content")
    @Expose
    private List<Content> content = null;

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

    public List<Cover> getCovers() {
        return covers;
    }

    public void setCovers(List<Cover> covers) {
        this.covers = covers;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

}
