package com.taxi.service;


import com.google.inject.Singleton;

@Singleton
public class ServiceImpl implements Service{


    @Override
    public String sayHello() {
        return "Hello World";
    }
}
