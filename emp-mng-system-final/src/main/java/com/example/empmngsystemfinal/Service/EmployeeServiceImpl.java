package com.example.empmngsystemfinal.Service;

import com.example.empmngsystemfinal.Repository.EmployeeRepository;
import com.example.empmngsystemfinal.entity.Employee;
import org.hibernate.FetchNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    @Override
    public Iterable<Employee> findEmployees() {
       return employeeRepository.findAll();

    }

    @Override
    public Employee getEmployeeById(long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()-> new FetchNotFoundException("employee", id));
        return employee;
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }


}
