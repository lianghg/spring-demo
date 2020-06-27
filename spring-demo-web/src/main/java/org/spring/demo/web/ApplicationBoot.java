package org.spring.demo.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "org.spring.demo")
@MapperScan(basePackages = "org.spring.demo.dao")
@EnableTransactionManagement
@EnableAspectJAutoProxy
//public class ApplicationBoot  extends SpringBootServletInitializer {
// 打包成war包时用
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        // 注意这里要指向原先用main方法执行的Application启动类
//        return builder.sources(ApplicationBoot.class);
//    }
//    
//}

public class ApplicationBoot {
//开发时用
	public static void main(String[] args) {
		SpringApplication.run(ApplicationBoot.class, args);
	}
}
