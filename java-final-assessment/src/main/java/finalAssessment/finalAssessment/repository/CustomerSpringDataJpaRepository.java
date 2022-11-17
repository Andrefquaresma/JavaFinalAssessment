package finalAssessment.finalAssessment.repository;

import finalAssessment.finalAssessment.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerSpringDataJpaRepository extends JpaRepository<CustomerModel, Integer> {

    CustomerModel findById(int id);

}
