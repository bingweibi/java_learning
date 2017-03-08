package com.company;

/**
 * Created by Administrator on 2017/3/8.
 */
public class InterfaceDemo {
    public static void main(String[] args){
        Father f = new Son();
        Mother son2 = new Son();
        f.show();
        son2.show2();
    }

}
interface Father{
    public void show();
}
interface Mother{
    public void show2();
}
class Son implements Father,Mother{
    @Override
    public void show() {
        System.out.println("show:father->son");
    }

    @Override
    public void show2() {
            System.out.println("show:mother->son");
    }
}
