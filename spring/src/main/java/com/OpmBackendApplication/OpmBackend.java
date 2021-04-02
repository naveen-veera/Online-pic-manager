package com.OpmBackendApplication;


import com.OpmBackendApplication.config.SwaggerConfiguration;
import com.OpmBackendApplication.mapper.CommentsMapper;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAsync
@EnableWebMvc
@Import(SwaggerConfiguration.class)
// @ComponentScan({"com.OpmBackendApplication.mapper.CommentsMapper"})
// @ComponentScan(basePackages= {"com.OpmBackendApplication.controller"})
@ComponentScan
public class OpmBackend {

    public static void main(String[] args) {
        SpringApplication.run(com.OpmBackendApplication.OpmBackend.class, args);
    }

}
