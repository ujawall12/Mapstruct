package com.practice.mapstruct.controller;

import com.practice.mapstruct.Entity.Employee;
import com.practice.mapstruct.Entity.EmployeeDto;
import com.practice.mapstruct.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/createEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDto employeeDto){

        return new ResponseEntity<>(employeeServiceImpl.createEmployee(employeeDto), HttpStatus.CREATED);
    }
}
