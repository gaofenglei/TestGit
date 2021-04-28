package com.gfl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Demo {

    @RequestMapping("/test")
    public String test(){
        Byte[] b=new Byte[1024*1024*1];
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString();
    }
}
