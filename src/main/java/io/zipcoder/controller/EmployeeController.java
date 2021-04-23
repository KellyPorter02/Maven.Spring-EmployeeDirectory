package io.zipcoder.controller;


import io.zipcoder.domain.Employee;
import io.zipcoder.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API/")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("employees")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @PutMapping("employees/{empId}")
    public ResponseEntity<?> updateEmployee(@PathVariable Long empId, Employee employee) {
        return new ResponseEntity<>(employeeService.updateEmployee(empId), HttpStatus.OK);
    }

    @GetMapping("employees/{managerId}/managersemployees")
    public ResponseEntity<?> getEmployeesOfManager(@PathVariable Long managerId) {
        return new ResponseEntity<>(employeeService.getEmpsOfManager(managerId), HttpStatus.OK);
    }

    @GetMapping("employees/{empId}/managers")
    public ResponseEntity<?> getManagerHierarchy(@PathVariable Long empId) {
        return new ResponseEntity<>(employeeService.getManagers(empId), HttpStatus.OK);
    }

    @GetMapping("employees/nomanagers")
    public ResponseEntity<?> getEmployeesWithoutManagers() {
        return new ResponseEntity<>(employeeService.getEmpsNoManagers(), HttpStatus.OK);
    }

    @GetMapping("employees/{managerId}/employeesreporting")
    public ResponseEntity<?> getEmployeesReportingToManager(@PathVariable Long managerId) {
        return new ResponseEntity<>(employeeService.getEmployeesReportingToManager(managerId), HttpStatus.OK);
    }

    @DeleteMapping("employees/{empId}")
    public ResponseEntity<?> removeEmployeeById(@PathVariable Long empId) {
        return new ResponseEntity<>(employeeService.deleteById(empId), HttpStatus.OK);
    }

    @DeleteMapping("employees")
    public ResponseEntity<?> removeAllEmployees() {
        return new ResponseEntity<>(employeeService.deleteAll(), HttpStatus.OK);
    }

    @DeleteMapping("employees/{managerId}")
    public ResponseEntity<?> removeEmployeesOfManager(@PathVariable Long managerId) {
        return new ResponseEntity<>(employeeService.removeManagersEmps(managerId), HttpStatus.OK);
    }

    /*
        Remove all direct reports to a manager. Any employees previously managed by the deleted employees
        should now be managed by the next manager up the hierarchy.
     */
    @DeleteMapping("employees/{managerId}")
    public ResponseEntity<?> removeManagerAndShiftEmployees(@PathVariable Long managerId) {
        return new ResponseEntity<>(employeeService.removeManagerShiftEmps(managerId), HttpStatus.OK);
    }

    @GetMapping("employee/{id}")
    public ResponseEntity<?> getEmployeeDetails(@PathVariable Long id) {
        return new ResponseEntity<>(employeeService.getEmpDetails(id), HttpStatus.OK);
    }


}
