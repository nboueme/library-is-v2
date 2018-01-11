package com.nb.library.entity;

import java.util.Date;

public class Work {
    private int id;
    private int typeWorkId;
    private String title;
    private String summary;
    private String imageURL;
    private Date createdAt;
    private Date updatedAt;
    private Author author;
    private TypeWork typeWork;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeWorkId() {
        return typeWorkId;
    }

    public void setTypeWorkId(int typeWorkId) {
        this.typeWorkId = typeWorkId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public TypeWork getTypeWork() {
        return typeWork;
    }

    public void setTypeWork(TypeWork typeWork) {
        this.typeWork = typeWork;
    }
}
