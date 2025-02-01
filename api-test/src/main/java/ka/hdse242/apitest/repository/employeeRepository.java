package ka.hdse242.apitest.repository;

import ka.hdse242.apitest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<Employee, Integer> {
}
