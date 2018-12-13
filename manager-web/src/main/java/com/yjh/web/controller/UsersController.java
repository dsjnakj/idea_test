package com.yjh.web.controller;

import com.yjh.pojo.Users;
import com.yjh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yjh
 * @Date: 2018/12/13
 * @Description: com.yjh.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users user){
        this.usersService.addUser(user);
        return "ok";
    }
}
