package com.yjh.service.impl;

import com.yjh.mapper.UsersMapper;
import com.yjh.pojo.Users;
import com.yjh.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: yjh
 * @Date: 2018/12/13
 * @Description: com.yjh.service.impl
 * @version: 1.0
 */

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public void addUser(Users user) {
        this.usersMapper.insertUser(user);
    }
}
