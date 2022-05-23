package com.rikkeisoft.project_training.recyclerview.models;

import com.rikkeisoft.project_training.old.adapters.old_way_recyclerview_adapter.SubItemOneAdapter;
import com.rikkeisoft.project_training.old.adapters.old_way_recyclerview_adapter.SubItemThreeAdapter;
import com.rikkeisoft.project_training.old.adapters.old_way_recyclerview_adapter.SubItemTwoAdapter;

public class Item {
    private int id;
    private String title;
    private SubItemOneAdapter subItemOneAdapter;
    private SubItemTwoAdapter subItemTwoAdapter;
    private SubItemThreeAdapter subItemThreeAdapter;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Item(int id, SubItemOneAdapter subItemOneAdapter) {
        this.id = id;
        this.subItemOneAdapter = subItemOneAdapter;
    }

    public Item(int id, SubItemTwoAdapter subItemTwoAdapter) {
        this.id = id;
        this.subItemTwoAdapter = subItemTwoAdapter;
    }

    public Item(int id, SubItemThreeAdapter subItemThreeAdapter) {
        this.id = id;
        this.subItemThreeAdapter = subItemThreeAdapter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SubItemOneAdapter getSubItemOneAdapter() {
        return subItemOneAdapter;
    }

    public void setSubItemOneAdapter(SubItemOneAdapter subItemOneAdapter) {
        this.subItemOneAdapter = subItemOneAdapter;
    }

    public SubItemTwoAdapter getSubItemTwoAdapter() {
        return subItemTwoAdapter;
    }

    public void setSubItemTwoAdapter(SubItemTwoAdapter subItemTwoAdapter) {
        this.subItemTwoAdapter = subItemTwoAdapter;
    }

    public SubItemThreeAdapter getSubItemThreeAdapter() {
        return subItemThreeAdapter;
    }

    public void setSubItemThreeAdapter(SubItemThreeAdapter subItemThreeAdapter) {
        this.subItemThreeAdapter = subItemThreeAdapter;
    }
}
