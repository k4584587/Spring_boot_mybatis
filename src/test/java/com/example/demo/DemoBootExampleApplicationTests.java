package com.example.demo;

import com.example.demo.Module.User.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoBootExampleApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DemoBootExampleApplicationTests.class);

	@Test
	public void contextLoads() {
	}

	@Autowired
	UserServiceImpl userService;

	@Test
	public void userTest() {
		logger.info("get user ==> {}",userService.getUserList());
	}

}
