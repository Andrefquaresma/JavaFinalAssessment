package repository;

import model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerSpringDataJpaRepository extends JpaRepository<Customer, Integer> {

    Customer findById(int id);

}
