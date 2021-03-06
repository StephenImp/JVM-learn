package com.cn.atguigu.chapter05;

/**
 * i++和++i的区别
 */
public class InterviewFAQs2 {

    public void add(){

        //第一类问题
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        //第二类问题
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;


        //第三类问题
        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = ++i8;

        //第四类问题
        int i9 = 10;
        int i10 = i9++ + ++i9;

    }

    public static void main(String[] args) {

        int i = 23;
        int j = i++;
        int k = ++i;

        System.out.println(j);
        System.out.println(k);

    }



}
