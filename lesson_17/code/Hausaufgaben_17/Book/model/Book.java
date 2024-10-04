package Hausaufgaben_17.Book.model;

//Задача 1. Создайте класс Book с полями:
//уникальный номер ISBN
//название title
//автор author
//год издания yearOfPublishing
//жанр genre
//В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display,
// который выводит информацию о книге. Создайте конструктор, в котором нет поля ISBN.
// Создайте конструктор, в котором есть только поля title, author и genre.

public class Book {

    private int ISBN;
    private String title;
    private  String author;
    private int yearOfPublishing;
    private String genre;

    // Конструктор с полями ISBN, title, author, yearOfPublishing, genre
    public Book(int ISBN, String title, String author, int yearOfPublishing, String genre) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    // Конструктор без поля ISBN
    public Book(String title, String author, int yearOfPublishing, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    // Конструктор только с полями title, author и genre
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Метод для вывода информации о книге
    public void display() {
        System.out.println("ISBN: " + ISBN + " ,Название: '" + title +"', Автор: " + author +", Год издания: " + yearOfPublishing + ", Жанр: " + genre);
    }
}
