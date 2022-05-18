package com.rikkeisoft.project_training.models;

public class ChildModel {
    private int imageRes;
    private String content;

    public ChildModel() {

    }

    public ChildModel(int imageRes) {
        this.imageRes = imageRes;
    }

    public ChildModel(int imageRes, String content) {
        this.imageRes = imageRes;
        this.content = content;
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
