package org.example.projectstructuredatabase.controller;

import lombok.RequiredArgsConstructor;
import org.example.projectstructuredatabase.dto.Customer;
import org.example.projectstructuredatabase.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/mongodb")
@RestController()
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/getAll")
    public List<Customer> getAll() {
        return customerService.getAll();

    }

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {

        return customerService.save(customer);
    }

    @GetMapping("/getById/{id}")
    public Customer getById(@PathVariable String id) {
        return customerService.getById(id);
    }

        @DeleteMapping("/delete{id}")
    public void delete(@PathVariable String id) {
        customerService.delete(id);
    }
//    @DeleteMapping("/delete")
//    public void delete(@RequestParam String id) {
//         customerService.delete(id);
//    }

}
