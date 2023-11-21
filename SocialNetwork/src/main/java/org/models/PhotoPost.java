package org.models;

import java.util.ArrayList;

/**
 * This class represents photo posts.
 * It is currently only a prototype but could be extended to show photos.
 *
 * @author based on ObjectsFirst book
 *
 */

public class PhotoPost extends Post {

    private String filename;
    private String caption;
    /**
     * Constructor for objects of class PhotoPost
     * @param author
     * @param file
     * @param text
     */
    public PhotoPost(String author, String file, String text) {
        super(author);
        filename = file;
        caption = text;
    }

    public String getImageFile() {
        return filename;
    }


    public String getCaption() {
        return caption;
    }

    /**
     * Simulate display for the time being
     */
    public void display() {
        super.display();
        System.out.println("FileName " + "{" + filename + "}");
        System.out.println("Caption " + caption);
    }

}