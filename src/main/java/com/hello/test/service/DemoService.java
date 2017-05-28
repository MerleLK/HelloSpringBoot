package com.hello.test.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import com.hello.test.dao.DemoDao;
import org.springframework.stereotype.Service;
import com.hello.test.bean.Demo;
import com.hello.test.dao.DemoRespository;

/** Demo 的服务类
 * Created by merle on 17-5-27.
 */

@Service
public class DemoService {

    @Resource
    private DemoRespository demoRespository;

    @Resource
    private DemoDao demoDao;

    @Transactional
    public void save(Demo demo){
        demoRespository.save(demo);
    }

    @Transactional
    public Demo getById(long id){

        return demoDao.getById(id);
    }

}
