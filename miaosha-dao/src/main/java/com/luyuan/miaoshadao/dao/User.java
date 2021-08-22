package com.luyuan.miaoshadao.dao;

public class User {
    private Long id;

    private String userName;

    public User(Long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", id=" + id +
                ", userName=" + userName +
                "]";
    }
}