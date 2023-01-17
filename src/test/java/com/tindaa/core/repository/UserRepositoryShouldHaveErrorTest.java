package com.tindaa.core.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.doThrow;
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
public class UserRepositoryShouldHaveErrorTest {
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
  @DisplayName("getUserByUid should throw an IOException")
  public void testGetUserByUid() {

    try {
      when(fixture.getUserByUid(uid)).thenThrow(IOException.class);

      fixture.getUserByUid(uid);

      fail("should throw IOException but didn't");
    } catch (IOException e) {
      assertEquals(IOException.class, e.getClass());
    }
  }

  @Test
  @DisplayName("getUserByEmail should throw an IOException")
  public void testGetUserByEmail() {

    try {
      when(fixture.getUserByEmail(email)).thenThrow(IOException.class);

      fixture.getUserByEmail(email);

      fail("should throw IOException but didn't");
    } catch (IOException e) {
      assertEquals(IOException.class, e.getClass());
    }
  }

  @Test
  @DisplayName("updateUser should throw an IOException")
  public void testUpdateUser() {

    try {
      when(fixture.updateUser(uid, user)).thenThrow(IOException.class);

      fixture.updateUser(uid, user);

      fail("should throw IOException but didn't");
    } catch (IOException e) {
      assertEquals(IOException.class, e.getClass());
    }
  }

  @Test
  @DisplayName("checkIfUserExistByEmail should throw an IOException")
  public void testCheckIfUserExistByEmail() {

    try {
      when(fixture.checkIfUserExistByEmail(email)).thenThrow(IOException.class);

      fixture.checkIfUserExistByEmail(email);

      fail("should throw IOException but didn't");
    } catch (IOException e) {
      assertEquals(IOException.class, e.getClass());
    }
  }

  @Test
  @DisplayName("deleteUser should throw an IOException")
  public void testDeleteUser() {

    try {
      doThrow(IOException.class).when(fixture).deleteUser(uid);

      fixture.deleteUser(uid);
      fail("should throw IOException but didn't");

    } catch (IOException e) {
      assertEquals(IOException.class, e.getClass());
    }
  }
}
