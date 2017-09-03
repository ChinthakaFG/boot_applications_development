package com.fg.boot.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/1/17 Time : 10:44 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.clabz.swagger.model
 * Class Name : PersonalUser
 */
public class PersonalUser {

    @ApiModelProperty(notes = "The username description")
    private String username;

    @ApiModelProperty(notes = "The password description")
    private String password;

    @ApiModelProperty(notes = "The mobile description")
    private String mobileNumber;

    @ApiModelProperty(notes = "The fax description")
    private String faxNumber;

    public PersonalUser() {
    }

    public PersonalUser(String username, String password, String mobileNumber, String faxNumber) {
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.faxNumber = faxNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @Override
    public String toString() {
        return "PersonalUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                '}';
    }
}
