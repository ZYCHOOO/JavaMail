package com.garylee.domain;

import java.util.Date;
import java.util.List;

public class Email {
    private int id;
    private String title;
    private String content;
    private String time;
    private String from;
    private String to;
    //非数据库字段
    private List<String> attachment;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getAttachment() {
        return attachment;
    }

    public void setAttachment(List<String> attachment) {
        this.attachment = attachment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
