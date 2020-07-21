package com.travel.demo.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // user simulator
    User user1 = new User("Mumu", 32412, "Soul scholar");
    User user2 = new User("Amumu", 32421, "Soul singer");

    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public Optional<User> getUser(long id) {
        return userRepository.findById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

	public void updateUser(User user, long id) {
        userRepository.save(user);
	}
}