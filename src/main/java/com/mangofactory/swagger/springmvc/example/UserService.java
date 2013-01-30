package com.mangofactory.swagger.springmvc.example;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.google.common.collect.Lists;
import com.mangofactory.swagger.ApiError;
import com.mangofactory.swagger.ApiErrors;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/user")
@Api(value="", description="Operations about users")
public class UserService {

    @RequestMapping(value="/createWithList",method=RequestMethod.PUT)
    @ApiOperation(value = "Create Users")
    public void createWithList(@RequestParam("users") final List<User> users) {

    }

    @RequestMapping(value="/",method=RequestMethod.PUT)
    @ApiOperation(value = "Create User")
    public void createUser(@RequestParam("user") final User createdUser) {

    }

    @RequestMapping(value="/{username}",method=RequestMethod.DELETE)
    @ApiOperation(value = "Delete User")
    public void deleteUser(@PathVariable("username") final String username) {

    }

    @RequestMapping(value="/{username}",method=RequestMethod.PUT)
    @ApiOperation(value = "Updated User")
    public void updateUser(@RequestParam("user") final User updatedUser) {

    }

    @RequestMapping(value="/{username}",method=RequestMethod.GET)
    @ApiOperation(value = "Get user by username")
    public User getUserByUserName(@PathVariable("username") final String username) {
        return new User();
    }

    @RequestMapping(value="/login",method=RequestMethod.GET)
    @ApiOperation(value = "Logs user into the system")
    public String login() {
      return "";
    }

    @RequestMapping(value="/logout",method=RequestMethod.GET)
    @ApiOperation(value = "Logs out currently logged in user")
    public void logout() {

    }
}
