package com.hello.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/** 自定义的资源目录
 * Created by merle on 17-5-27.
 */

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter{

    /*
    * url = http://127.0.0.1:8080/mypic/test.jpg
    * 显示出在本地自定义目录中的文件
    * */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        // 使用本地的文件夹  有错误
//        registry.addResourceHandler("/api_files/**").addResourceLocations("file:/home/merle/Pictures");
        registry.addResourceHandler("/mypic/**").addResourceLocations("classpath:/mypic/");
        super.addResourceHandlers(registry);
    }

}
