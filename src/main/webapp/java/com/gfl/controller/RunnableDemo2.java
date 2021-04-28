package com.gfl.controller;

public class RunnableDemo2 implements Runnable{
    public void run() {
        for (int i = 1000; i <2000 ; i++) {
            System.out.println(i);
        }
    }
}
