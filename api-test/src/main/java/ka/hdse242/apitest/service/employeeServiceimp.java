package ka.hdse242.apitest.service;

import ka.hdse242.apitest.model.Employee;
import ka.hdse242.apitest.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeServiceimp implements employeeService {

    @Autowired
    private employeeRepository repository;

    @Override
    public Employee savedata(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }

    @Override
    public void deleteEmployee(Employee employee) {
        repository.delete(employee);
    }
}
