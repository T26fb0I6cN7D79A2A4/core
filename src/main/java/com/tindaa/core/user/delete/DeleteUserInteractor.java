package com.tindaa.core.user.delete;

import java.io.IOException;

import com.tindaa.core.repository.UserRepository;

public class DeleteUserInteractor {
  private UserRepository repository;

  public DeleteUserInteractor(UserRepository repository) {
    this.repository = repository;
  }

  public void deleteUser(String uid) throws IOException {
    repository.deleteUser(uid);
  }
}
