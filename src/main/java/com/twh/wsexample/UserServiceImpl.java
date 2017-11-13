package com.twh.wsexample;

import com.twh.stub.CommonResponse;
import com.twh.stub.CommonResponseObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
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
    public String funMain(String xml) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<businessdata>\n" +
                "<errCode>0</errCode>\n" +
                "<errMsg>网络通畅</errMsg>\n" +
                "</businessdata>";
    }
}

