package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/7.
 */
public class ArrayDemo {
    public static void main(String[] args) {
    System.out.println("这个程序是模拟数字随机出现.");
    System.out.println("请输入数字随机出现的范围0-？");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    System.out.println("请输入你希望随机出现几个数字.");
    int times = in.nextInt();
    int[] num2 =new  int[times];
    for (int i=0;i<times;i++){
        int tempNum =(int) (Math.random()*num+1);//随机数出0-num之间的数字
        num2[i] = tempNum;
    }
        Arrays.sort(num2);
        for (int i=0;i<num2.length;i++){
            System.out.print(num2[i]+" ");
        }
    }
}
