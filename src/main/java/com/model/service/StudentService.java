package com.model.service;

import com.model.entites.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public void add(String sname, int cid, String sex, String birthplace);//添加学生
    public Student findBySid(int sid);//根据学号查学生
}
