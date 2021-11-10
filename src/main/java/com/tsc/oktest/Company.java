package com.tsc.oktest;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private String companyName;
    private Map<String, Department> departmentMap = new HashMap<>();

    public Company(String companyName) {
        this.companyName = companyName;
        this.departmentMap = new HashMap<>();
    }

    public String getCompany() {
        return companyName;
    }

    public void setCompany(String company) {
        this.companyName = company;
    }

    public Map<String, Department> getDepartmentMap() {
        return departmentMap;
    }
}
