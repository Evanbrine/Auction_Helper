package com.example.auction_helper;

public class ListItem {
    private String title;
    private String code;

    public ListItem(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return title + " (" + code + ")";
    }
}
