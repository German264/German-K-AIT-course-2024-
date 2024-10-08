package Homework_18.pet;

import Homework_18.pet.model.Cat;
import Homework_18.pet.model.Dog;

//Задача 1. В классе Pet имеются поля:
//id
//вид
//возраст
//кличка
//Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями:
//порода
//рост
//вес
//Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog. Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.
public class HouseAppl {
    public static void main(String[] args) {

        // Создаем животных
        Dog dog1 = new Dog(01, "собака", 3, "Барбос", "дворняга", 70, 1.8);
        Dog dog2 = new Dog(02, "собака", 7, "Бобик", "мастиф", 110, 16);

        Cat cat1 = new Cat(03, "кошка", 2, "Шельма", "корниш", 30, 0.3);
        Cat cat2 = new Cat(04, "кот", 2, "Бегемот", "дворянин", 30, 0.3);

        // Информация о животных
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());

        // Симуляция прожитого дня
        System.out.println("\nПрожитый день животных:");
        System.out.println();

        dog1.makeSound();
        dog1.sleep();
        dog1.eat();
        dog1.play();
        dog1.walk();
        System.out.println();

        dog2.makeSound();
        dog2.sleep();
        dog2.eat();
        dog2.play();
        dog2.walk();
        System.out.println();

        cat1.makeSound();
        cat1.sleep();
        cat1.eat();
        cat1.play();
        cat1.walk();
        System.out.println();

        cat2.makeSound();
        cat2.sleep();
        cat2.eat();
        cat2.play();
        cat2.walk();
        System.out.println();
    }
}
