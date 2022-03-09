package com.example.customlistviewexample;

public class Language {
    private int id;
    private String title;
    private String nameShop;

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

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public Language(int id, String title, String nameShop) {
        this.id = id;
        this.title = title;
        this.nameShop = nameShop;
    }
}
