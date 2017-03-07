package com.sky.demo.ldap.util;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rg on 7/21/15.
 */
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("spring/spring.xml");
    }

    public static ApplicationContext getContext() {
        return context;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.context = applicationContext;
    }


    public static Object getBeanByName(String name) {
        Preconditions.checkState(StringUtils.isNotBlank(name), "name is null");
        return context.getBean(name);
    }

    public static Object getBeanByClass(Class<?> clazz) {
        Preconditions.checkNotNull(clazz, "class is null");
        return context.getBean(clazz);
    }
}
