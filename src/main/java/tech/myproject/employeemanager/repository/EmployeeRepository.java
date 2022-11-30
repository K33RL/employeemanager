package tech.myproject.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.myproject.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
