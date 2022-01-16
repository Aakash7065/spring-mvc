package com.example.springmvc;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findUsersById(Integer id);
}
