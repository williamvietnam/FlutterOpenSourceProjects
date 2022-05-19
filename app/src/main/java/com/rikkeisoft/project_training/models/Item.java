package com.rikkeisoft.project_training.models;

import java.util.List;

public class Item {
    private String title;
    private List<SubItem> subItems;

    public Item(String title, List<SubItem> subItems) {
        this.title = title;
        this.subItems = subItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubItem> getSubItems() {
        return subItems;
    }

    public void setSubItems(List<SubItem> subItems) {
        this.subItems = subItems;
    }
}
