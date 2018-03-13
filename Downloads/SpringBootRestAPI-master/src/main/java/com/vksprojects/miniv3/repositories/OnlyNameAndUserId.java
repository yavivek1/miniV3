package com.vksprojects.miniv3.repositories;

import com.vksprojects.miniv3.models.user.User;

/**
 * Interface Used to do reflections on MetaData retrieval from database.
 * Created by vivek on 3/13/18.
 */
public interface OnlyNameAndUserId {

    String getName();

    User getUser();
}
