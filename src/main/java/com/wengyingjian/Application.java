package com.wengyingjian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by wyj on 16/1/11.
 */

@SpringBootApplication
public class Application extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
