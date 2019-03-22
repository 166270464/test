package com.ch.dao;


import com.ch.pojo.student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class studentdao {

    public List<student> getstudent() {
        List<student> list = new ArrayList<student>();
        for (int i = 0; i < 9; i++) {
            student s = new student();
            s.setId(i + 1);
            s.setName("你好" + i);
            s.setAge(i + 10);
            list.add(s);

        }
        return list;
    }

    ;
}
