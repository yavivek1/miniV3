package com.vksprojects.miniv3.models.email;

/**
 * Enum provides Email subjects template.
 * Created by vivek on 3/13/18.
 */
public enum EmailSubjects {

    HOURLY_UPDATES("Your hourly update!"),
    REGISTRATION_SUCCESS("Registration Successful"),
    ;

    String subject;

    EmailSubjects(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
