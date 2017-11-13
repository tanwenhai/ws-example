//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.11.13 时间 02:34:46 PM CST
//


package com.twh.xml.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.twh.stub package.
 * <p>An CommonResponseObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class CommonResponseObjectFactory {

    private final static QName _Businessdata_QNAME = new QName("", "businessdata");

    /**
     * Create a new CommonResponseObjectFactory that can be used to create new instances of schema derived classes for package: com.twh.stub
     *
     */
    public CommonResponseObjectFactory() {
    }

    /**
     * Create an instance of {@link CommonResponse }
     *
     */
    public CommonResponse createBusinessdataType() {
        return new CommonResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "businessdata")
    public JAXBElement<CommonResponse> createBusinessdata(CommonResponse value) {
        return new JAXBElement<CommonResponse>(_Businessdata_QNAME, CommonResponse.class, null, value);
    }

}
