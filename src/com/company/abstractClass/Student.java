package com.company.abstractClass;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Student extends Person{
    public String major;

    public Student(String major,String name) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in "+major;
    }
}
