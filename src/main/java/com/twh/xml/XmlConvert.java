package com.twh.xml;

/**
 * xml<-->bean 转换
 * @param <E>
 */
public interface XmlConvert<E> {
    /**
     * xml转bean
     * @param source
     * @return
     */
    E convert(String source);

    /**
     * bean转xml
     * @param o
     * @return
     */
    String reverse(E o);
}
