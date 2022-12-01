package tech.myproject.employeemanager.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.myproject.employeemanager.exception.EmployeeNotFoundException;
import tech.myproject.employeemanager.model.Employee;
import tech.myproject.employeemanager.repository.EmployeeRepository;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFoundException(String.format("Employee with id: %s  not found", id)));
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
