package com.twh.wsexample;

import javax.xml.ws.WebEndpoint;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private Map<Long, User> userMap = new HashMap<>();
    public UserServiceImpl() {
        User user = new User();
        user.setUserId(10001L);
        user.setUsername("username1");
        user.setEmail("email1");
        user.setGmtCreate(new Date());
        userMap.put(user.getUserId(), user);
        user = new User();
        user.setUserId(10002L);
        user.setUsername("username2");
        user.setEmail("email2");
        user.setGmtCreate(new Date());
        userMap.put(user.getUserId(), user);
        user = new User();
        user.setUserId(10003L);
        user.setUsername("username3");
        user.setEmail("email3");
        user.setGmtCreate(new Date());
        userMap.put(user.getUserId(), user);
    }
    @Override
    public String getName(Long userId) {
        return "tt-" + userId;
    }
    @Override
    public User getUser(Long userId) {
        return userMap.get(userId);
    }
}

