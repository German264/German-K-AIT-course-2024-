package homework_39.tudents;

import java.util.HashSet;
import java.util.Set;

public class StudentCourses {
    public static void main(String[] args) {

        // Студенты на курсе "Математика"
        Set<String> mathStudents = new HashSet<>();
        mathStudents.add("Иванов");
        mathStudents.add("Петров");
        mathStudents.add("Сидоров");
        mathStudents.add("Кузнецов");

        // Студенты на курсе "Информатика"
        Set<String> csStudents = new HashSet<>();
        csStudents.add("Сидоров");
        csStudents.add("Петров");
        csStudents.add("Ковалев");
        csStudents.add("Алексеев");

        // Список студентов, записанных на оба курса (пересечение)
        Set<String> bothCourses = new HashSet<>(mathStudents);
        bothCourses.retainAll(csStudents); // Пересечение

        // Список студентов, записанных только на один курс (разность)
        Set<String> onlyMath = new HashSet<>(mathStudents);
        onlyMath.removeAll(csStudents); // Разность (только математика)

        Set<String> onlyCS = new HashSet<>(csStudents);
        onlyCS.removeAll(mathStudents); // Разность (только информатика)

        // Объединение студентов только на один курс
        Set<String> onlyOneCourse = new HashSet<>(onlyMath);
        onlyOneCourse.addAll(onlyCS); // Объединение

        // Вывод результатов
        System.out.println("Студенты, записанные на оба курса: " + bothCourses);
        System.out.println("Студенты, записанные только на один курс: " + onlyOneCourse);
    }
}
