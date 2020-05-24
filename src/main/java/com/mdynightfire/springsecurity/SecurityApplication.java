package com.mdynightfire.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author mdynightfire
 * com.mdynightfire.mapper.user
 */
@SpringBootApplication
@MapperScan(basePackages = "com.mdynightfire.springsecurity.mapper.*")
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

}

