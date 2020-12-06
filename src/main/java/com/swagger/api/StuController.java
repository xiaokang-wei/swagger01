package com.swagger.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wxk
 * @date 2020/12/5 20:36
 */
@RestController
@RequestMapping("user")
public class StuController {
    @RequestMapping("111")
    public String test(){
        return "我是stucontroller";
    }

}
