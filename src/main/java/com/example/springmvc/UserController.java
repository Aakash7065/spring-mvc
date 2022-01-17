package com.example.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public String addUser(@RequestParam("userName") String userName,
                          @RequestParam(name= "email", required = true) String userEmail,
                          @RequestParam("password") String userPassword, @RequestParam("phone") String phone) {
        Customer customer = new Customer();
        customer.setUserName(userName);
        customer.setEmail(userEmail);
        customer.setPassword(userPassword);
        customer.setPhone(phone);
        userRepository.save(customer);
        return "Added new User to repo!";
    }

    @GetMapping("/list")
    public Iterable<Customer> getCustomers() {
        return userRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Customer findCustomerById(@PathVariable Integer id) {
        return userRepository.findUsersById(id);
    }
}
