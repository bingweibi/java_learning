package com.company;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/7.
 */
public class YangHui {
    public static void main(String[] args){
        System.out.println("模拟输出杨辉三角");
        System.out.println("请输入你想输出多少行杨辉三角");
        Scanner in = new Scanner(System.in);
        int line  = in.nextInt();
        int yang[][] = new int[line][line];
        //yang[0][0] = 1;
        //yang[1][0] = 1;
        //yang[1][1] = 1;
        for (int i=0;i<line;i++){
            for (int j=0;j<=i;j++){
                if (j==0||j==i){
                    yang[i][j]=1;
                }else {
                    yang[i][j]=yang[i-1][j-1]+yang[i-1][j];
                }
                System.out.print(yang[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
