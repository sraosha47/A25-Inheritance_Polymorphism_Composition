package org.models;

import java.util.ArrayList;

public class EventPost extends Post{
    private int pages;

    /**
     * Constructor for objects of class EventPost
     * @param author
     * @param number
     */
    public EventPost(String author, int number) {
        super(author);
        pages = number;
    }

    public int getPages() {
        return pages;
    }

    /**
     * Displays details of post
     */
    public void display() {
        super.display();
        System.out.println("Pages " + pages);
    }
}

