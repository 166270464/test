package com.ch;

import com.ch.dao.studentdao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ch")
public class SpringConfig {

    @Bean
    public studentdao getstudent() {

        return new studentdao();
    }

}
