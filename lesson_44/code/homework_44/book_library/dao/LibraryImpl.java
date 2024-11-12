package homework_44.book_library.dao;

//Реализовать методы:
//        - печать списка всех книг в библиотеке; +
//        - получение кол-ва книг в библиотеке; +
//        - поиска книги по ISBN; +
//        - добавление книги в библиотеку с учетом требований:
//           - не добавлять null
//           - не добавлять дубликат
//           - не добавлять больше, чем может вместить в себя библиотека.
//        - удаление книги из библиотеки.

import homework_44.book_library.model.Book;

public class LibraryImpl implements Library {

    private Book[] books;
    private int size; // текущее кол-во книг

    public LibraryImpl(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    @Override
    public boolean addBook(Book book) {
    // negative cases
        if (book == null) {
            return false;
        }
        if (size == books.length) {
            return false;
        }
        if (!(findBook(book.getIsbn()) == null)) {
            return false;
        }
        // positive case
        books[size] = book; // ставим книгу в конец массива, первое свободное место
        size++;
        return true;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    @Override
    public Book findByAuthor(String author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                Book victim = books[i];
                books[i] = books[size - 1];// last book put instead victim
                books[size - 1] = null;// затираем последний элемент массива
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}


