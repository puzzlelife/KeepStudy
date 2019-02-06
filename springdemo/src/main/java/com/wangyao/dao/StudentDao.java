package com.wangyao.dao;
import com.wangyao.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    List<Student> selectAllStudents();
    Student selectStudentById(int id);
}
