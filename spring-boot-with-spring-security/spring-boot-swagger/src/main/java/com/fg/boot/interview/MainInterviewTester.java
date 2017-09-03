package com.fg.boot.interview;

import java.util.HashSet;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/2/17 Time : 12:32 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : MainInterviewTester
 */
public class MainInterviewTester {

    public void callTester(){
        System.out.println("Call testingggg......");

        HashSet shortSet = new HashSet();
        for(short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i-1);
        }
        System.out.println(shortSet.size());

        String s3 = "JournalDev";
        int start = 1;
        char end = 5;
        System.out.println(start+end);
        System.out.println(s3.substring(start,end));


        try{
            if(false){
                while (true){

                }
            }else {
                System.exit(0);
            }
        }finally {
            System.out.println("Finalllll");
        }




    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalized.....");
    }

}
