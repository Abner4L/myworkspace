package com.abner.service;

import com.abner.baseTest.SpringTestCase;
import com.abner.domain.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by abner chow on 2017/10/20.
 */
public class UserServiceTest extends SpringTestCase {

    @Autowired
    private  UserService userService;
    Logger logger = Logger.getLogger(UserServiceTest.class);

    @Test
    public void selectUserByIdTest(){
        User user = userService.selectUserById(1);
        System.out.println(user);
    }
}
