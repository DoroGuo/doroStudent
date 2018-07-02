package com.sun.mapper;


import com.sun.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by sun on 2018/7/1.
 */
@Mapper
@Component
public interface StudentMapper {

     List<Student> getStudentInfo();
}
