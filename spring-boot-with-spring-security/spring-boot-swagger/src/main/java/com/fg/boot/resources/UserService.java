package com.fg.boot.resources;

import com.fg.boot.model.PersonalUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/1/17 Time : 10:41 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.clabz.swagger.resources
 * Class Name : UserService
 */
@RestController
public class UserService {

    @RequestMapping(value = "/personal/user/init", method = RequestMethod.GET)
    public String applicationInit() {
        return new PersonalUser("Umaya", "0546456465", "0712402547", "0112502552").toString();
    }

    @RequestMapping(value = "/personal/user/get", method = RequestMethod.GET)
    public PersonalUser getUsers() {
        return new PersonalUser("Umaya", "0546456465", "0712402547", "0112502552");
    }

    @RequestMapping(value = "/create/personal/user", method = RequestMethod.POST)
    public void createUser(@Valid PersonalUser personalUser) {
        System.out.println("Creatting user " + personalUser.toString());
    }

}
