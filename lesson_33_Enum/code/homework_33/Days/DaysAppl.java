package homework_33.Days;

//Задача 1. Задать ENUM weekDay - дни недели. Опробовать на нем методы:
// .values() .toString .ordinal() .valueOf()
// Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели. Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг
// Проверьте работу метода с помощью теста.

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaysAppl {
    public static void main(String[] args) {

        Days[] days = Days.values();

        System.out.println("------------------ values of Enum ---------------------");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
        System.out.println();
        for (int i = 0; i < days.length; i++) {
            System.out.println(+ days[i].getNumber() + " : " + days[i].getName() + " : " + days[i].getType());
        }
        System.out.println("---------for each--------");
        for (Days day : days) {
            System.out.println(day.getNumber() + " : " + day.getName() + " : " + day.getType());
        }
        System.out.println();
        System.out.println("-------------------- toString() ------------------------");
        String str = Days.SUNDAY.toString();
        System.out.println(str);

        System.out.println();
        System.out.println("--------------------- ordinal() -------------------------");
        int num = Days.FRIDAY.ordinal();
        System.out.println(num);
        num = Days.TUESDAY.ordinal();
        System.out.println(num);

        System.out.println("--------------------- valueOf() -------------------------");
        Days d = Days.valueOf("SATURDAY");
        System.out.println(d);

        System.out.println();
        System.out.println("---------------------------------------------------------");
        Days d1 = Days.MONDAY;
        System.out.println("Start day: " + d1);
        int k = 10;
        d1 = d1.plusDays(k);
        System.out.println("After " + k + " days: " + d1);
    }

    @Test
    public void plusDaysTest(){
        Days d = Days.MONDAY;
        assertEquals(Days.THURSDAY, d.plusDays(10));
    }
}
