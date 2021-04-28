package com.gfl.controller;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(i);
        }
        super.run();
    }
}
