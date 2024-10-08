package Homework_18.pet.model;

public class Pet {

    // Заполняем поля
    private int id;
    private String species;
    private int age;
    private String nickname;

    // constructor
    public Pet(int id, String species, int age, String nickname) {
        this.id = id;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
