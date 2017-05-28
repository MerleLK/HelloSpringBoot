package com.hello.test.dao;

import com.hello.test.bean.Demo;
import org.springframework.data.repository.CrudRepository;

/** JPA的接口
 * Created by merle on 17-5-27.
 */
public interface DemoRespository extends CrudRepository<Demo, Long>{

}
