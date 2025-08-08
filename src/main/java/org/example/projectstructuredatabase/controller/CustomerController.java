package org.example.projectstructuredatabase.controller;

import lombok.RequiredArgsConstructor;
import org.example.projectstructuredatabase.dto.Customer;
import org.example.projectstructuredatabase.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAll();

    }

    @PostMapping
    public Customer save(@RequestBody Customer customer) {

        return customerService.save(customer);
    }

    @GetMapping("/{id}")
    public Customer getById(String id) {
        return customerService.getById(id);
    }

    @DeleteMapping()
    public void delete(String id) {
        customerService.delete(id);
    }


}
