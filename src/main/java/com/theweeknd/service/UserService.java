package com.theweeknd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.theweeknd.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 寂寞致幻
 * @Date 2022/7/21 10:32
 * @Description
 */
public interface UserService extends IService<User> {

    List<User> getAll();
}
