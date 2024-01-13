package com.practice.mapstruct.service;

import com.practice.mapstruct.Entity.Employee;
import com.practice.mapstruct.Entity.EmployeeDto;
import com.practice.mapstruct.mapper.EmployeePopulator;
import com.practice.mapstruct.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(EmployeeDto employeeDto){

        return employeeRepository.save(EmployeePopulator.INSTANCE.populateEmployee(employeeDto));
    }
}
