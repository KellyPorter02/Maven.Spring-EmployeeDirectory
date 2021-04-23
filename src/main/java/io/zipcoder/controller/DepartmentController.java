package io.zipcoder.controller;


import io.zipcoder.domain.Department;
import io.zipcoder.domain.Employee;
import io.zipcoder.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API/")
public class DepartmentController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("departments")
    public ResponseEntity<?> createDepartment(@RequestBody Department department) {
        return new ResponseEntity<>(departmentService.createDepartment(department), HttpStatus.CREATED);
    }

    @PutMapping("departments/{deptId}")
    public ResponseEntity<?> updateDepartment(@PathVariable Long deptId) {
        return new ResponseEntity<>(departmentService.updateDept(deptId), HttpStatus.OK);
    }

    @GetMapping("departments/{deptId}/employees")
    public ResponseEntity<?> getDeptEmployees(@PathVariable Long deptId) {
        return new ResponseEntity<>(departmentService.getEmployees(deptId), HttpStatus.OK);
    }

    @DeleteMapping("departments")
    public ResponseEntity<?> deleteAllDepartmentEmployees() {
        return new ResponseEntity<>(departmentService.deleteDeptEmps(), HttpStatus.OK);
    }

    @PutMapping("departments/{deptId}")
    public ResponseEntity<?> mergeDepartments(@PathVariable Long deptId) {
        return new ResponseEntity<>(departmentService.mergeDeptsChangeEmps(deptId), HttpStatus.OK);
    }


}
