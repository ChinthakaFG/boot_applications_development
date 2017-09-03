package com.fg.boot.interview;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/2/17 Time : 8:30 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : ThreadTwo
 */
public class ThreadTwo extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Thread two startigngggg");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
