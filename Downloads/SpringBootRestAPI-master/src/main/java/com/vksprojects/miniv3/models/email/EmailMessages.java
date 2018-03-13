package com.vksprojects.miniv3.models.email;

/**
 * Enum providing Email notification templates.
 * Created by vivek on 3/13/18.
 */
public enum EmailMessages {

    NEW_ITEMS_IN_PAST_HOUR("Dear %s!, \nFollowing are the file names you uploaded in past hour %s"),
    ;

    String msg;

    EmailMessages(String msg) {
        this.msg = msg;
    }

    public String getMsg(String ...args) {
        return String.format(msg, args);
    }
}
