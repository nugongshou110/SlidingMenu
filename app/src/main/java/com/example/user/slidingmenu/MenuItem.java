package com.example.user.slidingmenu;

/**
 * Created by user on 2016/2/19.
 */
public class MenuItem {
    private int resId;
    private String name;
    public MenuItem(){

    }

    public MenuItem(int resId, String name) {
        this.resId = resId;
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
