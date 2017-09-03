package com.fg.boot.interview;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/2/17 Time : 8:24 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : ThreadOne
 */
public class ThreadOne extends Thread {
    @Override
    public void run() {
        int x = 0;
        while (true){
            System.out.println("Running First Thread"+x);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(x == 20){
                Thread.yield();
            }
            x++;
        }

    }
}
