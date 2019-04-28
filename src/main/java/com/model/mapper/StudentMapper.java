package com.model.mapper;

import com.model.entites.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    public List<Student> findAll();
    public void add(@Param("sname") String sname, @Param("cid") Integer cid, @Param("sex") String sex, @Param("birthplace") String birthplace);
    public Student findBySid(Integer sid);
}
