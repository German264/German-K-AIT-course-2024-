package homework_27.produkt;
//Задача 1. Создать класс Product, с полями:
//private double price
//private String name
//private long barCode;
//Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности.
//Создать класс MeatFood расширяющий класс Food с полем private String meatType, которое хранит тип мяса, из которого изготовлен продукт.
//Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat, которые хранят тип молока и жирность продукта соответственно.
//Во всех классах переопределить метод toString.
//Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта.
//Реализовать методы:
//печатающий все продукты из массива, и
//метод возвращающий сумму цен всех продуктов.

import homework_27.produkt.model.Food;
import homework_27.produkt.model.MeatFood;
import homework_27.produkt.model.MilkFood;
import homework_27.produkt.model.Produkt;

import java.util.Scanner;

public class MarketAppl {
    public static void main(String[] args) {

        Produkt[] produkt = new Produkt[3];

        produkt[0] = new MeatFood(15, "мясо", 123, "08.11.24", "говядина");
        produkt[1] = new MilkFood(1.1, "молоко", 456, "12.10.24", "обезжиренное", 0.5);
        produkt[2] = new Produkt(4.5, "шампунь", 789);

        // Вывод информации о продуктах
        for (int i = 0; i < produkt.length; i++) {
            System.out.println(produkt[i]);
        }

        // Подсчет общей суммы всех продуктов
        double totalPrice = 0;
        for (int i = 0; i < produkt.length; i++) {
            totalPrice += produkt[i].getPrice();
        }
        System.out.println("Сумма цен всех продуктов : " + totalPrice);

        //Задача 2. В Задаче 1 переопределить метод equals для сравнения объектов во всех классах.
        //В классе MarketAppl создать метод принимающий баркод и возвращающий продукт с данным баркодом.
        //В методе main вызвать новые методы. Результат их работы напечатать в консоль.



        // Поиск продукта по баркоду
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите баркод продукта: ");
        long barCode = scanner.nextLong();

        // Сравнение по баркоду
        Produkt foundProdukt = null;
        for (int i = 0; i < produkt.length; i++) {
            if (produkt[i].getBarCode() == barCode) {
                foundProdukt = produkt[i];
                break;  // Прерываем цикл, если продукт найден
            }
        }
        //Вывод результата поиска
        if (foundProdukt != null) {
            System.out.println("Найденный продукт: " + foundProdukt);
        } else {
            System.out.println("Продукт с баркодом " + barCode + " не найден.");
        }

        //Задача 3. (*) В классе MarketAppl создать метод печатающий в консоль все не пищевые продукты.

        // Сравнение по сроку годности
        for (int i = 0; i < produkt.length; i++) {
            if(produkt[i] instanceof Food){
                Food food = (Food) produkt[i];
                if(((Food) produkt[i]).getExpDate() == null){
                    System.out.println(produkt[i]);
                }
            }
        }
        //Вывод результата поиска
        if (foundProdukt != null) {
            System.out.println("Не пищевые продукты: " + foundProdukt);
        } else {
            System.out.println("Все продукты пищевые.");
        }
    }
}
