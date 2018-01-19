package com.nb.library.entity;

import java.util.Date;

public interface WorkInterface {
    Integer getId();

    void setId(Integer id);

    String getTitle();

    void setTitle(String title);

    String getSummary();

    void setSummary(String summary);

    String getImageURL();

    void setImageURL(String imageURL);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);
}
