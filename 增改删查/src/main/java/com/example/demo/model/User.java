package com.example.demo.model;

public class User {
    private long id;
    private String img;
    private String title;
    private String name;
    private String des;
    private String classify;
    private Integer isdownload;
    private String empower;

    public long getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getClassify() {
        return classify;
    }

    public String getDes() {
        return des;
    }

    public String getEmpower() {
        return empower;
    }

    public Integer getIsDownLoad() {
        return isdownload;
    }

    public void setId(long Id) {
        id = Id;
    }

    public void setImg(String Img) {
        img = Img;
    }

    public void setTitle(String Title) {
        title = Title;
    }

    public void setName(String Name) {
        name = Name;
    }

    public void setDes(String Desc) {
        des = Desc;
    }

    public void setClassify(String Classify) {
        classify = Classify;
    }

    public void setIsDownLoad(Integer ISDownLoad) {
        this.isdownload = ISDownLoad;
    }

    public void setEmpower(String Empower) {
        empower = Empower;
    }
}