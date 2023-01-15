package com.tindaa.core.user;

public class UserResponse {
  private String uid;
  private String email;
  private String fullName;
  private String address;
  private Long phone;
  private String avatar;

  public UserResponse() {
    // default constructor
  }

  public UserResponse(String uid, String email, String fullName, String address, Long phone, String avatar) {
    this.uid = uid;
    this.email = email;
    this.fullName = fullName;
    this.address = address;
    this.phone = phone;
    this.avatar = avatar;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }
}
