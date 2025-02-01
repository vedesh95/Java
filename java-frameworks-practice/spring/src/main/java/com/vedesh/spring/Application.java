package com.vedesh.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vedesh.spring.customeventhandling.CustomEventPublisher;
import com.vedesh.spring.example1.HelloWorld;
import com.vedesh.spring.example2.TextEditor;

@SpringBootApplication
public class Application {
	static Log log = LogFactory.getLog(Application.class.getName());
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		log.info("Going to create HelloWord Obj");
		ctx.start();
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      	helloWorld.setMessage("Hello World!");
      	helloWorld.getMessage();


		TextEditor te = ctx.getBean(TextEditor.class);
		te.spellCheck();
		// ctx.stop();

		CustomEventPublisher cvp = ctx.getBean(CustomEventPublisher.class);
      
      	cvp.publish();  
      	cvp.publish();

		log.info("Exiting the program");
	}

}
