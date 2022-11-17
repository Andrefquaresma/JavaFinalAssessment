package controller;

import java.util.List;
import model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import repository.CustomerSpringDataJpaRepository;

@RestController
public class ControllerApp {

    private CustomerSpringDataJpaRepository repository;

    ControllerApp(CustomerSpringDataJpaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customer")
    public List<Customer> retrieveAllCustomers() {
        return repository.findAll();
    }

    @GetMapping("/customer/{id}")
    public Customer retrieveCustomer(@PathVariable int id) {
        return repository.findById(id);

    }





}
