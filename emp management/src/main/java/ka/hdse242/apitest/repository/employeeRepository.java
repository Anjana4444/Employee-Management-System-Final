package ka.hdse242.apitest.repository;

import ka.hdse242.apitest.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<employee, Integer> {
}
