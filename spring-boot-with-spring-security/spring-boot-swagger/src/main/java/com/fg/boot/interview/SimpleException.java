package com.fg.boot.interview;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/2/17 Time : 7:26 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : SimpleException
 */
public class SimpleException  extends Throwable {

    /**
     * @param message
     * @param cause
     */
    public SimpleException(String message, Throwable cause) {
        super(message, cause);
    }
}
