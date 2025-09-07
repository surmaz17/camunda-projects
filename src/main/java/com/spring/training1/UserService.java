package com.spring.training1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    private ArrayList<User> userList;
    public UserService()
    {
        userList = new ArrayList<>();
    }
    public User getUser(Integer id) {

        for(User usr: userList)
        {
            if(usr.getId().equals(id))
                return usr;
        }
        return null;
    }

    public String getName(Integer id) {
        for(User usr: userList)
        {
            if(usr.getId().equals(id))
                return usr.getName();
        }
        return "";
    }

    public void addUser(User user) {
        userList.add(user);
    }
}
