package org.spring.demo.dao.mapper;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.demo.AppTestBoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppTestBoot.class})
public class UserMapperTest {

	@Autowired
	private UserMapper uerMapper;
	
	@Test
	public void testSelect() {
		
		assertNotNull(uerMapper);
	}

}
