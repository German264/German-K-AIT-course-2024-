package homework_38.germany;

//Задача 2.
//В классе GermanyAppl cоздать LinkedList, содержащий города - столицы земель Германии.
//Опробовать на нем методы, которые доступны для класса LinkedList.
//Добавить вольный город Гамбург в начало, в середину списка, в конец списка.
//Отсортировать список по алфавиту и в обратном порядке.

import java.util.Collections;
import java.util.LinkedList;

public class GermanyAppl {
    public static void main(String[] args) {

        // Создание списка городов - столиц земель Германии
        LinkedList<String> capitals = new LinkedList<>();

        // Добавление столиц
        capitals.add("Мюнхен");
        capitals.add("Берлин");
        capitals.add("Гамбург");
        capitals.add("Штутгарт");
        capitals.add("Дрезден");
        capitals.add("Кёльн");
        capitals.add("Магдебург");
        capitals.add("Ганновер");

        System.out.println("Исходный список столиц:");
        for (String cap : capitals) {
            System.out.println(cap);
        }
        System.out.println("----------------------------------");

        // Перемещение вольного города Гамбурга в начало, с удалением из исходной позиции
        if (capitals.remove("Гамбург")) {
            capitals.addFirst("Гамбург");
        }
        System.out.println("После перемещения Гамбурга в начало:");
        for (String cap : capitals) {
            System.out.println(cap);
        }
        System.out.println("----------------------------------");

        // Перемещение вольного города Гамбурга в середину списка, с удалением из исходной позиции
        if (capitals.remove("Гамбург")) {
            int middleIndex = capitals.size() / 2;
            capitals.add(middleIndex, "Гамбург");
        }
        System.out.println("После перемещения Гамбурга в середину:");
        for (String cap : capitals) {
            System.out.println(cap);
        }
        System.out.println("----------------------------------");

        // Перемещение вольного города Гамбурга в конец, с удалением из исходной позиции
        if (capitals.remove("Гамбург")) {
            capitals.addLast("Гамбург");
        }
        System.out.println("После перемещения Гамбурга в конец:");
        for (String cap : capitals) {
            System.out.println(cap);
        }
        System.out.println("----------------------------------");

        // Сортировка списка по алфавиту
        Collections.sort(capitals);
        System.out.println("Список столиц после сортировки по алфавиту:");
        for (String cap : capitals) {
            System.out.println(cap);
        }
        System.out.println("----------------------------------");

        // Сортировка списка в обратном порядке
        Collections.sort(capitals, Collections.reverseOrder());
        System.out.println("Список столиц после сортировки в обратном порядке:");
        for (String cap : capitals) {
            System.out.println(cap);
        }
    }
}

