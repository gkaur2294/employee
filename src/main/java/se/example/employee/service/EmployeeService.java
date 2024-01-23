package se.example.employee.service;

import org.springframework.stereotype.Service;
import se.example.employee.dto.EmployeeDto;
import se.example.employee.repository.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<EmployeeDto> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public EmployeeDto save(EmployeeDto employee) {
        return employeeRepo.save(employee);
    }
}
