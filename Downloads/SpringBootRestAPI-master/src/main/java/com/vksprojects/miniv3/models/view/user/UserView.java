package com.vksprojects.miniv3.models.view.user;

import com.vksprojects.miniv3.models.user.Role;
import com.vksprojects.miniv3.models.user.User;

/**
 * Public representation of User.
 * Created by vivek on 3/13/18.
 */
public class UserView {

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private Role roles;

    public UserView(User user) {
        username = user.getUsername();
        email = user.getEmail();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        roles = user.getRoles();
    }

    public String getUsername() {
        return username;
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

    public Role getRoles() {
        return roles;
    }
}
