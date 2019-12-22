package cn.edu.njust.main.model;

import java.util.Date;

public class Tableone {
    private Integer id;

    private String phoneNumber;

    private Date date;

    private Integer headCount;

    private Integer wantShare;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHeadCount() {
        return headCount;
    }

    public void setHeadCount(Integer headCount) {
        this.headCount = headCount;
    }

    public Integer getWantShare() {
        return wantShare;
    }

    public void setWantShare(Integer wantShare) {
        this.wantShare = wantShare;
    }
}