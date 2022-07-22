package com.theweeknd.service.lmpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.theweeknd.entity.User;
import com.theweeknd.mapper.UserMapper;
import com.theweeknd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 寂寞致幻
 * @Date 2022/7/21 10:33
 * @Description
 */
@Service("UserService")
public class UserServicelmpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return this.userMapper.getAll();
    }
}
