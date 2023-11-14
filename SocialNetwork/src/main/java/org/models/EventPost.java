package org.models;

import java.util.ArrayList;

public class EventPost {
    private String author;
    private long timeStamp;
    private int pages;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class EventPost
     * @param author
     * @param number
     */
    public EventPost(String author, int number) {

        username= author;
        pages = number;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    public void like() {
        likes++;
    }

    public void unlike() {
        if (likes > 0){
            likes--;
        }
    }

    public void addComments(String text) {
        comments.add(text);
    }

    public int getPages() {
        return pages;
    }

    public long getTimeStamp() {
        return timestamp;
    }
    /**
     * Displays details of post
     */
    public void display() {

        System.out.println("Author " + author);
        System.out.println("Pages " + pages);
        System.out.println("Posted " + timeString());

        if (likes > 0) {
            System.out.println(likes + " people like this.");
        } else {
            System.out.println();
        }
        if (comments.isEmpty()) {
            System.out.println("No Comments yet...");

        } else {
            System.out.println("   " + comments.size() + " comment(s). Press C to view");
        }
    }
    
    private String timeString() {

        long current = System.currentTimeMillis();
        long pastMillis = current - timestamp;
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        if (minutes > 0) {
            return minutes + " minutes ago";
        } else if(hours > 0){
            return hours + " hours ago";
        } else {
            return "a few seconds ago";
        }

    }
}

