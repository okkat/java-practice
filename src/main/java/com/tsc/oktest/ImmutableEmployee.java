package com.tsc.oktest;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Long.*;

public final class ImmutableEmployee
{
    private String name;
    private int age;
    private BigDecimal salary;

    public ImmutableEmployee(String name, String age, String salary) {
        this.name = name;
        this.age = Integer.parseInt(age);
        this.salary = BigDecimal.valueOf(parseLong(salary));
        //BigDecimal salary_bd = new BigDecimal(salary);
        //BigDecimal scaled_salary = salary_bd.setScale(2, RoundingMode.HALF_UP);
        //this.salary = scaled_salary;
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
        return "ImmutableEmployee [" + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
