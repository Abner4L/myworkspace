package com.abner.service;

import com.abner.dao.UserDao;
import com.abner.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by abner chow on 2017/10/20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }
}
