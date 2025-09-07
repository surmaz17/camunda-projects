package com.spring.training1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController
{
    private UserService usrSer;

    @Autowired
    public UserController(UserService usrSer)
    {
        this.usrSer=usrSer;
    }
    @GetMapping("")
    public User getUser(@RequestParam Integer id){
        return usrSer.getUser(id);
    }
    @GetMapping("/name/{id}")
    public String getName(@PathVariable Integer id)
    {
        return usrSer.getName(id);
    }
    @PostMapping
    public String createUser(@RequestBody User user)
    {
        usrSer.addUser(user);
        return "User Created Successfully";
    }
}
