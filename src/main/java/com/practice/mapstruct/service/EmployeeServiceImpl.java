package com.practice.mapstruct.service;

import com.practice.mapstruct.model.Employee;
import com.practice.mapstruct.model.EmployeeDto;
import com.practice.mapstruct.mapper.EmployeePopulator;
import com.practice.mapstruct.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeePopulator employeePopulator;

    public Employee createEmployee(EmployeeDto employeeDto){

        return employeeRepository.save(employeePopulator.populateEmployee(employeeDto));
    }
}
