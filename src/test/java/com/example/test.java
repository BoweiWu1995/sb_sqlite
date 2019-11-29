package com.example;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.junit.Test;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wuwei
 * @create 2019/11/29 17:00
 * @desc
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1(){
        User u = new User();
        u.setId(1);
        u.setName("张三");
        userRepository.save(u);

        List l = userRepository.findAll();
        System.out.println(l);

    }
}
