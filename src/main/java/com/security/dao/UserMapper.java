package com.security.dao;

import com.security.pojo.Role;
import com.security.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Wxy
 * @Description:
 * @Date created in 14:48 2019/3/11 0011
 */
@Mapper
public interface UserMapper {

    /**
     * @param username 用户名
     * @return User
     * 根据用户名查询
     */
    User loadUserByUsername(@Param("username") String username);

    /**
     * @param id 用户id
     * @return 角色
     * 根据用户id查询用户相应的角色
     */
    List<Role> getUserRolesByUid(@Param("id") Integer id);
}
