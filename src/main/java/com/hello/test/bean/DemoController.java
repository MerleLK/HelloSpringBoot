package com.hello.test.bean;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 测试
 * Created by merle on 17-5-27.
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    /*
    * 返回demo数据
    * URL = http://127.0.0.1:8080/demo/getDemo
    * @return
    * */

    @RequestMapping("/getDemo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Merle");
        return demo;
    }

    /*
     * url = http://127.0.0.1:8080/demo/getFastJson
     */
    @RequestMapping("/getFastJson")
    public String getFastJson(){
        Demo demo = new Demo();
        demo.setId(2);
        demo.setName("Merle-2333");
        return JSONObject.toJSONString(demo);
    }

    /*
     * error handler by myself
    * */
    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100 / 0;
    }
}
