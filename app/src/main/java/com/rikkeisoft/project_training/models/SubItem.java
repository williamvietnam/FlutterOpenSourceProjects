package com.rikkeisoft.project_training.models;

public class SubItem {

    private int id;
    private int imageRes;
    private String content;

    public SubItem() {

    }

    public SubItem(int imageRes) {
        this.imageRes = imageRes;
    }

    public SubItem(int imageRes, String content) {
        this.imageRes = imageRes;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}
