package ka.hdse242.apitest.service;

import ka.hdse242.apitest.model.Employee;

import java.util.List;

public interface employeeService {

public Employee savedata(Employee employee);

public List<Employee> getAllEmployee();

public void deleteEmployee(Employee employee);
}
