package com.example.EmployeePayroll.service;


import com.example.EmployeePayroll.model.Employee;
import com.example.EmployeePayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Entity;

import javax.persistence.Access;
import java.util.Optional;

// spring boot instantiates for you at start up + any component
// tells spring to give you access to the object (the bean)
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // finding employee & setting the manager
    public Employee updateEmployeeManager(Long id, Long managerId) {
        Employee empToUpdate = employeeRepository.findById(id).get();
        empToUpdate.setManager(employeeRepository.findById(managerId).get());
        return empToUpdate;
    }
}
