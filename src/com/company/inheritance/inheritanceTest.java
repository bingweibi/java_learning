package com.company.inheritance;

/**
 * Created by Administrator on 2017/3/8.
 */
public class inheritanceTest {
    /**
     * Created by Administrator on 2017/3/8.
     */
    public static class Inheritance_ManagerTest {
        public static void main(String[] args){
            System.out.println("这个程序演示继承");
            Employer boss = new Employer("zhangsan",10000,45);
            boss.setBonus(15000);
            Employees[] staff  = new Employees[2];
            staff[0] = boss;
            staff[1] =new Employees("wangwu",5000,25);
            //staff[2] = new Employees("zm",4500,22);
            for(Employees e:staff){
                System.out.println("name:"+e.getName()+" salary:"+e.getSalary()+" age:"+e.getAge());
            }
        }
    }
}
