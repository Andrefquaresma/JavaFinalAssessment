package finalAssessment.finalAssessment.controller;

import finalAssessment.finalAssessment.model.CustomerModel;
import finalAssessment.finalAssessment.service.CustomerService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ControllerApp {

    @Autowired
    private CustomerService service;


    @GetMapping("/customer")
    public List<CustomerModel> retrieveAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public CustomerModel retrieveCustomer(@PathVariable int id) {
        return service.getCustomerById(id);
    }
    





}
