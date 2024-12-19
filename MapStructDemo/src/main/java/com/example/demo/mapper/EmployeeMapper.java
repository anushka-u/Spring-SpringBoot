package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

@Mapper(componentModel="spring")
public interface EmployeeMapper {
	
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(source="name",target="empName")
    @Mapping(source = "id", target = "empId")
    EmployeeDto toEmployeeDto(Employee employee);

    @Mapping(source="empName",target="name")
    @Mapping(source = "empId", target = "id")
    Employee toEmployee(EmployeeDto employeeDto);
}