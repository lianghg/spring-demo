package org.spring.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "org.spring.demo")
@MapperScan(basePackages = "org.spring.demo.dao")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class AppTestBoot {
	
	public static void main(String[] args) {
		SpringApplication.run(AppTestBoot.class, args);
	}

}
