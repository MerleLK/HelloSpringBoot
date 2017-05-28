package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** just a app start entry
 * Created by merle on 17-5-27.
 */

@RestController
@SpringBootApplication
public class Hello {

    public static void main(String[] args){
        SpringApplication.run(Hello.class, args);
    }
}


