package Hausaufgaben_16.Pet.model;

public class Pet {

    // Заполняем поля

    private int id;
    private String species;
    private int age;
    private String nickname;

    //constructor

    public Pet(int id, String type, int age, String nickname) {
        this.id = id;
        this.species = type;
        this.age = age;
        this.nickname = nickname;
    }

    // Геттеры и сеттеры для всех полей

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return species;
    }

    public void setType(String type) {
        this.species = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // Метод toString для отображения информации о животных

    public String toString(){
        return "Животное: {id = " + id + ", species = '" + species + "', age = " + age + ", nickname = '" + nickname + "'}";
    }

    // Дополнительные методы

    public void sleep() {
        System.out.println(nickname + " спит.");
    }

    public void eat() {
        System.out.println(nickname + " ест.");
    }

    public void makeSound() {
        System.out.println(nickname + " издает звуки.");
    }

    public void play() {
        System.out.println(nickname + " играет.");
    }

    public void walk() {
        System.out.println(nickname + " гуляет.");
    }

}
