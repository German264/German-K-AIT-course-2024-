package homework_44.book_library.dao;

import homework_44.book_library.model.Book;

public interface Library {

    // CRUD methods
    public boolean addBook(Book book);

    // void printBooks()
    public void printBooks();

    // find by author
    public Book findByAuthor(String author);

    public Book findBook(long isbn);

    public Book removeBook(long isbn);

    // boolean updateBook()
    public int size();
}
