package com.twh.xml;

import com.twh.common.JAXBUtils;
import com.twh.xml.stub.CommonRequest;

/**
 * @author
 */
public class CommonRequestConvert implements XmlConvert<CommonRequest> {
    @Override
    public CommonRequest convert(String source) {
        return JAXBUtils.xml2Bean(source, CommonRequest.class);
    }

    @Override
    public String reverse(CommonRequest o) {
        return JAXBUtils.bean2Xml(o);
    }
}
