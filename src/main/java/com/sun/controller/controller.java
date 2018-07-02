package com.sun.controller;

import com.sun.model.Student;
import com.sun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by sun on 2018/7/1.
 */
@Controller
public class controller {

    @Autowired
    StudentService studentService;

    @RequestMapping("/getstudent")
    @ResponseBody
    public List<Student> getinfo(){
    List<Student> result = studentService.getInfo();
        return result;
    }


    @RequestMapping("/student")
    public String index() {
        return "student";
    }
}
