package com.model.service.impl;

import com.model.dao.StudentDao;
import com.model.entites.Student;
import com.model.mapper.StudentMapper;
import com.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public void add(String sname, int cid, String sex, String birthplace) {

    }

    @Override
    public Student findBySid(int sid) {
        return studentMapper.findBySid(sid);
    }
}
