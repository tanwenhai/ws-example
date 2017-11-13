//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.11.13 时间 02:34:46 PM CST
//


package com.twh.stub;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;


/**
 * <p>businessdataType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="businessdataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="errMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessdataType", propOrder = {
    "errCode",
    "errMsg"
})
@XmlRootElement(name = "businessdata")
public class CommonResponse {

    @XmlElement(required = true)
    protected Integer errCode;
    @XmlElement(required = true)
    protected String errMsg;

    /**
     * 获取errCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public Integer getErrCode() {
        return errCode;
    }

    /**
     * 设置errCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setErrCode(Integer value) {
        this.errCode = value;
    }

    /**
     * 获取errMsg属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * 设置errMsg属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrMsg(String value) {
        this.errMsg = value;
    }

    @Override
    public String toString() {
        return "CommonResponse{" +
                "errCode=" + errCode +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }
}
