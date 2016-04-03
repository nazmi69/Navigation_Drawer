package com.example.admin.navdrawer1.model;

/**
 * Created by Admin on 3/22/2016.
 */
public class NavDrawerItem {

    private boolean showNotify;
    private String title;

    public NavDrawerItem(){}

    public NavDrawerItem(String title, boolean showNotify){
        this.title = title;
        this.showNotify = showNotify;
    }

    public boolean isShowNotify(){
        return showNotify;
    }

    public void setShowNotify(boolean showNotify){
        this.showNotify = showNotify;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

}
