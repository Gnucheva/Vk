package ru.netology.domain;

public class OwnerPost {
    private String logoUser;
    private String idUser;
    private String nameUser;

    public String getLogoOwner() {
        return logoUser;
    }

    public void setLogoOwner(String logoOwner) {
        this.logoUser = logoUser;
    }

    public String getIdOwner() {
        return idUser;
    }

    public void setIdOwner(String idOwner) {
        this.idUser = idUser;
    }

    public String getNameOwner() {
        return nameUser;
    }

    public void setNameOwner(String nameOwner) {
        this.nameUser = nameUser;
    }
}

