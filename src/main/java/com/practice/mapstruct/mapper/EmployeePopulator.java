package com.practice.mapstruct.mapper;

import com.practice.mapstruct.Entity.Employee;
import com.practice.mapstruct.Entity.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeePopulator {

    EmployeePopulator INSTANCE= Mappers.getMapper(EmployeePopulator.class);
//    @Mapping(target = "id", ignore = true)
    Employee populateEmployee(EmployeeDto employeeDto);
}
