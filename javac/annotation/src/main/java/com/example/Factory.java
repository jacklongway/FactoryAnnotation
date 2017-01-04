package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by longway on 17/1/4. Email:longway1991117@sina.com
 */

@Target(ElementType.TYPE) @Retention(RetentionPolicy.CLASS)
public @interface Factory {

    /**
     * 工厂的名字
     */
    Class type();

    /**
     * 用来表示生成哪个对象的唯一id
     */
    String id();
}
