package com.tindaa.core.repository;

import java.io.IOException;

import com.tindaa.core.user.User;

public interface UserRepository {

  public boolean checkIfUserExistByEmail(String email) throws IOException;

  public User getUserByUid(String uid) throws IOException;

  public User getUserByEmail(String email) throws IOException;

  public void addUser(User user) throws IOException;

  public void updateUser(String uid, User user) throws IOException;

  public void deleteUser(String uid) throws IOException;
}
