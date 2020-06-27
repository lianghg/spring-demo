package org.spring.demo.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.demo.AppTestBoot;
import org.spring.demo.entry.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppTestBoot.class})
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testSelectUserById() {
		
		User user = userService.selectUserById(1);
		
		assertNotNull(user);
		
		System.out.println(user.getRealname());
		
	}

}
