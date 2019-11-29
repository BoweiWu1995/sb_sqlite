package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author wuwei
 * @create 2019/11/29 16:38
 * @desc
 **/
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("getAll")
    public List getAll(){
        List<User> list = userRepository.findAll();
        return list;
    }

    @PostMapping("save")
    public void save(User user){
        userRepository.save(user);
    }

    @PutMapping("update")
    public void update(User user){ userRepository.save(user);
    }

}
