package com.abner.controller;

import com.abner.domain.User;
import com.abner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by abner chow on 2017/10/20.
 */
@Controller
@RequestMapping("/site")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String indexPage(Model model){
        User user = userService.selectUserById(1);
        model.addAttribute("user",user);
        return "index";
    }
}
