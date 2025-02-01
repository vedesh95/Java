package com.vedesh.springjdbc.jdbcps;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import com.vedesh.springjdbc.user.User;

@Repository("JdbcPSController")
public class JdbcPSController {
    @Autowired
    JdbcTemplate jdbc;
 
	public void insertData(User user){
		String query="insert into demo.users values(?,?,?)";
		jdbc.execute(query,new PreparedStatementCallback<>(){
		    @Override
		    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException {
		        ps.setInt(1,user.getId());
		        ps.setString(2,user.getUsername());
		        ps.setString(3,user.getPassword());
 
		        return ps.execute();
		    }
		});
        System.out.println("Data inserted Successfully");
    }
}
