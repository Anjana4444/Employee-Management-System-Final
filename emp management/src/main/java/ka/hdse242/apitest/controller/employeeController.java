package ka.hdse242.apitest.controller;

import ka.hdse242.apitest.model.employee;
import ka.hdse242.apitest.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empdata")
public class employeeController {

    @Autowired
    private employeeService employeeService;

    @PostMapping("/savedata")
    public String add(employee employee){
        employeeService.savedata(employee);
        return "data added successfully";
    }

    @GetMapping("/getdata")
    public List<employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable employee employee){
        try{
            employeeService.deleteEmployee(employee);
            return ResponseEntity.ok("data deleted successfully");
        }catch (IllegalArgumentException e){
            //return ResponseEntity.badRequest().body("data could not be deleted");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("data could not be deleted");
        }
    }
}
