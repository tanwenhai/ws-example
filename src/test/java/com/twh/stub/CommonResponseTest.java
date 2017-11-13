package com.twh.stub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CommonResponseTest {
    @Test
    public void testBean2Xml() {
        CommonResponse cr = new CommonResponseObjectFactory().createBusinessdataType();
        cr.setErrCode(0);
        cr.setErrMsg("网络通畅");

        try {
            // 创建JAXB环境
            JAXBContext context = JAXBContext.newInstance(CommonResponse.class);
            // 创建编组
            Marshaller marshaller = context.createMarshaller();
            // 设置编组属性，使得输出的XML文档进行格式化（提供缩进）
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            // 编组到文件
            marshaller.marshal(cr, sw);
            System.out.println(sw.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testXml2Bean() {
        try {
            StringReader sr = new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<businessdata>\n" +
                    "<errCode>0</errCode>\n" +
                    "<errMsg>网络通畅</errMsg>\n" +
                    "</businessdata>");
            JAXBContext jaxbContext = JAXBContext.newInstance(CommonResponse.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            CommonResponse cr = (CommonResponse) jaxbUnmarshaller.unmarshal(sr);
            System.out.println(cr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}