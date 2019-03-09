package com.jolanda.dev.mysqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MysqldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqldemoApplication.class, args);
    }

}
