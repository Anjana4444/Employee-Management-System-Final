package com.example.empmngsystemfinal.Controllers;

import com.example.empmngsystemfinal.Service.EmployeeService;
import com.example.empmngsystemfinal.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/register")
    public String registration(@ModelAttribute("employee")Employee employee, Model model) {
        Employee employee1 = new Employee();
        model.addAttribute("employee", employee);
        return "registration";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee")Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }
}
