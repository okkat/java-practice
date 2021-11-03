package com.tsc.oktest;

import java.io.*;

import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DataValidation {

    //читаем из файла
    public void downloadFromFile(String path, String textCode, Company company) throws IOException {
        Map<String, Department> departmentMap = company.getDepartmentMap();
        File file = new File("EmploersList");

            try {
                if (file.exists() == false) throw new Exception("Файл не существует! Добавьте, пожалуйста, файл со списком сотрудников");
            } catch (Exception e) {
                e.printStackTrace();
            }

            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] dataString = line.split("\\;");
                dataValidation(dataString, departmentMap);

                System.out.println(Arrays.toString(dataString));
            }
            scanner.close();
        }

    //проверка существования данных в строке
    private void dataValidation(String[] employeeData, Map<String, Department> departmentMap) {
        try {
            if (employeeData[0].isEmpty())
                throw new Exception("Имя сотрудника не заполнено");
            if (employeeData[1].isEmpty())
                throw new Exception("Возраст сотрудника не заполнен");
            if (employeeData[2].isEmpty())
                throw new Exception("Зарплата сотрудника не заполнена");
            if (employeeData[3].isEmpty())
                throw new Exception("Департамент сотрудника не заполнен");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
