package com.company;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/7.
 */
public class LotteryOdds {
    public static void main(String[] args){
        System.out.println("这是一个应用for循环的示例.");
        System.out.println("你必须在1-50之间选择n个数字来抽奖");
        System.out.println("你希望这个n为多少?");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Double total=1.0,element=1.0;//total为分母，element为分子
        for(int i = 50;i>(50-num);i--){
            total = total*i;
        }
        for (int i=1;i<=num;i++){
            element = element*i;
        }
        System.out.println("你中奖的几率为"+(element/total)+"."+(element%total));
    }
}
