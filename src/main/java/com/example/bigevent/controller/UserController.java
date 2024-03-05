package com.example.bigevent.controller;

import com.example.bigevent.pojo.Result;
import com.example.bigevent.pojo.User;
import com.example.bigevent.service.UserService;
import com.example.bigevent.utils.JwtUtil;
import com.example.bigevent.utils.ThreadLocalUtil;
import jakarta.annotation.Resource;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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

    @PostMapping("/login")
    public Result<String> login(@Pattern(regexp = "^\\S{5,16}$") String username,@Pattern(regexp = "^\\S{5,16}$") String password){
        //根据用户名查询用户
        User loginUser = userService.findByUserName(username);
        //判断该用户是否存在
        if(loginUser == null){
            return Result.error("用户名错误");
        }

        if(password.equals(loginUser.getPassword())){

            Map<String, Object> claims = new HashMap<>();
            claims.put("id",loginUser.getId());
            claims.put("username",loginUser.getUsername());
            String token = JwtUtil.genToken(claims);
            return Result.success(token);
        }
        return Result.error("密码错误");
    }

    @GetMapping("/userInfo")
    public Result<User> userInfo(/*@RequestHeader(name = "Authorization") String token*/){
        //根据用户名查询用户
//        Map<String, Object> map = JwtUtil.parseToken(token);
//        String username = (String) map.get("username");

        Map<String,Object> map = ThreadLocalUtil.get();
        String username = (String) map.get("username");
        User user = userService.findByUserName(username);
        return Result.success(user);
    }

    @PutMapping("/update")
    public Result update(@RequestBody User user){
        userService.update(user);
        return Result.success();
        //TODO Validation参数校验

    }
}
