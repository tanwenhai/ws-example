package com.twh.xml;

import com.twh.common.JAXBUtils;
import com.twh.xml.stub.CommonResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class CommonResponseConvert implements XmlConvert<CommonResponse> {
    @Override
    public CommonResponse convert(String source) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CommonResponse.class);
            StringReader sr = new StringReader(source);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (CommonResponse) jaxbUnmarshaller.unmarshal(sr);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String reverse(CommonResponse o) {
        return JAXBUtils.bean2Xml(o);
    }
}
