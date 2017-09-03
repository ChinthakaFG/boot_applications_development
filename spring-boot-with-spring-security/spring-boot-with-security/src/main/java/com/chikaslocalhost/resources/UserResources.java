package com.chikaslocalhost.resources;

import com.chikaslocalhost.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * App Name swagger-gradle-init
 * <p>
 * Created Date : 9/1/17 Time : 10:12 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.chikaslocalhost.resources
 * Class Name : UserResources
 */
@Service(value = "/userService")
public class UserResources {

    @RequestMapping(method = RequestMethod.POST, value = "/save/personal/user")
    public void saveUser(User user){
        System.out.println("User is saving to the db"+user.toString());
    }



}
