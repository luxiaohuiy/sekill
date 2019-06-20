package com.baz.sekill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SekillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SekillApplication.class, args);
    }

}
