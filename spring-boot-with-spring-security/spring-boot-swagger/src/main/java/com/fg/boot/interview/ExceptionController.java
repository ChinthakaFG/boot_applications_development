package com.fg.boot.interview;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/2/17 Time : 6:39 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : ExceptionController
 */
public class ExceptionController {

    public static void createException() throws BankingUserException{

        throw new BankingUserException("Banking User Exception Have Occured!!!");

    }

}
