package org.example.projectstructuredatabase.service;

import lombok.RequiredArgsConstructor;
import org.example.projectstructuredatabase.dto.Customer;
import org.example.projectstructuredatabase.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
