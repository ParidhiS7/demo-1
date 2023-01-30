package com.spring.demos.service;

import com.spring.demos.model.Employee;

import java.util.Optional;

public interface EmployeeServiceI {


    public Optional<Employee> getEmployeeById(int id);
    public void saveEmployee(Employee employee);

    public void deleteEmployee(int id);
}
