package com.example.empmngsystemfinal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @PostMapping("/saveEmployee")
    public String saveEmployee() {
        return "saveEmployee";
    }
}
