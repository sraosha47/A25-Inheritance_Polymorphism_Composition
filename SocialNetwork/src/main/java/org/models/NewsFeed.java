package org.models;

import java.util.ArrayList;

public class NewsFeed {
    public ArrayList<Post> posts;

    public NewsFeed() {
        posts = new ArrayList<>();
    }

    public void addPost(Post newpost) {
        posts.add(newpost);
    }

    public void show() {

        for(Post post : posts) {
            post.display();
            System.out.println();
        }

    }

}