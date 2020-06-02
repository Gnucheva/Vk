package ru.netology.domain;

public class CommentsInfo {
    private String idUser;
    private String textOfComment;
    private Integer sumOfComment;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getTextOfComment() {
        return textOfComment;
    }

    public void setTextOfComment(String textOfComment) {
        this.textOfComment = textOfComment;
    }

    public Integer getSumOfComment() {
        return sumOfComment;
    }

    public void setSumOfComment(Integer sumOfComment) {
        this.sumOfComment = sumOfComment;
    }
}
