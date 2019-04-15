package com.baz.sekill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baz.sekill.mapper")
public class SekillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SekillApplication.class, args);
    }

}
