package com.gfl.controller;

public class RunnableDemo3 {
    public static void main(String[] args) {
        RunnableDemo runnableDemo=new RunnableDemo();
        Thread thread=new Thread(runnableDemo);
        thread.start();
        RunnableDemo2 runnableDemo2=new RunnableDemo2();
        Thread thread2=new Thread(runnableDemo2);
        thread2.start();
        System.out.println("执行完毕!");
    }
}
