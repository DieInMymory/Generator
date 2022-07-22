package com.theweeknd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.theweeknd.entity.User;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 寂寞致幻
 * @Date 2022/7/21 10:32
 * @Description
 */

@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user ")
    List<User> getAll();
}
