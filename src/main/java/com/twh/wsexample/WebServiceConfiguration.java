package com.twh.wsexample;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import javax.xml.ws.Endpoint;

@EnableWs
@Configuration
public class WebServiceConfiguration extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        CXFServlet cxfServlet = new CXFServlet();

        return new ServletRegistrationBean(cxfServlet, "/ws/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userService());
//        endpoint.setPublishedEndpointUrl("http://busm-test.51jk.com/ws/user");
        endpoint.publish("/user");
        return endpoint;
    }
}
