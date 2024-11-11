package homework_43;

//Задание 1.
//Имеется набор оценок 20 студентов в диапазоне от 5 до 1 балла за семестр по 10 предметам. Смоделируйте этот набор данных, найдите студентов с максимальным/минимальным средним баллом.
//Используйте методы stream()

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Students {
    public static void main(String[] args) {

        int numStudents = 20;
        int numSubjects = 10;
        int[][] grades = new int[numStudents][numSubjects];

        // Заполняем массив случайными оценками
        for (int i = 0; i < numStudents; i++) {
            grades[i] = getRandomGrades(1, 6, numSubjects)
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        // Находим студента с максимальным средним баллом
        int maxAverageStudentIndex = IntStream.range(0, numStudents)
                .boxed()
                .max(Comparator.comparingDouble(i -> Arrays.stream(grades[i]).average().orElse(0)))
                .orElse(-1);

        // Находим студента с минимальным средним баллом
        int minAverageStudentIndex = IntStream.range(0, numStudents)
                .boxed()
                .min(Comparator.comparingDouble(i -> Arrays.stream(grades[i]).average().orElse(0)))
                .orElse(-1);

        // Вывод результатов
        System.out.println("Оценки студентов:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Студент " + (i + 1) + ": " + Arrays.toString(grades[i]));
        }

        System.out.println("\nСтудент с максимальным средним баллом:");
        System.out.println("Студент " + (maxAverageStudentIndex + 1) + ", Средний балл: " +
                Arrays.stream(grades[maxAverageStudentIndex]).average().orElse(0));

        System.out.println("\nСтудент с минимальным средним баллом:");
        System.out.println("Студент " + (minAverageStudentIndex + 1) + ", Средний балл: " +
                Arrays.stream(grades[minAverageStudentIndex]).average().orElse(0));
    }

    // Метод генерации случайных чисел в диапазоне
    private static Stream<Integer> getRandomGrades(int min, int max, int nNumbers) {
        return new Random()
                .ints(nNumbers, min, max)
                .boxed();
    }
}

