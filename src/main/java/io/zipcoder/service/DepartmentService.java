package io.zipcoder.service;

import io.zipcoder.domain.Department;
import io.zipcoder.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department) {
        return null;
    }

    public Object createDepartment(Department department) {
        return null;
    }

    public Object updateDept(Long deptId) {
        return null;
    }

    public Object getEmployees(Long deptId) {
        return null;
    }

    public Object deleteDeptEmps() {
        return null;
    }

    public Object mergeDeptsChangeEmps(Long deptId) {
        return null;
    }
}
