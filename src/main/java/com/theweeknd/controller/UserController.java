package com.theweeknd.controller;

import com.theweeknd.entity.User;
import com.theweeknd.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 寂寞致幻
 * @Date 2022/7/21 10:21
 * @Description
 */
@RestController
@RequestMapping("/user")
@Api("用户使用")
public class UserController{

    @Autowired
    private UserService userService;


    @ApiOperation("查询用户")
    @GetMapping("/list")
    public List<User> getList()
    {
        return  userService.getAll();
    }
}
