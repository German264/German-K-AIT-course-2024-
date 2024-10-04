package Hausaufgaben_17.Book;

import Hausaufgaben_17.Book.model.Book;

public class BookAppl {
    public static void main(String[] args) {

        Book Book01 = new Book(1234, "Капитал", "К.Маркс", 1867, "Спорная философия и экономика");
        Book Book02 = new Book(5678, "Что делать?", "В.И.Ленин", 1902, "Подрывная литература");
        Book Book03 = new Book(9101, "Об основах ленинизма", "И.В.Сталин", 1924, "Утопия");

        //C полями ISBN, title, author, yearOfPublishing, genre
        System.out.println("Информация о книгах:");
        Book01.display();
        Book02.display();
        Book03.display();
        System.out.println();

        //Без поля ISBN
        Book Book011 = new Book("Капитал", "К.Маркс", 1867, "Спорная философия и экономика");
        Book Book021 = new Book("Что делать?", "В.И.Ленин", 1902, "Подрывная литература");
        Book Book031 = new Book("Об основах ленинизма", "И.В.Сталин", 1924, "Утопия");
        System.out.println("Без поля ISBN:");
        Book011.display();
        Book021.display();
        Book031.display();
        System.out.println();

        //Только поля title, author и genre
        Book Book012 = new Book("Капитал", "К.Маркс", "Спорная философия и экономика");
        Book Book022 = new Book("Что делать?", "В.И.Ленин", "Подрывная литература");
        Book Book032 = new Book("Об основах ленинизма", "И.В.Сталин", "Утопия");
        System.out.println("Только поля title, author и genre:");
        Book012.display();
        Book022.display();
        Book032.display();
    }
}
