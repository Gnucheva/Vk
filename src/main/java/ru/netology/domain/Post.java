package ru.netology.domain;

public class Post {
    private Integer idPost;
    private String ownerPost;
    private Integer date;
    private String actionsInfo;
    private String bodyOfPost;
    private Object likesInfo;
    private Object commentsInfo;
    private Object repost;
    private Object viewsInfo;
    private Integer ownerOfWall;
    private String geo;


    public Object getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(Object viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public void setRepost(Object repost) {
        this.repost = repost;
    }

    public Object getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(Object likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Object getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(Object commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getIdPost() {
        return idPost;
    }

    public Integer getOwnerOfWall() {
        return ownerOfWall;
    }

    public void setOwnerOfWall(Integer ownerOfWall) {
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


