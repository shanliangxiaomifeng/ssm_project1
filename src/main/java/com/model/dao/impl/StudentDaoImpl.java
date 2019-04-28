package com.model.dao.impl;

import com.model.dao.StudentDao;
import com.model.entites.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void add(String sname, Integer cid, String sex, String birthplace) {

    }

    @Override
    public Student findBySid(Integer sid) {
        return null;
    }
}
