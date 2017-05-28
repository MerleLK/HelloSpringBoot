package com.hello.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** UI show a hello world demo
 * Created by merle on 17-5-27.
 */

@RestController    // 标记为resrful
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World!\n ----from Merle";
    }
}
