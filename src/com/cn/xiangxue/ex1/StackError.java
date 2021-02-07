package com.cn.xiangxue.ex1;
/**
 * @author imp
 * 虚拟机栈溢出
 */
public class StackError {
    public static void main(String[] args) {
        A();
    }
    public static void A(){
        A();
    }
}
