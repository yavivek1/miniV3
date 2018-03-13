package com.vksprojects.miniv3.models.email;

/**
 * Enum provides email addresses to be used for sending emails.
 * Created by vivek on 3/13/18.
 */
public enum SystemEmailAddrs {

    HOURLY_NOTIFICATION("notification@yourdomain.com"),
    REGISTRATION_SUCCESS("welcome@yourdomain.com")
    ;

    String email;

    SystemEmailAddrs(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
