package com.company.innerClass;

/**
 * Created by Administrator on 2017/3/9.
 */
public class InnerClassDemo {
    public class InnerClassDemo2{

    }
    public static class InnerClassDemo3{

    }
    public static void main(String[] args){
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        InnerClassDemo2 innerClassDemo2 = innerClassDemo.new InnerClassDemo2();//外部类调用
        InnerClassDemo3 innerClassDemo3 = new InnerClassDemo3();//静态是直接new
    }
}
