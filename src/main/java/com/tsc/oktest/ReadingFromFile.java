package com.tsc.oktest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main( String[] args ) throws FileNotFoundException { // добавить валидацию (+ сообщение об ошибке),  наверх не закидываем!
        File file = new File("EmployersList");

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
           String line = scanner.nextLine();
           String[] dataString = line.split("\\;");

           System.out.println(Arrays.toString(dataString));
       }
        scanner.close();
    }
}
// цикл оставляем, у строки есть сплит
// данные из строки преобразуем в классы
// сообщение об ошибках выводить в консоль, не стектрейсом, а сообщением (какой именно файл не найден = выведи имя файла)
// проверить файл на корректность данных (ошибки могут быть в самом файле) - добавить обработку ошибок, напр. продолжить считывать со след стоки, если ошибка в предыдущей
// продумать ситуации (зп не явл числом и т.п.)