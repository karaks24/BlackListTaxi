package com.taxi.service;

import com.google.inject.ImplementedBy;
import com.taxi.model.User;

@ImplementedBy(UserServiceImpl.class)
public interface UserService {
    User get();
}
