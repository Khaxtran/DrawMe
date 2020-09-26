package com.example.drawme.ui.dashboard;

public class Item {
    private String name;
    private String imgUrl;
    public Item(String name, String imgUrl){
        this.name = name;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public void setName(String name) {
        this.name = name;
    }
}
