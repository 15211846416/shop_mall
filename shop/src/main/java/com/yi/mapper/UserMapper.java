package com.yi.mapper;

import com.yi.model.User;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @Auther: 小飞
 * @Date: 2019/11/1 11:27
 * @Description:
 */
@Mapper
@Component
public interface UserMapper {

    List<User> getUsers();
}
