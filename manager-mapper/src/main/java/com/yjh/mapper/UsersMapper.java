package com.yjh.mapper;

import com.yjh.pojo.Users;

import java.util.List;

/**
 * @Auther: yjh
 * @Date: 2018/12/13
 * @Description: com.yjh.mapper
 * @version: 1.0
 */

public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
