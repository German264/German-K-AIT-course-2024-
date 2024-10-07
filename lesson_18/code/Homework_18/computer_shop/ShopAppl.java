package Homework_18.computer_shop;

import Homework_18.computer_shop.model.Computer;
import Homework_18.computer_shop.model.Laptop;
import Homework_18.computer_shop.model.Smartphone;

//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?
public class ShopAppl {
    public static void main(String[] args) {

        Computer computer = new Computer("i7", 8, 256, "Aser", 1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("M2", 8, 256, "Apple", 2200, 14, 1.5, 10, "biue");
        System.out.println(laptop);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        Smartphone smartphone = new Smartphone("Qualcomm Snapdragon 8 Gen 3", 8, 256, "Nokia", 500, 6.2, 0.12, 24, "black", 3506931968546947684L);
        System.out.println(smartphone);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        Computer[] computers = new Computer[5];
        computers[0] = new Computer("i7", 8, 256, "Aser", 1200);
        computers[1] = new Computer("i5", 16, 256, "HP", 1500);
        computers[2] = new Computer("AMD", 8, 256, "NoName", 2000);
        computers[3] = new Laptop("AMD", 8, 256, "MacBook", 2000, 14, 1.5, 10, "white");
        computers[4] = new Laptop("AMD", 8, 512, "MacBook Air", 2500, 14.2, 1.8, 12, "blau");

        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++){
            totalSsd += computers[i].getSsd();
        }
        System.out.println("Total ssd: " + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++){
            totalPrice += computers[i].getPrice();
        }
        System.out.println("Total price: " + totalPrice);

        for (int i = 0; i < computers.length; i++){
            System.out.println(computers[i]);
        }

        for (int i = 0; i < computers.length; i++){
            System.out.println(computers[i].getBrand());
        }
    }
}
