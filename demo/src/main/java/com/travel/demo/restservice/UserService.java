package com.travel.demo.restservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    //user simulator
    User user1 = new User("Mumu", 32412, "Soul scholar");
    User user2 = new User("Amumu",32421,"Soul singer");

    private List<User> container = Arrays.asList(user1, user2);

    public List<User> getContainer() {
        return container;
    }
    
}