package com.vksprojects.miniv3.repositories;

import com.vksprojects.miniv3.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Provides CRUD API for User class.
 * Created by vivek on 3/13/18.
 */
@Repository
public interface UsersRepository extends JpaRepository<User, String>{

    public User findUserByUsername(String username);

    public User findUserByEmail(String email);
}
