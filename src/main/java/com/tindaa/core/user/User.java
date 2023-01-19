package com.tindaa.core.user;

public class User {
  private String password;
  private String uid;
  private String email;
  private String fullName;
  private String address;
  private Long phone;

  public User() {
    // default constructor
  }

  public User(String password, String uid, String email, String fullName, String address, Long phone) {
    this.password = password;
    this.uid = uid;
    this.email = email;
    this.fullName = fullName;
    this.address = address;
    this.phone = phone;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

}
