package com.company;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/7.
 */
public class InputTest {
    public static void main(String[] args){
        System.out.println("这是一个InputTest的Demo ");
        Scanner in = new Scanner(System.in);
        System.out.println("what 's your name?");
        String name = in.nextLine();
        System.out.println("how old are you?");
        int age = in.nextInt();
        System.out.println("Your name is "+name+" and age is "+age);
    }
}
