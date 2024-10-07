package Hausaufgaben_16.Pet;

import Hausaufgaben_16.Pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {

        // Создаем животных

        Pet myPet1 = new Pet(001, "Собака", 3, "Кабысдох");
        Pet myPet2 = new Pet(002, "Кошка", 3, "Шельма");
        Pet myPet3 = new Pet(003, "Таракан", 3, "Валера");

        // Информация о животных

        System.out.println(myPet1.toString());
        System.out.println(myPet2.toString());
        System.out.println(myPet3.toString());

        // Симуляция прожитого дня

        System.out.println("\nПрожитый день животных:");
        System.out.println();

        myPet1.sleep();
        myPet1.eat();
        myPet1.makeSound();
        myPet1.play();
        myPet1.walk();
        System.out.println();

        myPet2.sleep();
        myPet2.eat();
        myPet2.makeSound();
        myPet2.play();
        myPet2.walk();
        System.out.println();

        myPet3.sleep();
        myPet3.eat();
        myPet3.makeSound();
        myPet3.play();
        myPet3.walk();
    }
}
