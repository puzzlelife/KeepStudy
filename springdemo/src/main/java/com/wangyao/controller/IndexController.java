package com.wangyao.controller;

import com.wangyao.bean.Student;
import com.wangyao.dao.StudentDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dell--pc on 2017/11/29.
 */
@Controller
public class IndexController {

    @Resource
    private StudentDao studentDao;

    @RequestMapping(path = {"/students/list"})
    @ResponseBody
    public List<Student> AllStudentList(){
        List<Student> list=studentDao.selectAllStudents();
        System.out.println(list.get(0).toString());
        return list;
    }

    @RequestMapping(path = {"/students/{id}"})
    @ResponseBody
    public Student queryStudentById(@PathVariable("id") Integer id){
        Student student=studentDao.selectStudentById(id);
        System.out.println(student);
        return student;
    }

}
