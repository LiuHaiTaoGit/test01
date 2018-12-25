package com.qf.cloudsc.user.service.impl;

import com.qf.cloudsc.user.User;
import com.qf.cloudsc.user.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class UserServiceImpl implements UserService {
    @Value("${server.port}")
    private String port;

    @Override
    public User findUsersById(@PathVariable("uid") Long uid) {
        System.out.println("uid:" +uid);
        System.out.println("==========="+port);
        return new User(uid, "zoukx--"+port);
    }

    @Override
    public void addUser(@RequestBody User user) {
        System.out.println(user);
    }
}
