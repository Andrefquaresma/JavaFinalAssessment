package repository;

import model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerSpringDataJpaRepository extends JpaRepository<Customer, Integer> {

    Customer findById(int id);

}
