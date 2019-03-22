package com.ch.springboot_ch_1;

import com.ch.SpringConfig;
import com.ch.pojo.student;
import com.ch.service.studentservice;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringbootCh1Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        studentservice service = context.getBean(studentservice.class);

        List<student> s = service.getstudent();

        for (student a : s) {
            System.out.println(a);
        }
    }


}
