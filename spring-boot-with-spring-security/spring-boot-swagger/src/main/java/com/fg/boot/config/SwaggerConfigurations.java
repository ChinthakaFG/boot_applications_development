package com.fg.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/1/17 Time : 11:49 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.config
 * Class Name : SwaggerConfigurations
 */
@Configuration
@EnableSwagger2
public class SwaggerConfigurations {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fg.boot.resources"))
                .build();

    }

}

