package com.company;

/**
 * Created by Administrator on 2017/3/7.
 */
public class EmployeeInfo {
    public static void main(String[] args){
        System.out.println("ClassDemo");
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("zhansan",10000.0,25);
        staff[1] = new Employee("wangwu",15000.0,28);
        System.out.println(staff[0].getName()+" "+staff[0].getAge()+" "+staff[0].getSalary());
    }
}
class Employee{
    public Employee(String name, Double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private Double salary;
    private int age;

}
