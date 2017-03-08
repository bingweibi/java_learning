package com.company.abstractClass;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Test {
    public static void main(String[] args){
        Person[] p = new Person[2];
        p[0] = new Employee(1000,25,"wangwu");
        p[1] = new Student("english","zhangsan");
        for (Person s:p){
            System.out.println(s.getName()+" "+s.getDescription());
        }
    }
}
