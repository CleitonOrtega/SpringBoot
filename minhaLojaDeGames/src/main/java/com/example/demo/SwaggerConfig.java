package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
          .select()
          .apis(RequestHandlerSelectors.any())
          .paths(PathSelectors.any())
          .build();
    }
}
//Documentação para o pom
//<dependency>
//<groupId>io.springfox</groupId>
//<artifactId>springfox-swagger2</artifactId>
//<version>2.9.2</version>
//</dependency>
//<dependency>
//<groupId>io.springfox</groupId>
//<artifactId>springfox-swagger-ui</artifactId>
//<version>2.9.2</version>
//</dependency>