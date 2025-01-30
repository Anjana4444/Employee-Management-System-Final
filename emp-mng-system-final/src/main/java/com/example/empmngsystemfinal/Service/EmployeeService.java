package com.example.empmngsystemfinal.Service;

import com.example.empmngsystemfinal.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    Iterable<Employee> findEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(long id, Employee employee);

    void deleteEmployee(long id);
}
