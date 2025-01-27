package com.example.empmngsystemfinal.Service;

import com.example.empmngsystemfinal.entity.Employee;

public interface EmployeeService {

    void saveEmployee(Employee employee);

    Iterable<Employee> findEmployees();

    Employee getEmployeeById(long id);
}
