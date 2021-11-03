package com.tsc.oktest;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<ImmutableEmployee> immutableEmployeeList;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.immutableEmployeeList = new ArrayList<>();
    }

    public String getDepartment() {
        return departmentName;
    }
    public void setDepartment(String department) {
        this.departmentName = department;
    }

    public List<ImmutableEmployee> getEmployeeList() {
        return immutableEmployeeList;
    }

    @Override
    public String toString()
    {
        return "Department [" + ", departmentName=" + departmentName + ", immutableEmployeeList=" + immutableEmployeeList + "]";
    }
}
