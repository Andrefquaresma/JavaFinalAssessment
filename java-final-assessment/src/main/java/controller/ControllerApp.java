package controller;

import java.util.List;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.CustomerSpringDataJpaRepository;
import service.ServiceCustomer;

@RestController
@RequestMapping("")
public class ControllerApp {

    @Autowired
    private ServiceCustomer service;


    @GetMapping("/customer")
    public List<Customer> retrieveAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer retrieveCustomer(@PathVariable int id) {
        return service.getCustomerById(id);
    }





}
