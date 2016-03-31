package com.taxi.service;


import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.taxi.model.User;
import com.taxi.repository.UserRepository;

@Singleton
public class UserServiceImpl implements UserService {

    @Inject
    private UserRepository userRepository;

    @Override
    public User get() {
        String name = userRepository.getRandomUser().getName();
        User user = new User();
        user.setName(name);
        return user;
    }
}
