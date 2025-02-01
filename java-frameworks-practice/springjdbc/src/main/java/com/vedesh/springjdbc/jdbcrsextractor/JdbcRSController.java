package com.vedesh.springjdbc.jdbcrsextractor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.vedesh.springjdbc.user.User;

@Repository("JdbcRSController")
public class JdbcRSController {
    @Autowired
    JdbcTemplate jdbc;
 
	public List<User> getUserList() {
		return jdbc.query("select * from demo.users",new ResultSetExtractor<List<User>>(){
		 @Override
	     public List<User> extractData(ResultSet rs) throws SQLException,
	            DataAccessException {
 
                List<User> list=new ArrayList<User>();
                while(rs.next()){
                    User e=new User();
                    e.setId(rs.getInt(1));
                    e.setUsername(rs.getString(2));
                    e.setPassword(rs.getString(3));
                    list.add(e);
                }
	        return list;
	        }
	    });
	}
}
