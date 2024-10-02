package Hausaufgaben_16.Student.model;

public class Student {

    // Заполняем поля

    private int id;
    private String name;
    private String surname;
    private int yearOfBirth;
    private String specialization;

    //constructor

    public Student(int id, String name, String surname, int yearOfBirth, String specialization) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
    }

    // Геттеры и сеттеры для всех полей

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Метод toString для отображения информации о студентах

    public String toString(){
        return "Студент: {id = " + id + ", name = '" + name + "', surname = '" + surname + "', yearOfBirth = '" + yearOfBirth + "', specialization = '" + specialization + "'}";
    }

    // Дополнительные методы

    public void study() {
        System.out.println(surname + " учится.");
    }
    public void exam() {
        System.out.println(surname + " сдал экзамен.");
    }
    public void celebrate() {
        System.out.println(surname + " отпраздновал.");
    }
    public void vacation() {
        System.out.println(surname + " уехал отдыхать.");
    }
    public void studAgain() {
        System.out.println(surname + " дальше учится.");
    }

}
