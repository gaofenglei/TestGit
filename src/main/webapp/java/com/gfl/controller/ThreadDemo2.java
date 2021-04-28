package com.gfl.controller;

public class ThreadDemo2 extends Thread{
    @Override
    public void run() {
        for (int i = 1000; i <2000 ; i++) {
            System.out.println(i);
        }
        super.run();
    }
}
