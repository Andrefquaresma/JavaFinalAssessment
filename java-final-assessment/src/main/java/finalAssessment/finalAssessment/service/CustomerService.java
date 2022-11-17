package finalAssessment.finalAssessment.service;

import java.util.ArrayList;
import java.util.List;
import finalAssessment.finalAssessment.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import finalAssessment.finalAssessment.repository.CustomerSpringDataJpaRepository;

@Service
public class CustomerService {

    @Autowired
    CustomerSpringDataJpaRepository repository;


    public List<CustomerModel> getAllCustomers() {
        List<CustomerModel> allCustomers = new ArrayList<>();
        repository.findAll().forEach(customer -> allCustomers.add(customer));
        return allCustomers;
    }

    public CustomerModel getCustomerById(int id) {
        return repository.findById(id);
    }

    public void saveOrUpdate(CustomerModel customer) {
        repository.save(customer);
    }

    public void deleteCustomer(int id) {
        repository.delete(getCustomerById(id));
    }

    public Customer(String email) {

    }
}
