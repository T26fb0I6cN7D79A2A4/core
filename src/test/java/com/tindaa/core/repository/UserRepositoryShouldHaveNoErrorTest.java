package com.tindaa.core.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tindaa.core.user.User;

@ExtendWith(value = { MockitoExtension.class })
public class UserRepositoryShouldHaveNoErrorTest {
  @Mock
  private UserRepository fixture;

  @Mock
  private User user;

  private String uid;
  private String email;

  @BeforeEach
  public void setup() {
    uid = "some-uid";
    email = "some-email";
  }

  @Test
  @DisplayName("should get the user by uid and return User object")
  public void testGetUserByUid() throws IOException {
    when(fixture.getUserByUid(uid)).thenReturn(user);

    User expected = fixture.getUserByUid(uid);

    assertEquals(expected, user);
  }

  @Test
  @DisplayName("should get the user by email and return User object")
  public void testGetUserByEmail() throws IOException {
    when(fixture.getUserByEmail(email)).thenReturn(user);

    User expected = fixture.getUserByEmail(email);

    assertEquals(expected, user);
  }

  @Test
  @DisplayName("should update the user and return User object")
  public void testUpdateUser() throws IOException {
    when(fixture.updateUser(uid, user)).thenReturn(user);

    User expected = fixture.updateUser(uid, user);

    assertEquals(expected, user);
  }

  @Test
  @DisplayName("should check the user if it exist and return true")
  public void testCheckIfUserExistByEmail() throws IOException {
    when(fixture.checkIfUserExistByEmail(email)).thenReturn(true);

    boolean expected = fixture.checkIfUserExistByEmail(email);

    assertTrue(expected);
  }

  @Test
  @DisplayName("should delete the user and return void")
  public void testDeleteUser() throws IOException {
    ArgumentCaptor<String> stringCaptor = ArgumentCaptor.forClass(String.class);

    fixture.deleteUser(uid);

    verify(fixture).deleteUser(stringCaptor.capture());
  }
}
