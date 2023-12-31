package org.models;

import java.util.ArrayList;

public class Post {
    public String username;
    public long timestamp;
    public int likes;
    public ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     * @param author
     */
    public Post(String author){
        username= author;
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

    public void addComment(String text) {
        comments.add(text);
    }

    public long getTimeStamp() {
        return timestamp;
    }

    /**
     * Displays details of post
     */
    public void display() {

        System.out.println("Username " + username);
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

