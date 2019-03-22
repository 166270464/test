package com.ch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ch.dao.studentdao;
import com.ch.pojo.student;

import java.util.List;

@Service
public class studentservice {
    @Autowired
    private studentdao studentdao;

    public List<student> getstudent() {

        return studentdao.getstudent();
    }

}
