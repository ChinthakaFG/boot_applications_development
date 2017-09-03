package com.fg.boot.interview;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/2/17 Time : 6:40 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : ExceptionInitiator
 */
public class ExceptionInitiator {

    public static void main(String[] args) {
        try {
            ExceptionController.createException();
        } catch (BankingUserException e) {
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("Throwed");
        }


    }

}
