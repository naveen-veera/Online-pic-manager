package com.OpmBackendApplication;


import java.nio.file.AccessDeniedException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OpmBackendApplication.config.SwaggerConfiguration;
import com.OpmBackendApplication.mapper.CommentsMapper;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.jsonwebtoken.io.IOException;

@SpringBootApplication
@EnableAsync
@EnableWebMvc
@Import(SwaggerConfiguration.class)
// @ComponentScan({"com.OpmBackendApplication.mapper.CommentsMapper"})
// @ComponentScan(basePackages= {"com.OpmBackendApplication.controller"})
@ComponentScan
@Component
@CrossOrigin (origins = "http://localhost:4200")
public class OpmBackend {
    public static void main(String[] args) {
        SpringApplication.run(com.OpmBackendApplication.OpmBackend.class, args);
    }

}
