package com.example.hadusa.utils;

/**
 * Created by hadusa on 12/4/2015.
 */
public class demoJson {
    private int icon;
    private String title;
    private String description;

    public demoJson(String title, int icon) {
        this.icon = icon;
        this.title = title;
    }

    public demoJson() {

    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
