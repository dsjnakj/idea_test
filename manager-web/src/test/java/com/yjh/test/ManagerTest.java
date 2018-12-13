package com.yjh.test;

import com.yjh.mapper.UsersMapper;
import com.yjh.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: yjh
 * @Date: 2018/12/13
 * @Description: com.yjh.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUsers(){
        Users user = new Users(4, "小四", 20);
        usersMapper.insertUser(user);
        System.out.println("success");

    }
}
