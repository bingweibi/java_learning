package com.company.inheritance;

public class Employees{
    private String name;
    private double salary;
    private int age;
    //set,get 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //构造函数
    public Employees(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    //增长工资
    public void raiseSalaey(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }
}
