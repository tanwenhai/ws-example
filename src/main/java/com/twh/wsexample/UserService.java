package com.twh.wsexample;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface UserService {
    @WebMethod
    String funMain(String xml);
}
