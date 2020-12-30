package com.fy.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Blog_Comment {
    private Long comment_id;

    private Long blog_id;

    private String commentator;

    private String email;

    private String website_url;

    private String comment_body;

    @JsonFormat(pattern = "yyyy年MM月dd日:kk时mm分ss秒",timezone="GMT+8")
    private Date comment_create_time;

    private String commentatorIp;

    private String reply_body;

    @JsonFormat(pattern = "yyyy年MM月dd日:kk时mm分ss秒",timezone="GMT+8")
    private Date reply_create_time;

    private Byte comment_status;

    private Byte isDeleted;

    public Blog_Comment(Long comment_id, Long blog_id, String commentator, String email, String website_url, String comment_body, Date comment_create_time, String commentatorIp, String reply_body, Date reply_create_time, Byte comment_status, Byte isDeleted) {
        this.comment_id = comment_id;
        this.blog_id = blog_id;
        this.commentator = commentator;
        this.email = email;
        this.website_url = website_url;
        this.comment_body = comment_body;
        this.comment_create_time = comment_create_time;
        this.commentatorIp = commentatorIp;
        this.reply_body = reply_body;
        this.reply_create_time = reply_create_time;
        this.comment_status = comment_status;
        this.isDeleted = isDeleted;
    }

    public Blog_Comment() {
        super();
    }

    public Long getComment_id() {
        return comment_id;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }

    public Long getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(Long blog_id) {
        this.blog_id = blog_id;
    }

    public String getCommentator() {
        return commentator;
    }

    public void setCommentator(String commentator) {
        this.commentator = commentator == null ? null : commentator.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url == null ? null : website_url.trim();
    }

    public String getComment_body() {
        return comment_body;
    }

    public void setComment_body(String comment_body) {
        this.comment_body = comment_body == null ? null : comment_body.trim();
    }

    public Date getComment_create_time() {
        return comment_create_time;
    }

    public void setComment_create_time(Date comment_create_time) {
        this.comment_create_time = comment_create_time;
    }

    public String getCommentatorIp() {
        return commentatorIp;
    }

    public void setCommentatorIp(String commentatorIp) {
        this.commentatorIp = commentatorIp == null ? null : commentatorIp.trim();
    }

    public String getReply_body() {
        return reply_body;
    }

    public void setReply_body(String reply_body) {
        this.reply_body = reply_body == null ? null : reply_body.trim();
    }

    public Date getReply_create_time() {
        return reply_create_time;
    }

    public void setReply_create_time(Date reply_create_time) {
        this.reply_create_time = reply_create_time;
    }

    public Byte getComment_status() {
        return comment_status;
    }

    public void setComment_status(Byte comment_status) {
        this.comment_status = comment_status;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}