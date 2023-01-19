package com.tindaa.core.user.check;

import java.io.IOException;

import com.tindaa.core.repository.UserRepository;

public class CheckInteractor {
  private UserRepository repository;

  public CheckInteractor(UserRepository repository) {
    this.repository = repository;
  }

  public boolean checkIfUserExistByEmail(String email) throws IOException {
    return repository.checkIfUserExistByEmail(email);
  }
}
