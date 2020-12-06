package com.swagger.controller;

import com.swagger.annocation.SwaggerAnnocation;
import com.swagger.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wxk
 * @date 2020/12/5 19:38
 */
@RestController
@RequestMapping("user")
public class UserController {


    @SwaggerAnnocation
    @GetMapping("helloSwagger")
    public User selectById(Integer id){
        return new User("小明","哈哈哈",13,id);
    }

}
