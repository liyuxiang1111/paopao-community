package com.dlu.liyuxiang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dlu.liyuxiang.dao")
public class PaoPaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaoPaoApplication.class, args);
    }
}
