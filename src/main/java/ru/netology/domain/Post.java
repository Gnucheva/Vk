package ru.netology.domain;

public class Post {
    private String idPost;
    private String ownerPost;
    private String date;
    private String actionsInfo;
    private String bodyOfPost;
    private String likesInfo;
    private String commentsInfo;
    private String repost;
    private String viewsInfo;

    public String getIdPost() {
        return idPost;
    }

    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }

    public String getOwnerPost() {
        return ownerPost;
    }

    public void setOwnerPost(String ownerPost) {
        this.ownerPost = ownerPost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getLikes() {
        return likesInfo;
    }

    public void setLikes(String likes) {
        this.likesInfo = likesInfo;
    }

    public String getComments() {
        return commentsInfo;
    }

    public void setComments(String comments) {
        this.commentsInfo = commentsInfo;
    }

    public String getRepost() {
        return repost;
    }

    public void setRepost(String repost) {
        this.repost = repost;
    }

    public String getViews() {
        return viewsInfo;
    }

    public void setViews(String views) {
        this.viewsInfo = viewsInfo;
    }
}


