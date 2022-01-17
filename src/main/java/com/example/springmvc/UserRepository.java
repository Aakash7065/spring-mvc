package com.example.springmvc;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Customer, Integer> {
    Customer findUsersById(Integer id);
}
