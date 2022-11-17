package service;

import java.util.ArrayList;
import java.util.List;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerSpringDataJpaRepository;

@Service
public class ServiceCustomer {

    @Autowired
    CustomerSpringDataJpaRepository repository;


    public List<Customer> getAllCustomers() {
        List<Customer> allCustomers = new ArrayList<>();
        repository.findAll().forEach(customer -> allCustomers.add(customer));
        return allCustomers;
    }

    public Customer getCustomerById(int id) {
        return repository.findById(id);
    }
}
