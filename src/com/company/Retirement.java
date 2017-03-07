package com.company;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/7.
 */
public class Retirement {
    public static  void main(String[] args){
        System.out.println("这个程序将计算需要多长时间才能够储存一定数量的退休金");
        System.out.println("当你的余额到到多少时你开始准备退休？");
        Scanner in = new Scanner(System.in);
        Double total = in.nextDouble();
        System.out.println("你现在每年的可以存入银行的金额是多少？");
        Double moneyOfYear = in.nextDouble();
        System.out.println("银行的利息是多少?");
        Double rate = in.nextDouble();
        System.out.println("你还需要"+new SumYear().SumYear(total,moneyOfYear,rate)+"年才能退休.");
    }
}
class SumYear{
    private Double money=0.0;
    private int year = 0;
    public int SumYear(Double total,Double moneyOfYear,Double rate) {
        while(total>money){
            money=money+moneyOfYear+money*rate;
            year++;
        }
        return year;
    }
}
