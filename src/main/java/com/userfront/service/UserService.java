package com.userfront.service;

import com.userfront.domain.User;
import com.userfront.domain.security.UserRole;

import java.util.Set;

/**
 * Created by 이민규 on 2017-04-17.
 */
public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void saveUser(User user);

    User createUser(User user, Set
            <UserRole> userRoles);

}
