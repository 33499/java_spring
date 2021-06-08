package com.ysx.mapper;

import com.ysx.pojo.User;

import java.util.List;

public interface UserMapper {
     List<User> selectUser();
     public int addUser(User user);
     public int deleteUser(int id);
}
