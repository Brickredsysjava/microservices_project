package com.user.service;

import com.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    // fake User List
    List<User> list = List.of(
            new User(9999L, "Piyush Rai", "12321211"),
            new User(2222L, "Debayan", "1221211121"),
            new User(3333L, "Aditi", "12212111211"),
            new User(4444L, "Pankaj", "12212111211")
    );
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getId().equals(id)).findAny().orElse(null);
    }
}
