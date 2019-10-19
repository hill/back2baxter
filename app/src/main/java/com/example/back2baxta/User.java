package com.example.back2baxta;

public class User {

    // unique identifier of a user
    private int userID;

    private String username;
    private String event;
    private String leaving;
    private int imageDrawableId;

    public User(int userID, String event, String leaving, int imageDrawableId) {
        this.userID = userID;
        this.event = event;
        this.leaving = leaving;
        this.imageDrawableId = imageDrawableId;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getLeaving() {
        return leaving;
    }

    public void setLeaving(String leaving) {
        this.leaving = leaving;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}
