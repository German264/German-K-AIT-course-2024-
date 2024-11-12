package homework_44.book_library;

import homework_43.yacht.Yacht;
import homework_44.book_library.dao.LibraryImpl;
import homework_44.book_library.model.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryAppl {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", "Orwell", 1_111_111_111_110L, 2010));
        books.add(new Book("T1", "A1", 1_111_111_111_111L, 2011));
        books.add(new Book("T2", "A2", 1_111_111_111_112L, 2009));
        books.add(new Book("T3", "A3", 1_111_111_111_113L, 2005));
        books.add(new Book("1984", "Orwell", 1_111_111_111_114L, 2011));
        books.add(new Book("T1", "A1", 1_111_111_111_115L, 2013));
        books.add(new Book("T2", "A2", 1_111_111_111_116L, 2005));
        books.add(new Book("T3", "A3", 1_111_111_111_117L, 2006));

        // Задачи:
        // 1. Отобразить все книги
        System.out.println("----------------------Все книги:-------------------------");
        books.forEach(System.out::println);

        // 2. Отобразить все книги одного автора
        String autor = "Orwell";
        System.out.println("\n-------------------Книги втора: " + autor + ":------------------");
        books.stream()
                .filter(yacht -> yacht.getAuthor().equalsIgnoreCase(autor))
                .forEach(System.out::println);

        // 4. Отобразить книги, чей год выпуска находится в заданном диапазоне
        int yearStart = 2005;
        int yearEnd = 2010;
        System.out.println("\n------------Книги, выпущенные с " + yearStart + " по " + yearEnd + ":------------");
        books.stream()
                .filter(yacht -> yacht.getYearOfPublishing() >= yearStart && yacht.getYearOfPublishing() <= yearEnd)
                .forEach(System.out::println);


        // 7. Сколько книг с какими названиями есть в библиотеке
        System.out.println("\n----------------Книги по названиям:----------------------");
        Map<String, List<Book>> booksByTitle = books.stream()
                .collect(Collectors.groupingBy(Book::getTitle));

        booksByTitle.forEach((title, titleBook) -> {
            System.out.println(title + ":");
            titleBook.forEach(System.out::println);
        });
    }
}
