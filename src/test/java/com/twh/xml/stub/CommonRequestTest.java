package com.twh.xml.stub;

import com.twh.common.JAXBUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CommonRequestTest {
    @Test
    public void test2000() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<businessdata>\n" +
                "<functioncode>2000</functioncode>\n" +
                "</businessdata>";
        CommonRequest cr = JAXBUtils.xml2Bean(xml, CommonRequest.class);
        System.out.println(cr);
    }
}