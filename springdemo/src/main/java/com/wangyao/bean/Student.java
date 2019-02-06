package com.wangyao.bean;


public class Student {
    private int id;
    private int studentNo;
    private String name;
    private int age;
    private String birthday;
    private int sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", sex=" + sex +
                '}';
    }
}
