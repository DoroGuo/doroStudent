package com.sun.service;

import com.sun.mapper.StudentMapper;
import com.sun.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by sun on 2018/7/1.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StudentService {

    @Autowired
    public StudentMapper studentMapper;

    public List<Student> getInfo(){
     List<Student> list = studentMapper.getStudentInfo();
        return list;
    }
}
