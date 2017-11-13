//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.11.13 时间 03:37:11 PM CST
//


package com.twh.xml.stub;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="functioncode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sbp" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dbp" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="pulse" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="icpcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="glu" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="hoursAfterMeal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fat" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="bmr" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="water" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="bmi" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="fetalheart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ecg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ecgxml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ecgpng" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey8" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey9" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey10" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey11" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey12" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="survey14" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expire" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CHOL" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="UA" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="waistline" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="hipline" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="whr" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="FGCParam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FGCData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BLD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PH" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="NIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LEU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SG" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="CHOL1" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="HDL" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="LDL" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="TG" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="CMP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TT" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="VisionLeft" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="VisionRight" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="PEF" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="FEV1" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="FVC" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *         &lt;element name="bd_xml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bd_png" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NGSP" type="{http://www.w3.org/2001/XMLSchema}Float"/>
 *       &lt;/sequence>
 *       &lt;attribute name="checkdate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessdataType", propOrder = {
    "functioncode",
    "cardNo",
    "sbp",
    "dbp",
    "pulse",
    "icpcode",
    "bo",
    "glu",
    "hoursAfterMeal",
    "fat",
    "bmr",
    "water",
    "height",
    "weight",
    "bmi",
    "fetalheart",
    "ecg",
    "ecgxml",
    "ecgpng",
    "survey1",
    "survey2",
    "survey3",
    "survey4",
    "survey5",
    "survey6",
    "survey7",
    "survey8",
    "survey9",
    "survey10",
    "survey11",
    "survey12",
    "survey13",
    "survey14",
    "fullname",
    "gender",
    "nation",
    "birthday",
    "addr",
    "expire",
    "photo",
    "phone",
    "chol",
    "ua",
    "waistline",
    "hipline",
    "whr",
    "fgcParam",
    "fgcData",
    "uro",
    "bld",
    "bil",
    "ket",
    "pro",
    "ph",
    "nit",
    "leu",
    "vc",
    "sg",
    "chol1",
    "hdl",
    "ldl",
    "tg",
    "cmp",
    "tt",
    "visionLeft",
    "visionRight",
    "pef",
    "fev1",
    "fvc",
    "bdXml",
    "bdPng",
    "ngsp"
})
@XmlRootElement(name = "businessdata")
public class CommonRequest {

