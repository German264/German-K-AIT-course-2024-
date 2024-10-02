package Hausaufgaben_16.Student;

import Hausaufgaben_16.Student.model.Student;

public class StudentApp {
    public static void main(String[] args) {

        // Создаем студентов

        Student student01 = new Student(01, "Имя1", "Фамилия1", 2001, "Медицина");
        Student student02 = new Student(02, "Имя2", "Фамилия2", 2004, "Математика");
        Student student03 = new Student(03, "Имя3", "Фамилия3", 2003, "Философия");

        // Информация о студентах

        System.out.println(student01.toString());
        System.out.println(student02.toString());
        System.out.println(student03.toString());

        // Жизнь студентов

        System.out.println("\nЖизнь студентов:");
        System.out.println();

        student01.study();
        student01.exam();
        student01.celebrate();
        student01.vacation();
        student01.studAgain();
        System.out.println();

        student02.study();
        student02.exam();
        student02.celebrate();
        student02.vacation();
        student02.studAgain();
        System.out.println();

        student03.study();
        student03.exam();
        student03.celebrate();
        student03.vacation();
        student03.studAgain();
    }
}
