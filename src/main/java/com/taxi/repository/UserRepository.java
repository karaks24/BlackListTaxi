package com.taxi.repository;

import com.taxi.model.User;
import org.apache.ibatis.annotations.Select;

public interface UserRepository {

    @Select("SELECT * FROM user WHERE id = 1")
    User getRandomUser();
}
