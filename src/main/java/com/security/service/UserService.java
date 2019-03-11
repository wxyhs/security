package com.security.service;

import com.security.dao.UserMapper;
import com.security.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author: Wxy
 * @Description:
 * @Date created in 14:53 2019/3/11 0011
 */
@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(s);
        if (user==null) {
            throw new UsernameNotFoundException("用户不能存在");
        }
        user.setRoles(userMapper.getUserRolesByUid((int) user.getId()));
        return user;
    }
}
