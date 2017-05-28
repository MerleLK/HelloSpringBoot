package com.hello.test.web;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hello.test.bean.Demo;
import com.hello.test.service.DemoService;

/** Service 的 测试类
 * Created by merle on 17-5-27.
 */

@RestController
@RequestMapping("/demo2")
public class DemoControllerService {

    @Resource
    private DemoService demoService;

    /*
    * 测试保存方法
    * */
    @RequestMapping("save")
    public String save(){
        Demo d = new Demo();
        d.setName("LiuKun");
        demoService.save(d);
        return "Ok! The data has saved!";
    }

    /*
    * URL = http://127.0.0.1:8080/demo2/getById?id=1
    * */
    @RequestMapping("/getById")
    public Demo getById(long id){
        return demoService.getById(id);
    }
}
