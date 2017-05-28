package com.hello.base.Servlet;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import com.alibaba.druid.support.http.WebStatFilter;

/** druid过滤器
 * Created by merle on 17-5-28.
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
            // 忽略资源文件
            @WebInitParam(name = "exclusions",value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
        }
    )
public class DruidStatFilter extends WebStatFilter{
}
