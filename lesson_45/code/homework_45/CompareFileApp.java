package homework_45;

//Задание 1.
//В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main.
//Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты.
//Результат должен быть выведен на консоль в виде сообщения.

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFileApp {
    public static void main(String[] args) {

// Проверяем, что передано два имени файла
        if (args.length < 2) {
            System.out.println("Укажите два имени файла для сравнения.");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            // Сравнение длин файлов
            if (fis1.available() != fis2.available()) {
                System.out.println("Файлы имеют разную длину и не являются идентичными.");
                return;
            }

            // Побайтовое сравнение содержимого файлов
            int byteFile1, byteFile2;
            boolean areFilesIdentical = true;
            while ((byteFile1 = fis1.read()) != -1 && (byteFile2 = fis2.read()) != -1) {
                if (byteFile1 != byteFile2) {
                    areFilesIdentical = false;
                    break; // Прерываем цикл при первом несовпадении
                }
            }

            if (areFilesIdentical) {
                System.out.println("Файлы идентичны.");
            } else {
                System.out.println("Файлы различаются.");
            }

        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файлов: " + e.getMessage());
        }
    }
}
