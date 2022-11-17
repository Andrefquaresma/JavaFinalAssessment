package finalAssessment.finalAssessment.controller;

import finalAssessment.finalAssessment.model.CustomerModel;
import finalAssessment.finalAssessment.service.CustomerService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ControllerApp {

    @Autowired
    private CustomerService service;


    @GetMapping("/customer")
    private List<CustomerModel> retrieveAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    private CustomerModel retrieveCustomer(@PathVariable int id) {
        return service.getCustomerById(id);
    }

    @PostMapping ("/customer")
    @CrossOrigin(origins="*")
    private int addAndUpdateCustomer(@RequestBody CustomerModel customer) {
        service.saveOrUpdate(customer);
        return customer.getId();
    }


    @DeleteMapping("/customer/{id}")
    private void deleteCustomer(@PathVariable("id") int id) {
        service.deleteCustomer(id);
    }




}
