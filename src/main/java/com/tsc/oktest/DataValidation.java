package com.tsc.oktest;

import java.math.BigDecimal;

public class DataValidation {

    //проверка существования данных в строке + валидация данных
    public boolean dataValidation(String[] employeeData) {
        try {
            if (employeeData.length < 4)
                throw new MyException("В строке недостаточно данных");
            if (employeeData.length > 4)
                throw new MyException("В строке превышено количество данных");
            if (employeeData[0].trim().length() == 0)
                throw new MyException("Имя сотрудника не заполнено");
            if (!employeeData[0].matches("[A-zА-яËё -]+$"))
                throw new MyException("Некорректное имя сотрудника, допускаются только буквы, пробел и дефис");
            //получить имя сотрудника
            if (employeeData[1].trim().length() == 0)
                throw new MyException("Возраст сотрудника не заполнен");
            Integer.parseInt(employeeData[1].trim());
            if (employeeData[2].trim().length() == 0)
                throw new MyException("Зарплата сотрудника не заполнена");
            BigDecimal salary = new BigDecimal(employeeData[1].trim());
            if (employeeData[3].trim().length() == 0)
                throw new MyException("Департамент сотрудника не заполнен");
        } catch (NumberFormatException nfe) {
            System.out.println("Введено некорректное значение " + nfe.getMessage());
            return false;
        } catch (MyException me) {
            System.out.println(me.getMessage());
            return false;
        }
        return true;
    }

    //добавила MyException вместо Exception
    static class MyException extends Exception {

        public MyException(String msg) {
            super(msg);
        }
    }
}
