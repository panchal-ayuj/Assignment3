package com.example.assignment3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {
    @Id
    int user_id;

    String user_name;

    String user_secret;

    Boolean user_status;

    Boolean user_enrolled;

    Boolean user_enrollapproved;

    Double user_latitude;

    Double user_longitude;

    public User() {
    }

    public User(int user_id, String user_name, String user_secret, Boolean user_status, Boolean user_enrolled, Boolean user_enrollapproved, Double user_latitude, Double user_longitude) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_secret = user_secret;
        this.user_status = user_status;
        this.user_enrolled = user_enrolled;
        this.user_enrollapproved = user_enrollapproved;
        this.user_latitude = user_latitude;
        this.user_longitude = user_longitude;
    }

    public Boolean getUser_enrollapproved() {
        return user_enrollapproved;
    }

    public void setUser_enrollapproved(Boolean user_enrollapproved) {
        this.user_enrollapproved = user_enrollapproved;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_secret() {
        return user_secret;
    }

    public void setUser_secret(String user_secret) {
        this.user_secret = user_secret;
    }

    public Boolean getUser_status() {
        return user_status;
    }

    public void setUser_status(Boolean user_status) {
        this.user_status = user_status;
    }

    public Boolean getUser_enrolled() {
        return user_enrolled;
    }

    public void setUser_enrolled(Boolean user_enrolled) {
        this.user_enrolled = user_enrolled;
    }

    public Double getUser_latitude() {
        return user_latitude;
    }

    public void setUser_latitude(Double user_latitude) {
        this.user_latitude = user_latitude;
    }

    public Double getUser_longitude() {
        return user_longitude;
    }

    public void setUser_longitude(Double user_longitude) {
        this.user_longitude = user_longitude;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_secret='" + user_secret + '\'' +
                ", user_status=" + user_status +
                ", user_enrolled=" + user_enrolled +
                ", user_enrollapproved=" + user_enrollapproved +
                ", user_latitude=" + user_latitude +
                ", user_longitude=" + user_longitude +
                '}';
    }
}
