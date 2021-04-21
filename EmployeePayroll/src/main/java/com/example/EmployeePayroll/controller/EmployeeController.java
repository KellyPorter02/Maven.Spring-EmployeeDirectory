package com.example.EmployeePayroll.controller;

import com.example.EmployeePayroll.model.Employee;
import com.example.EmployeePayroll.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    // this is a bean (singleton) now can call and use the service class' methods here
    // controller also a bean
    @Autowired
    private EmployeeService employeeService;

    private final String BASE_URI = "/API/employee/";

    // @RequestBody - maps a JSON ob for you to a java object
    @PostMapping(BASE_URI + "create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @PutMapping(BASE_URI + "updateManager/{id}/{managerId}")
    public ResponseEntity<Employee> updateEmployeeManager(@PathVariable Long id, @PathVariable Long managerId) {
        return new ResponseEntity<>(employeeService.updateEmployeeManager(id, managerId), HttpStatus.OK);
    }

}
