package com.tindaa.core.user.get;

import java.io.IOException;

import com.tindaa.core.repository.UserRepository;
import com.tindaa.core.user.User;

public class GetUserInteractor {
  private UserRepository repository;

  public GetUserInteractor(UserRepository repository) {
    this.repository = repository;
  }

  public User getUserByEmail(String email) throws IOException {
    return repository.getUserByEmail(email);
  }

  public User getUserByUid(String uid) throws IOException {
    return repository.getUserByUid(uid);
  }
}
