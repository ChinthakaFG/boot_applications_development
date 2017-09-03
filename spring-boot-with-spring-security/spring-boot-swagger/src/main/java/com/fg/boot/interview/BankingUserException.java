package com.fg.boot.interview;

import java.io.IOException;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/2/17 Time : 6:37 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : BankingUserException
 */
public class BankingUserException extends RuntimeException {

    public BankingUserException(String message) {
        super(message);
    }

    public BankingUserException(String message, Throwable cause) {
        super(message, cause);
    }
}
