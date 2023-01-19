package com.tindaa.core.user.add;

import java.io.IOException;

import com.tindaa.core.repository.UserRepository;
import com.tindaa.core.user.User;

public class AddUserInteractor {
  private UserRepository repository;

  public AddUserInteractor(UserRepository repository) {
    this.repository = repository;
  }

  public void add(User user) throws IOException {
    repository.addUser(user);
  }
}
