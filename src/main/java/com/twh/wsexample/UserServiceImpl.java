package com.twh.wsexample;

import com.twh.xml.CommonRequestConvert;
import com.twh.xml.CommonResponseConvert;
import com.twh.xml.stub.CommonRequest;
import com.twh.xml.stub.CommonResponse;

import java.util.Objects;

/**
 * @author
 */
public class UserServiceImpl implements UserService {
    private static final CommonResponse PARSE_XML_FAIL;
    static {
        PARSE_XML_FAIL = new CommonResponse();
        PARSE_XML_FAIL.setErrCode(0);
        PARSE_XML_FAIL.setErrMsg("参数解析失败");
    }

    @Override
    public String funMain(String xml) {
        CommonRequest commonRequest = new CommonRequestConvert().convert(xml);
        if (Objects.isNull(commonRequest)) {
            return new CommonResponseConvert().reverse(PARSE_XML_FAIL);
        }

        if (commonRequest.getFunctioncode() == 1001) {

        }

        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<businessdata>\n" +
                "<errCode>0</errCode>\n" +
                "<errMsg>网络通畅</errMsg>\n" +
                "</businessdata>";
    }
}

