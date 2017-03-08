package com.company.abstractClass;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Employee extends Person {
    private double salary;
    private int age;

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(double salary, int age,String name) {
        super(name);
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with salary is %.2f",salary);
    }
    public void raiseSalary(double byPercent){
        double raise = salary+byPercent/100;
        salary += raise;
    }
}
