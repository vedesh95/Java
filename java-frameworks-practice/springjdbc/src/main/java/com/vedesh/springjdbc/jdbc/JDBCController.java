package com.vedesh.springjdbc.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("jDBCController")
public class JDBCController {
    @Autowired
    JdbcTemplate jdbc;
 
    public void insertData(){
        jdbc.execute("insert into demo.users(id, username, password) values(12,'hkumar', 'h123')");
        System.out.println("Data inserted Successfully");
    }
}