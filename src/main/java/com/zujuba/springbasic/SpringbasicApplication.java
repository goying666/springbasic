package com.zujuba.springbasic;

import com.zujuba.springbasic.people.loginUse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbasicApplication.class, args);
    }

}
//@SpringBootApplication
//public class SpringbasicApplication extends SpringBootServletInitializer {
//
//    @Override
//
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(loginUse.class);
//    }
//
////	public static void main(String[] args) {
////		SpringApplication.run(SpringbasicApplication.class, args);
////	}
//
//}

