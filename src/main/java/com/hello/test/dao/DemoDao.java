package com.hello.test.dao;

import javax.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.hello.test.bean.Demo;

/** 使用 JdbcTemplate
 * Created by merle on 17-5-27.
 */
@Repository
public class DemoDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    /*
    * 通过ID获取demo 对象
    * */
    public Demo getById(long id){
        String sql = "select * from Demo where id=?";
        RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

}
