package ru.netology.domain;

public class MainPostManager {
    private PostManager postManager;

    public String generatePost() {
        Post[] posts = postManager.getPostForFeed();
        return null;

    }
}
