package com.tsc.oktest;

import java.math.BigDecimal;

public final class Employee
{
    private String employeeName;
    private int employeeAge;
    private BigDecimal employeeSalary;

    public Employee(String employeeName, Integer employeeAge, BigDecimal employeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }

    public String getName() {
        return employeeName;
    }

    public int getAge() {
        return employeeAge;
    }

    public BigDecimal getSalary() {
        return employeeSalary;
    }

    @Override
    public String toString()
    {
        return "Employee [" + ", name=" + employeeName + ", age=" + employeeAge + ", salary=" + employeeSalary + "]";
    }
}
