package com.tsc.oktest;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName; //именования должны максимально отражать, что в них находится
    private List<Employee> employeeList;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employeeList = new ArrayList<>();
    }

    public String getDepartment() {
        return departmentName;
    }
    public void setDepartment(String department) {
        this.departmentName = department;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // get employers list!
    //объяви как поле, потом добавь геттеры/сеттеры
    //добавить связку депа + сотрудника

    @Override
    public String toString()
    {
        return "Department [" + ", departmentName=" + departmentName + ", employeeList=" + employeeList + "]";
    }
}
