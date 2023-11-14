package org.models;

import java.util.ArrayList;

public class EventPost {
    private String author;
    private long timeStamp;
    private int pages;
    private int likes;
    private ArrayList<String> comments;

    public EventPost(String author, int number) {

        username= author;
        pages = number;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }


}

