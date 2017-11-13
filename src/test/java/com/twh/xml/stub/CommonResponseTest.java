package com.twh.xml.stub;

import com.twh.common.JAXBUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CommonResponseTest {
    @Test
    public void testBean2Xml() {
        CommonResponse cr = new CommonResponseObjectFactory().createBusinessdataType();
        cr.setErrCode(0);
        cr.setErrMsg("网络通畅");
        String xml = JAXBUtils.bean2Xml(cr);
        System.out.println(xml);
    }

    @Test
    public void testXml2Bean() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<businessdata>\n" +
                "<errCode>0</errCode>\n" +
                "<errMsg>网络通畅</errMsg>\n" +
                "</businessdata>";

        CommonResponse cr = JAXBUtils.xml2Bean(xml, CommonResponse.class);
        System.out.println(cr);
    }
}