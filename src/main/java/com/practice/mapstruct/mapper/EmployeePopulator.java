package com.practice.mapstruct.mapper;

import com.practice.mapstruct.model.Employee;
import com.practice.mapstruct.model.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeePopulator {

    Employee populateEmployee(EmployeeDto employeeDto);
}
