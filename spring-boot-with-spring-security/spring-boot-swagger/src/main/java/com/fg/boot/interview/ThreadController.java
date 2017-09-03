package com.fg.boot.interview;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/2/17 Time : 8:25 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : ThreadController
 */
public class ThreadController {

    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        try {
            threadOne.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
