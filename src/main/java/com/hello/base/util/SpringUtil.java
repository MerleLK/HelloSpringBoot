package com.hello.base.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/** 普通类调用Spring bean对象；
 * 说明：此类必须放在App.java(Hello.java)同包或者子包下才能被扫描到
 * Created by merle on 17-5-31.
 */
@Component
public class SpringUtil implements ApplicationContextAware{

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{

        if(SpringUtil.applicationContext == null){
            SpringUtil.applicationContext = applicationContext;
        }
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("----com.hello.base.util.SpringUtil-----");
        System.out.println("---ApplicationContext配置成功，此时可以在普通类中通过SpringUtil.getApplication()获得---");
        System.out.println("---applicationContext对象,applicationContext="+SpringUtil.applicationContext+"---");
    }

    // 得到applicationContext
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    // 通过name获取Bean
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    // 通过class获取Bean
    public static <T>T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    // 通过name，以及Clazz 返回指定的Bean
    public static <T> T getBean(String name, Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }
}
