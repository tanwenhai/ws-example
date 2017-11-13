package com.twh.common;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class JAXBUtils {
    public static <E> E xml2Bean(String source, Class<E> clazz) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            StringReader sr = new StringReader(source);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (E) jaxbUnmarshaller.unmarshal(sr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String bean2Xml(Object o) {
        try {
            // 创建JAXB环境
            JAXBContext context = JAXBContext.newInstance(o.getClass());
            // 创建编组
            Marshaller marshaller = context.createMarshaller();
            // 设置编组属性，使得输出的XML文档进行格式化（提供缩进）
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            // 编组到文件
            marshaller.marshal(o, sw);

            return sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
