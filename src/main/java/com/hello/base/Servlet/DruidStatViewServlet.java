package com.hello.base.Servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

/** 配置监控统计功能的Servlet  Druid数据源状态监控
 * Created by merle on 17-5-28.
 */

@WebServlet(urlPatterns = "/druid/*",
        initParams = {
                @WebInitParam(name = "allow", value = "192.168.1.22,127.0.0.1", description = "允许"),
                @WebInitParam(name = "deny", value = "192.168.1.101"),  //IP黑名单
                @WebInitParam(name = "loginUsername", value = "admin"),  // 用户名
                @WebInitParam(name = "loginPassword", value = "123456"), // 密码
                @WebInitParam(name = "resetEnable", value = "false")  // 禁用HTML页面上的ResetALL功能
        }
    )
public class DruidStatViewServlet extends StatViewServlet{
    private static final long serialVersionUID = 1L;
}