    @XmlElement(required = true)
    protected Integer functioncode;
    @XmlElement(required = true)
    protected String cardNo;
    @XmlElement(required = true)
    protected Integer sbp;
    @XmlElement(required = true)
    protected Integer dbp;
    @XmlElement(required = true)
    protected Integer pulse;
    @XmlElement(required = true)
    protected String icpcode;
    @XmlElement(required = true)
    protected Integer bo;
    protected Float glu;
    @XmlElement(required = true)
    protected String hoursAfterMeal;
    protected Float fat;
    @XmlElement(required = true)
    protected Integer bmr;
    @XmlElement(required = true)
    protected Integer water;
    protected Float height;
    protected Float weight;
    protected Float bmi;
    @XmlElement(required = true)
    protected String fetalheart;
    @XmlElement(required = true)
    protected String ecg;
    @XmlElement(required = true)
    protected String ecgxml;
    @XmlElement(required = true)
    protected String ecgpng;
    @XmlElement(required = true)
    protected String survey1;
    @XmlElement(required = true)
    protected String survey2;
    @XmlElement(required = true)
    protected String survey3;
    @XmlElement(required = true)
    protected String survey4;
    @XmlElement(required = true)
    protected String survey5;
    @XmlElement(required = true)
    protected String survey6;
    @XmlElement(required = true)
    protected String survey7;
    @XmlElement(required = true)
    protected String survey8;
    @XmlElement(required = true)
    protected String survey9;
    @XmlElement(required = true)
    protected String survey10;
    @XmlElement(required = true)
    protected String survey11;
    @XmlElement(required = true)
    protected String survey12;
    @XmlElement(required = true)
    protected String survey13;
    @XmlElement(required = true)
    protected String survey14;
    @XmlElement(required = true)
    protected String fullname;
    @XmlElement(required = true)
    protected String gender;
    @XmlElement(required = true)
    protected String nation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(required = true)
    protected String addr;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expire;
    @XmlElement(required = true)
    protected String photo;
    @XmlElement(required = true)
    protected Integer phone;
    @XmlElement(name = "CHOL")
    protected Float chol;
    @XmlElement(name = "UA")
    protected Float ua;
    protected Float waistline;
    protected Float hipline;
    protected Float whr;
    @XmlElement(name = "FGCParam", required = true)
    protected String fgcParam;
    @XmlElement(name = "FGCData", required = true)
    protected String fgcData;
    @XmlElement(name = "URO", required = true)
    protected String uro;
    @XmlElement(name = "BLD", required = true)
    protected String bld;
    @XmlElement(name = "BIL", required = true)
    protected String bil;
    @XmlElement(name = "KET", required = true)
    protected String ket;
    @XmlElement(name = "PRO", required = true)
    protected String pro;
    @XmlElement(name = "PH")
    protected Float ph;
    @XmlElement(name = "NIT", required = true)
    protected String nit;
    @XmlElement(name = "LEU", required = true)
    protected String leu;
    @XmlElement(name = "VC", required = true)
    protected String vc;
    @XmlElement(name = "SG")
    protected Float sg;
    @XmlElement(name = "CHOL1")
    protected Float chol1;
    @XmlElement(name = "HDL")
    protected Float hdl;
    @XmlElement(name = "LDL")
    protected Float ldl;
    @XmlElement(name = "TG")
    protected Float tg;
    @XmlElement(name = "CMP", required = true)
    protected String cmp;
    @XmlElement(name = "TT")
    protected Float tt;
    @XmlElement(name = "VisionLeft")
    protected Float visionLeft;
    @XmlElement(name = "VisionRight")
    protected Float visionRight;
    @XmlElement(name = "PEF", required = true)
    protected Integer pef;
    @XmlElement(name = "FEV1")
    protected Float fev1;
    @XmlElement(name = "FVC")
    protected Float fvc;
    @XmlElement(name = "bd_xml", required = true)
    protected String bdXml;
    @XmlElement(name = "bd_png", required = true)
    protected String bdPng;
    @XmlElement(name = "NGSP")
    protected Float ngsp;
    @XmlAttribute(name = "checkdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkdate;

    /**
     * 获取functioncode属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getFunctioncode() {
        return functioncode;
    }

    /**
     * 设置functioncode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setFunctioncode(Integer value) {
        this.functioncode = value;
    }

    /**
     * 获取cardNo属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * 获取sbp属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSbp() {
        return sbp;
    }

    /**
     * 设置sbp属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSbp(Integer value) {
        this.sbp = value;
    }

    /**
     * 获取dbp属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDbp() {
        return dbp;
    }

    /**
     * 设置dbp属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDbp(Integer value) {
        this.dbp = value;
    }

    /**
     * 获取pulse属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPulse() {
        return pulse;
    }

    /**
     * 设置pulse属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPulse(Integer value) {
        this.pulse = value;
    }

    /**
     * 获取icpcode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIcpcode() {
        return icpcode;
    }

    /**
     * 设置icpcode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIcpcode(String value) {
        this.icpcode = value;
    }

    /**
     * 获取bo属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getBo() {
        return bo;
    }

    /**
     * 设置bo属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setBo(Integer value) {
        this.bo = value;
    }

    /**
     * 获取glu属性的值。
     *
     */
    public Float getGlu() {
        return glu;
    }

    /**
     * 设置glu属性的值。
     *
     */
    public void setGlu(Float value) {
        this.glu = value;
    }

    /**
     * 获取hoursAfterMeal属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHoursAfterMeal() {
        return hoursAfterMeal;
    }

    /**
     * 设置hoursAfterMeal属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHoursAfterMeal(String value) {
        this.hoursAfterMeal = value;
    }

    /**
     * 获取fat属性的值。
     *
     */
    public Float getFat() {
        return fat;
    }

    /**
     * 设置fat属性的值。
     *
     */
    public void setFat(Float value) {
        this.fat = value;
    }

    /**
     * 获取bmr属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getBmr() {
        return bmr;
    }

    /**
     * 设置bmr属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setBmr(Integer value) {
        this.bmr = value;
    }

    /**
     * 获取water属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getWater() {
        return water;
    }

    /**
     * 设置water属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setWater(Integer value) {
        this.water = value;
    }

    /**
     * 获取height属性的值。
     *
     */
    public Float getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     *
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * 获取weight属性的值。
     *
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     *
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

    /**
     * 获取bmi属性的值。
     *
     */
    public Float getBmi() {
        return bmi;
    }

    /**
     * 设置bmi属性的值。
     *
     */
    public void setBmi(Float value) {
        this.bmi = value;
    }

    /**
     * 获取fetalheart属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFetalheart() {
        return fetalheart;
    }

    /**
     * 设置fetalheart属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFetalheart(String value) {
        this.fetalheart = value;
    }

    /**
     * 获取ecg属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEcg() {
        return ecg;
    }

    /**
     * 设置ecg属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEcg(String value) {
        this.ecg = value;
    }

    /**
     * 获取ecgxml属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEcgxml() {
        return ecgxml;
    }

    /**
     * 设置ecgxml属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEcgxml(String value) {
        this.ecgxml = value;
    }

    /**
     * 获取ecgpng属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEcgpng() {
        return ecgpng;
    }

    /**
     * 设置ecgpng属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEcgpng(String value) {
        this.ecgpng = value;
    }

    /**
     * 获取survey1属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey1() {
        return survey1;
    }

    /**
     * 设置survey1属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey1(String value) {
        this.survey1 = value;
    }

    /**
     * 获取survey2属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey2() {
        return survey2;
    }

    /**
     * 设置survey2属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey2(String value) {
        this.survey2 = value;
    }

    /**
     * 获取survey3属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey3() {
        return survey3;
    }

    /**
     * 设置survey3属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey3(String value) {
        this.survey3 = value;
    }

    /**
     * 获取survey4属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey4() {
        return survey4;
    }

    /**
     * 设置survey4属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey4(String value) {
        this.survey4 = value;
    }

    /**
     * 获取survey5属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey5() {
        return survey5;
    }

    /**
     * 设置survey5属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey5(String value) {
        this.survey5 = value;
    }

    /**
     * 获取survey6属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey6() {
        return survey6;
    }

    /**
     * 设置survey6属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey6(String value) {
        this.survey6 = value;
    }

    /**
     * 获取survey7属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey7() {
        return survey7;
    }

    /**
     * 设置survey7属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey7(String value) {
        this.survey7 = value;
    }

    /**
     * 获取survey8属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey8() {
        return survey8;
    }

    /**
     * 设置survey8属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey8(String value) {
        this.survey8 = value;
    }

    /**
     * 获取survey9属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey9() {
        return survey9;
    }

    /**
     * 设置survey9属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey9(String value) {
        this.survey9 = value;
    }

    /**
     * 获取survey10属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey10() {
        return survey10;
    }

    /**
     * 设置survey10属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey10(String value) {
        this.survey10 = value;
    }

    /**
     * 获取survey11属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey11() {
        return survey11;
    }

    /**
     * 设置survey11属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey11(String value) {
        this.survey11 = value;
    }

    /**
     * 获取survey12属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey12() {
        return survey12;
    }

    /**
     * 设置survey12属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey12(String value) {
        this.survey12 = value;
    }

    /**
     * 获取survey13属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey13() {
        return survey13;
    }

    /**
     * 设置survey13属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey13(String value) {
        this.survey13 = value;
    }

    /**
     * 获取survey14属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurvey14() {
        return survey14;
    }

    /**
     * 设置survey14属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurvey14(String value) {
        this.survey14 = value;
    }

    /**
     * 获取fullname属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * 设置fullname属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

    /**
     * 获取gender属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * 获取nation属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置nation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNation(String value) {
        this.nation = value;
    }

    /**
     * 获取birthday属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * 获取addr属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置addr属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * 获取expire属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpire() {
        return expire;
    }

    /**
     * 设置expire属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpire(XMLGregorianCalendar value) {
        this.expire = value;
    }

    /**
     * 获取photo属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置photo属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoto(String value) {
        this.photo = value;
    }

    /**
     * 获取phone属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPhone(Integer value) {
        this.phone = value;
    }

    /**
     * 获取chol属性的值。
     *
     */
    public Float getCHOL() {
        return chol;
    }

    /**
     * 设置chol属性的值。
     *
     */
    public void setCHOL(Float value) {
        this.chol = value;
    }

    /**
     * 获取ua属性的值。
     *
     */
    public Float getUA() {
        return ua;
    }

    /**
     * 设置ua属性的值。
     *
     */
    public void setUA(Float value) {
        this.ua = value;
    }

    /**
     * 获取waistline属性的值。
     *
     */
    public Float getWaistline() {
        return waistline;
    }

    /**
     * 设置waistline属性的值。
     *
     */
    public void setWaistline(Float value) {
        this.waistline = value;
    }

    /**
     * 获取hipline属性的值。
     *
     */
    public Float getHipline() {
        return hipline;
    }

    /**
     * 设置hipline属性的值。
     *
     */
    public void setHipline(Float value) {
        this.hipline = value;
    }

    /**
     * 获取whr属性的值。
     *
     */
    public Float getWhr() {
        return whr;
    }

    /**
     * 设置whr属性的值。
     *
     */
    public void setWhr(Float value) {
        this.whr = value;
    }

    /**
     * 获取fgcParam属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFGCParam() {
        return fgcParam;
    }

    /**
     * 设置fgcParam属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFGCParam(String value) {
        this.fgcParam = value;
    }

    /**
     * 获取fgcData属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFGCData() {
        return fgcData;
    }

    /**
     * 设置fgcData属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFGCData(String value) {
        this.fgcData = value;
    }

    /**
     * 获取uro属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getURO() {
        return uro;
    }

    /**
     * 设置uro属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setURO(String value) {
        this.uro = value;
    }

    /**
     * 获取bld属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBLD() {
        return bld;
    }

    /**
     * 设置bld属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBLD(String value) {
        this.bld = value;
    }

    /**
     * 获取bil属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBIL() {
        return bil;
    }

    /**
     * 设置bil属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBIL(String value) {
        this.bil = value;
    }

    /**
     * 获取ket属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKET() {
        return ket;
    }

    /**
     * 设置ket属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKET(String value) {
        this.ket = value;
    }

    /**
     * 获取pro属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRO() {
        return pro;
    }

    /**
     * 设置pro属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRO(String value) {
        this.pro = value;
    }

    /**
     * 获取ph属性的值。
     *
     */
    public Float getPH() {
        return ph;
    }

    /**
     * 设置ph属性的值。
     *
     */
    public void setPH(Float value) {
        this.ph = value;
    }

    /**
     * 获取nit属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNIT() {
        return nit;
    }

    /**
     * 设置nit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNIT(String value) {
        this.nit = value;
    }

    /**
     * 获取leu属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLEU() {
        return leu;
    }

    /**
     * 设置leu属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLEU(String value) {
        this.leu = value;
    }

    /**
     * 获取vc属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVC() {
        return vc;
    }

    /**
     * 设置vc属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVC(String value) {
        this.vc = value;
    }

    /**
     * 获取sg属性的值。
     *
     */
    public Float getSG() {
        return sg;
    }

    /**
     * 设置sg属性的值。
     *
     */
    public void setSG(Float value) {
        this.sg = value;
    }

    /**
     * 获取chol1属性的值。
     *
     */
    public Float getCHOL1() {
        return chol1;
    }

    /**
     * 设置chol1属性的值。
     *
     */
    public void setCHOL1(Float value) {
        this.chol1 = value;
    }

    /**
     * 获取hdl属性的值。
     *
     */
    public Float getHDL() {
        return hdl;
    }

    /**
     * 设置hdl属性的值。
     *
     */
    public void setHDL(Float value) {
        this.hdl = value;
    }

    /**
     * 获取ldl属性的值。
     *
     */
    public Float getLDL() {
        return ldl;
    }

    /**
     * 设置ldl属性的值。
     *
     */
    public void setLDL(Float value) {
        this.ldl = value;
    }

    /**
     * 获取tg属性的值。
     *
     */
    public Float getTG() {
        return tg;
    }

    /**
     * 设置tg属性的值。
     *
     */
    public void setTG(Float value) {
        this.tg = value;
    }

    /**
     * 获取cmp属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCMP() {
        return cmp;
    }

    /**
     * 设置cmp属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCMP(String value) {
        this.cmp = value;
    }

    /**
     * 获取tt属性的值。
     *
     */
    public Float getTT() {
        return tt;
    }

    /**
     * 设置tt属性的值。
     *
     */
    public void setTT(Float value) {
        this.tt = value;
    }

    /**
     * 获取visionLeft属性的值。
     *
     */
    public Float getVisionLeft() {
        return visionLeft;
    }

    /**
     * 设置visionLeft属性的值。
     *
     */
    public void setVisionLeft(Float value) {
        this.visionLeft = value;
    }

    /**
     * 获取visionRight属性的值。
     *
     */
    public Float getVisionRight() {
        return visionRight;
    }

    /**
     * 设置visionRight属性的值。
     *
     */
    public void setVisionRight(Float value) {
        this.visionRight = value;
    }

    /**
     * 获取pef属性的值。
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPEF() {
        return pef;
    }

    /**
     * 设置pef属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPEF(Integer value) {
        this.pef = value;
    }

    /**
     * 获取fev1属性的值。
     *
     */
    public Float getFEV1() {
        return fev1;
    }

    /**
     * 设置fev1属性的值。
     *
     */
    public void setFEV1(Float value) {
        this.fev1 = value;
    }

    /**
     * 获取fvc属性的值。
     *
     */
    public Float getFVC() {
        return fvc;
    }

    /**
     * 设置fvc属性的值。
     *
     */
    public void setFVC(Float value) {
        this.fvc = value;
    }

    /**
     * 获取bdXml属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBdXml() {
        return bdXml;
    }

    /**
     * 设置bdXml属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBdXml(String value) {
        this.bdXml = value;
    }

    /**
     * 获取bdPng属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBdPng() {
        return bdPng;
    }

    /**
     * 设置bdPng属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBdPng(String value) {
        this.bdPng = value;
    }

    /**
     * 获取ngsp属性的值。
     *
     */
    public Float getNGSP() {
        return ngsp;
    }

    /**
     * 设置ngsp属性的值。
     *
     */
    public void setNGSP(Float value) {
        this.ngsp = value;
    }

    /**
     * 获取checkdate属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCheckdate() {
        return checkdate;
    }

    /**
     * 设置checkdate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCheckdate(XMLGregorianCalendar value) {
        this.checkdate = value;
    }

    @Override
    public String toString() {
        return "CommonRequest{" +
                "functioncode=" + functioncode +
                ", cardNo='" + cardNo + '\'' +
                ", sbp=" + sbp +
                ", dbp=" + dbp +
                ", pulse=" + pulse +
                ", icpcode='" + icpcode + '\'' +
                ", bo=" + bo +
                ", glu=" + glu +
                ", hoursAfterMeal='" + hoursAfterMeal + '\'' +
                ", fat=" + fat +
                ", bmr=" + bmr +
                ", water=" + water +
                ", height=" + height +
                ", weight=" + weight +
                ", bmi=" + bmi +
                ", fetalheart='" + fetalheart + '\'' +
                ", ecg='" + ecg + '\'' +
                ", ecgxml='" + ecgxml + '\'' +
                ", ecgpng='" + ecgpng + '\'' +
                ", survey1='" + survey1 + '\'' +
                ", survey2='" + survey2 + '\'' +
                ", survey3='" + survey3 + '\'' +
                ", survey4='" + survey4 + '\'' +
                ", survey5='" + survey5 + '\'' +
                ", survey6='" + survey6 + '\'' +
                ", survey7='" + survey7 + '\'' +
                ", survey8='" + survey8 + '\'' +
                ", survey9='" + survey9 + '\'' +
                ", survey10='" + survey10 + '\'' +
                ", survey11='" + survey11 + '\'' +
                ", survey12='" + survey12 + '\'' +
                ", survey13='" + survey13 + '\'' +
                ", survey14='" + survey14 + '\'' +
                ", fullname='" + fullname + '\'' +
                ", gender='" + gender + '\'' +
                ", nation='" + nation + '\'' +
                ", birthday=" + birthday +
                ", addr='" + addr + '\'' +
                ", expire=" + expire +
                ", photo='" + photo + '\'' +
                ", phone=" + phone +
                ", chol=" + chol +
                ", ua=" + ua +
                ", waistline=" + waistline +
                ", hipline=" + hipline +
                ", whr=" + whr +
                ", fgcParam='" + fgcParam + '\'' +
                ", fgcData='" + fgcData + '\'' +
                ", uro='" + uro + '\'' +
                ", bld='" + bld + '\'' +
                ", bil='" + bil + '\'' +
                ", ket='" + ket + '\'' +
                ", pro='" + pro + '\'' +
                ", ph=" + ph +
                ", nit='" + nit + '\'' +
                ", leu='" + leu + '\'' +
                ", vc='" + vc + '\'' +
                ", sg=" + sg +
                ", chol1=" + chol1 +
                ", hdl=" + hdl +
                ", ldl=" + ldl +
                ", tg=" + tg +
                ", cmp='" + cmp + '\'' +
                ", tt=" + tt +
                ", visionLeft=" + visionLeft +
                ", visionRight=" + visionRight +
                ", pef=" + pef +
                ", fev1=" + fev1 +
                ", fvc=" + fvc +
                ", bdXml='" + bdXml + '\'' +
                ", bdPng='" + bdPng + '\'' +
                ", ngsp=" + ngsp +
                ", checkdate=" + checkdate +
                '}';
    }
}
