package com.abner.service;

import com.abner.domain.User;

/**
 * Created by abner chow on 2017/10/20.
 */
public interface UserService {
    User selectUserById(Integer userId);

}
