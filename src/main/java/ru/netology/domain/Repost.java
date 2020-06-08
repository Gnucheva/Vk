package ru.netology.domain;

public class Repost {
    private String idUser;
    private int  sumOfRepost;

    public String  getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getSumOfRepost() {
        return sumOfRepost;
    }

    public void setSumOfRepost(int sumOfRepost) {
        this.sumOfRepost = sumOfRepost;
    }
}
