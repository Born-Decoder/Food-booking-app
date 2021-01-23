package com.example.edible;

public class MyListData {
    private String description;
    private int imgId;

    public MyListData(String description2, int imgId2) {
        this.description = description2;
        this.imgId = imgId2;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description2) {
        this.description = description2;
    }

    public int getImgId() {
        return this.imgId;
    }

    public void setImgId(int imgId2) {
        this.imgId = imgId2;
    }
}
