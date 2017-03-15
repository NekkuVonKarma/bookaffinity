package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by f33ld on 15/03/2017.
 */

@RestController
public class UsersAPI {

    @RequestMapping("/logged-user-info")
    public String getLoggedUserInfo() {
        return "test data";
    }

}
