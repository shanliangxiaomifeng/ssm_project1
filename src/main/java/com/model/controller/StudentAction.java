package com.model.controller;

import com.model.entites.Student;
import com.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentAction {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/findall")
    public String findAll(Model model){
        List<Student> list = studentService.findAll();
        model.addAttribute("studentList", list);
        return "show";
    }

    //ajax查询
    @ResponseBody
    @RequestMapping(value = "/findbysid", method = RequestMethod.POST)
    public Student findBySid(@RequestParam("sid") Integer sid){
        return studentService.findBySid(sid);
    }
}
