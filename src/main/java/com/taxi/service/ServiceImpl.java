package com.taxi.service;


import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.taxi.repository.UserRepository;

@Singleton
public class ServiceImpl implements Service {

    @Inject
    private UserRepository userRepository;

    @Override
    public String sayHello() {
        return userRepository.getRandomUser().getName();
    }
}
