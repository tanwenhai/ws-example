package com.twh.stub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CommonRequestTest {
    @Test
    public void test2000() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<businessdata>\n" +
                "<functioncode>2000</functioncode>\n" +
                "</businessdata>";
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CommonRequest.class);
            StringReader sr = new StringReader(xml);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            CommonRequest cr = (CommonRequest) jaxbUnmarshaller.unmarshal(sr);
            System.out.println(cr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}