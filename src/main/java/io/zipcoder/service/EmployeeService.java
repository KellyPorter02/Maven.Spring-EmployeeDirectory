package io.zipcoder.service;

import io.zipcoder.domain.Employee;
import io.zipcoder.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Object createEmployee(Employee employee) {
        return null;
    }

    public Object updateEmployee(Long empId) {
        return null;
    }

    public Object getEmpsOfManager(Long managerId) {
        return null;
    }

    public Object getManagers(Long empId) {
        return null;
    }

    public Object getEmpsNoManagers() {
        return null;
    }

    public Object getEmployeesReportingToManager(Long managerId) {
        return null;
    }

    public Object deleteById(Long empId) {
        return null;
    }

    public Object deleteAll() {
        return null;
    }

    public Object removeManagersEmps(Long managerId) {
        return null;
    }

    public Object removeManagerShiftEmps(Long managerId) {
        return null;
    }

    public Object getEmpDetails(Long id) {
        return null;
    }
}
