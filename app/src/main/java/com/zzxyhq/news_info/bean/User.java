package com.zzxyhq.news_info.bean;

import java.util.Arrays;


public class User {
    private String name;            //用户名
    private String password;        //密码
    private String tel;// 手机号
    private String motto;//个性签名
    private Integer remember;
    private String portrait;
    private String gender;

    public User(String name, String password, String tel, String motto ,String gender,String portrait) {
        this.name = name;
        this.password = password;
        this.tel = tel;
        this.motto = motto;
        this.gender=gender;
        this.portrait=portrait;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }




    public Integer getRemember() {
        return remember;
    }

    public void setRemember(Integer remember) {
        this.remember = remember;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait() {
        this.portrait = portrait;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", motto='" + motto + '\'' +
                ", remember=" + remember +
                ", portrait=" + portrait +
                ", gender='" + gender + '\'' +
                '}';
    }

}

