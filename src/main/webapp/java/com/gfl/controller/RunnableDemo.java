package com.gfl.controller;

public class RunnableDemo implements Runnable{
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(i);
        }
    }
}
