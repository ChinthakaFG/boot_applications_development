package com.chikaslocalhost;

import java.util.ArrayList;
import java.util.Collection;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 8/19/17 Time : 10:51 AM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.chikaslocalhost
 * Class Name : Fooooooo
 */
public class Fooooooo {
    int x = 0;
    public int  meth(){
        for ( int i = 0; i < 5000; i++ )
        {
            x = x + 1;
        }

        return x;
    }

    public static void main(String[] args) {

        final Fooooooo fooooooo = new Fooooooo();
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                int xxx = fooooooo.meth();
                System.out.println("Thred one"+xxx);

                Iisisissi iisisissi = new Iisisissi();
                for (Object iisisissi1:
                     iisisissi) {

                }
            }
        });
        one.start();

        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                int xxx = fooooooo.meth();
                System.out.println("Thred two"+xxx);
            }
        });
        two.start();

    }

}
