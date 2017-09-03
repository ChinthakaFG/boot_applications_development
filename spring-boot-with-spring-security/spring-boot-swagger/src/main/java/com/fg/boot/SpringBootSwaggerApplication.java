package com.fg.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * App Name spring-boot-with-security
 * <p>
 * Created Date : 6/2/17 Time : 3:42 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot
 * Class Name : Application
 */
@SpringBootApplication
@ComponentScan("com.fg.boot.resources,com.fg.boot.config")
public class SpringBootSwaggerApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootSwaggerApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootSwaggerApplication.class, args);
    }

}
