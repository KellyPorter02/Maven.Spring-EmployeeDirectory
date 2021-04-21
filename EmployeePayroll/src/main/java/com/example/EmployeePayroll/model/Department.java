package com.example.EmployeePayroll.model;




import javax.persistence.*;

@Entity
public class Department {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long departmentNumber;
    private String name;
    @Transient
    private Employee departmentManager;


    public Long getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Long departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Employee departmentManager) {
        this.departmentManager = departmentManager;
    }
}
