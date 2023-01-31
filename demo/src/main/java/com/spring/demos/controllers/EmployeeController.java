package com.spring.demos.controllers;

import com.spring.demos.model.Employee;
import com.spring.demos.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class EmployeeController {
    private static final Logger logger= (Logger) LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/get/{id}")
    public ResponseEntity<?> empHandler(@PathVariable("id") int id){

        logger.info("Inside handler to get Employee");
        logger.info(("Changing code...check github repo"));
        Optional<Employee> employee1=employeeService.getEmployeeById(id);
       employee1.ifPresent(value->System.out.println("Checking"));


        return ResponseEntity.ok().body(employee1);

    }


    @PostMapping(value = "/employee/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> empPostHandler(@RequestBody Employee emp){

        logger.info("Inside handler to save Employee");
        System.out.println("Employee is " + emp);
        employeeService.saveEmployee(emp);
        return ResponseEntity.ok().body("Success");



    }
}
