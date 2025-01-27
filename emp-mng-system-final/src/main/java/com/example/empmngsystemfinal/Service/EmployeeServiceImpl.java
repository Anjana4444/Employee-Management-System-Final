package com.example.empmngsystemfinal.Service;

import com.example.empmngsystemfinal.Repository.EmployeeRepository;
import com.example.empmngsystemfinal.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

}
