package com.twh.ws.stub;

import com.twh.xml.CommonResponseConvert;
import com.twh.xml.stub.CommonResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class UserServiceTest {
    @Test
    public void test2000() {
        UserServiceImplService uss = new UserServiceImplService();
        UserService userService = uss.getUserServiceImplPort();
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<businessdata>\n" +
                "<functioncode>2000</functioncode>\n" +
                "</businessdata>";
        String s = userService.funMain(xml);
        CommonResponse cr = new CommonResponseConvert().convert(s);
        assertTrue(0 == cr.getErrCode());
    }

}