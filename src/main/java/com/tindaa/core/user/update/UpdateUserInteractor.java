package com.tindaa.core.user.update;

import java.io.IOException;

import com.tindaa.core.repository.UserRepository;
import com.tindaa.core.user.User;

public class UpdateUserInteractor {
  private UserRepository repository;

  public UpdateUserInteractor(UserRepository repository) {
    this.repository = repository;
  }

  public void updateUser(String uid, User user) throws IOException {
    repository.updateUser(uid, user);
  }
}
