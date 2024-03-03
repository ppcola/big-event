package com.example.bigevent.controller;

import com.example.bigevent.pojo.Result;
import com.example.bigevent.pojo.User;
import com.example.bigevent.service.UserService;
import jakarta.annotation.Resource;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xi
 * @create 2024/3/3 18:02
 */
@RestController
@RequestMapping("/user")
@Validated
public class UserController {
   @Resource
   private UserService userService;

    @PostMapping("register")
    public Result register(@Pattern(regexp = "^\\S{5,16}$") String username, String password){
        //校验

        //查询用户
        User user = userService.findByUserName(username);
        if (user == null){
            userService.register(username,password);
            return Result.success("ok");
        }else {
            //占用
            return Result.error("用户名已经被注册");

        }
        //注册
    }
}
