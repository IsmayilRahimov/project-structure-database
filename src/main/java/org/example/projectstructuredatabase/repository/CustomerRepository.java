package org.example.projectstructuredatabase.repository;

import org.example.projectstructuredatabase.dto.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
