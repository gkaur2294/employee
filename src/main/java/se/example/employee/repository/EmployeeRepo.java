package se.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.example.employee.dto.EmployeeDto;

public interface EmployeeRepo extends JpaRepository<EmployeeDto,String> {
}
