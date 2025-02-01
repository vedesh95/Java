package com.vedesh.springjdbc.jdbcrm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.vedesh.springjdbc.user.User;

@Repository("JdbcRMController")
public class JdbcRMController {
    @Autowired
    JdbcTemplate jdbc;
 
	public List<User> getUserList() {
		return jdbc.query("select * from users",new RowMapper<User>(){
		    @Override
		    public User mapRow(ResultSet rs, int rownumber) throws SQLException {
	        	User user=new User();
	        	user.setId(rs.getInt(1));
	        	user.setUsername(rs.getString(2));
	        	user.setPassword(rs.getString(3));
	        	return user;
	        }
	    });
	}
}