package com.tsc.oktest;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee
{
    private String name;
    private int age;
    private BigDecimal salary;

    public Employee(String name, String age, String salary) {
        this.name = name;
        this.age = Integer.parseInt(age);
        BigDecimal salary_bd = new BigDecimal(salary);
        BigDecimal scaled_salary = salary_bd.setScale(2, RoundingMode.HALF_UP);
        this.salary = scaled_salary; //сделать через конструктор от строки new BigDecimal, проверять, что это число!
        //String str = "123,456";
        //BigDecimal b = new BigDecimal(str.replace(',', '.')).setScale(2, BigDecimal.ROUND_DOWN);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Employee [" + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
