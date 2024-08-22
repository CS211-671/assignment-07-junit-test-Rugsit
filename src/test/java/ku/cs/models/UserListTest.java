package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList = new UserList();
    @BeforeEach
    void setUp() {
        userList.addUser("John Doe", "12345");
        userList.addUser("Nest Doe", "12345");
        userList.addUser("Bright Doe", "12345");
    }
    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        // TODO: find one of them
        User sampleUser = userList.findUserByUsername("John Doe");
        // TODO: assert that UserList found User
         String expected = "John Doe";
         String actual = sampleUser.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        // TODO: change password of one user
            userList.changePassword("John Doe", "12345", "1234");
            User foundUser = userList.findUserByUsername("John Doe");
        // TODO: assert that user can change password
        assertTrue(foundUser.validatePassword("1234"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        // TODO: call login() with correct username and password
        User foundUser = userList.login("John Doe", "12345");
        // TODO: assert that User object is found
        assertNotEquals(null, foundUser);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        // TODO: call login() with incorrect username or incorrect password
            UserList userList = new UserList();
            User foundUser = userList.login("John Doe", "1345");
        // TODO: assert that the method return null
            assertEquals(null, foundUser);
    }

}