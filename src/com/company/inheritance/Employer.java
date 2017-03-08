package com.company.inheritance;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Employer extends Employees {
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    private double bonus;
    public Employer(String name, double salary, int age) {
        super(name, salary, age);
        bonus = 0;
    }
    //重写getSalary方法
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
