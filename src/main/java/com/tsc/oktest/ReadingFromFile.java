package com.tsc.oktest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        DataValidation dataValidation = new DataValidation();
        try (Scanner scanner = new Scanner(new File("EmployersList"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] dataString = line.split("\\;");
                if (dataValidation.dataValidation(dataString)) {
                    //String employeeName = employeeData[0];
                    //int employeeAge = employeeData[1];
                    //BigDecimal employeeSalary = new BigDecimal(employeeData[2]).setScale(2, RoundingMode.FLOOR);
                    //String departmentName = employeeData[3];
                } else {
                }
                System.out.println(Arrays.toString(dataString));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}