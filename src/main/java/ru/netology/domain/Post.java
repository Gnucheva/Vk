package ru.netology.domain;

public class Post {
    private int idPost;
    private String ownerPost;
    private int date;
    private String actionsInfo;
    private String bodyOfPost;
    private int likesInfo;
    private int commentsInfo;
    private int repost;
    private int viewsInfo;
    private String  ownerOfWall;
    private String geo;


    public int getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(int viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public Object getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(int likesInfo) {
        this.likesInfo = likesInfo;
    }

    public int getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(int commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int  getDate() {
        return date;
    }

    public int getIdPost() {
        return idPost;
    }

    public String getOwnerOfWall() {
        return ownerOfWall;
    }

    public void setOwnerOfWall(String ownerOfWall) {
        this.ownerOfWall = ownerOfWall;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }


    public String getOwnerPost() {
        return ownerPost;
    }

    public void setOwnerPost(String ownerPost) {
        this.ownerPost = ownerPost;
    }


    public String getActions() {
        return actionsInfo;
    }

    public void setActions(String actions) {
        this.actionsInfo = actionsInfo;
    }

    public String getBodyOfPost() {
        return bodyOfPost;
    }

    public void setBodyOfPost(String bodyOfPost) {
        this.bodyOfPost = bodyOfPost;
    }


}


