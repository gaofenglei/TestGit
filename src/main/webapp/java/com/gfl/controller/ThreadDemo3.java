package com.gfl.controller;

public class ThreadDemo3 {
    public static void main(String[] args){
        ThreadDemo demo1=new ThreadDemo();
        demo1.start();
        ThreadDemo2 demo2=new ThreadDemo2();
        demo2.start();
        System.out.println("执行完毕!");
    }
}
