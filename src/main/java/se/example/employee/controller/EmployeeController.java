package se.example.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.example.employee.dto.EmployeeDto;
import se.example.employee.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("employees")
    public List<EmployeeDto> getAllEmployee() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("employees")
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employee) {
        return employeeService.save(employee);
    }
    //Endpoint to get all employees who work in infra team

    //Endpoint to add roles for all employees, by default all are developers but employees in customer team are support-agents

    //Endpoint to list all developers by team

}
