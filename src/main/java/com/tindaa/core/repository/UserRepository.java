package com.tindaa.core.repository;

import java.io.IOException;

import com.tindaa.core.user.User;

public interface UserRepository {
  public User getUserByUid(String uid) throws IOException;

  public User getUserByEmail(String email) throws IOException;

  public User addUser(User user) throws IOException;

  public User updateUser(String uid, User user) throws IOException;

  public void deleteUser(String uid) throws IOException;
}
