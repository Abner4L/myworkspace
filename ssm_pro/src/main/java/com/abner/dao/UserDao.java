package com.abner.dao;

import com.abner.domain.User;

/**
 * Created by abner chow on 2017/10/20.
 */
public interface UserDao {

    /**
     *
     * @param userId
     * @return
     */
    public User selectUserById(Integer userId);

}
