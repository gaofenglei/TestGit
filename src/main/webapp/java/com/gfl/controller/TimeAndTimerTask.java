package com.gfl.controller;

import java.text.ParseException;
import java.util.Timer;
import java.util.TimerTask;

public class TimeAndTimerTask {
      /*
           使用Timer的时候，必须要有一个TimerTask去执行任务，
           这是一个线程，它实现了Runnable接口，run方法里面就是线程需要做的，
           也是我们自己定义的，scheduleAtFixedRate（TimerTask(),0,3600*1000）,中三个参数，

           1、第一个是TimerTask()执行任务的参数；业务代码放在 run() 方法中。
           2、0 为第二个参数，此处表示，开始时就执行一次，
           此参数可以根据需求自己定义，比如：new date(),1000,等等。(第二个参数是延迟多长时间执行  单位为毫秒)
           3、第三个参数为间隔时间，每次间隔该时间，
           再次执行一次，此处为两小时。(下次在执行这个方法的时间)
       * */
    public static void timer1() {
        Timer timer = new Timer();
            TimerTask timerTask=new TimerTask() {
                public void run() {
                    System.out.println("-------hello--------");
                }
            };
         timer.schedule(timerTask,2000,1*60*1000);// 设定指定的时间time,此处为2000毫秒
    }

    public static void main(String[] args) throws ParseException {
        //timer1();
    }
}
