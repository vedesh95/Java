package com.vedesh.springjdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vedesh.springjdbc.jdbc.JDBCController;
import com.vedesh.springjdbc.jdbcps.JdbcPSController;
import com.vedesh.springjdbc.jdbcrsextractor.JdbcRSController;
import com.vedesh.springjdbc.user.User;

@SpringBootApplication
public class SpringjdbcApplication {

	private static ConfigurableApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(SpringjdbcApplication.class, args);
		// jdbc();
		// jdbcPS();
		// jdbcRSExtractor();
		jdbcRowMapper();
	}

	private static void jdbc(){
		JDBCController jdbcController = (JDBCController) applicationContext.getBean("jDBCController");
		jdbcController.insertData();
	}

	private static void jdbcPS(){
    	JdbcPSController jdbcController = (JdbcPSController) applicationContext.getBean("JdbcPSController");
    	User user = new User();
    	user.setId(15);
    	user.setUsername("Vishal");
    	user.setPassword("v123");
    	jdbcController.insertData(user);
    }

	private static void jdbcRSExtractor(){
    	JdbcRSController jdbcController = (JdbcRSController) applicationContext.getBean("JdbcRSController");
    	List<User> userList = jdbcController.getUserList();
    	for(User user : userList){
			System.out.println(user.getUsername());
		}
    }
	
	private static void jdbcRowMapper(){
    	JdbcRSController jdbcController = (JdbcRSController) applicationContext.getBean("JdbcRSController");
    	List<User> userList = jdbcController.getUserList();
    	for(User user : userList)
            System.out.println(user.getUsername());
    }

}
