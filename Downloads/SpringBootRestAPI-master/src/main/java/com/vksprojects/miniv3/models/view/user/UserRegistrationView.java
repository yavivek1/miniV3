package com.vksprojects.miniv3.models.view.user;

/**
 * Registration view of user.
 * Created by vivek on 3/13/18.
 */
public class UserRegistrationView {

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;

    public UserRegistrationView() {}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
