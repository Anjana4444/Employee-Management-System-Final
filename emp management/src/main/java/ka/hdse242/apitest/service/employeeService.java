package ka.hdse242.apitest.service;

import ka.hdse242.apitest.model.employee;

import java.util.List;

public interface employeeService {

public employee savedata(employee employee);

public List<employee> getAllEmployee();

public void deleteEmployee(employee employee);
}
