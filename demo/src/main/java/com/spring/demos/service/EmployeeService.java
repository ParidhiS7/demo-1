package com.spring.demos.service;

import com.spring.demos.model.Employee;
import com.spring.demos.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceI{
    @Autowired private EmployeeRepo employeeRepo;
    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepo.findById(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
            employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
          employeeRepo.deleteById(id);
    }
}
