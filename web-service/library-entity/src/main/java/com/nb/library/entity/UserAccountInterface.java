package com.nb.library.entity;

import java.util.Date;

public interface UserAccountInterface {
    Integer getId();

    void setId(Integer id);

    String getTitle();

    void setTitle(String title);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    Date getBirthDay();

    void setBirthDay(Date birthDay);

    String getAddress();

    void setAddress(String address);

    Integer getPostalCode();

    void setPostalCode(Integer postalCode);

    String getCity();

    void setCity(String city);

    String getPhoneNumber();

    void setPhoneNumber(String phoneNumber);

    String getEmail();

    void setEmail(String email);

    String getPassword();

    void setPassword(String password);

    String getImageURL();

    void setImageURL(String imageURL);

    String getRole();

    void setRole(String role);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    Date getUpdatedAt();

    void setUpdatedAt(Date updatedAt);
}
