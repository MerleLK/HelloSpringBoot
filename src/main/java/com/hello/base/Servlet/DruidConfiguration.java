package com.hello.base.Servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/** 使用代码注册Servlet
 * 这种方式不需要添加注解， @ServletComponentScan
 * Created by merle on 17-5-28.
 */

@Configuration
public class DruidConfiguration {

    /*
    * 添加一个StatViewServlet
    * */
    @Bean
    public ServletRegistrationBean DruidStatViewServlet2(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid2/*");

        // 添加初始化参数
        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");  // 白名单
        servletRegistrationBean.addInitParameter("deny", "192.168.1.22");  // 黑名单
        servletRegistrationBean.addInitParameter("loginUsername", "merle"); //用户名
        servletRegistrationBean.addInitParameter("loginPassword", "123456"); //密码

        // 是否能够重置数据
        servletRegistrationBean.addInitParameter("resetEnable", "false");

        return servletRegistrationBean;

    }

    /*
    * 注册一个： filterRegistrationBean
    * */
    @Bean
    public FilterRegistrationBean druidStatFilter2(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        // 添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");
        // 添加不需要忽略的格式信息
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid2/*");
        return filterRegistrationBean;
    }

}
