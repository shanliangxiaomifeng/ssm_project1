package com.model.entites;

public class Student {
    private Integer sid;//学号
    private String sname;//姓名
    private Classes classes;//所属班级
    private String sex;//性别
    private String birthplace;//出生地

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", classes=" + classes +
                ", sex='" + sex + '\'' +
                ", birthplace='" + birthplace + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(Integer sid, String sname, Classes classes, String sex, String birthplace) {

        this.sid = sid;
        this.sname = sname;
        this.classes = classes;
        this.sex = sex;
        this.birthplace = birthplace;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}
