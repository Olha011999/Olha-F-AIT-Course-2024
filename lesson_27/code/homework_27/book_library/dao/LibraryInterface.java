package homework_27.book_library.dao;

import homework_27.book_library.model.Book;

public interface LibraryInterface {

    long checkIsbn (long isbn);
    boolean addBook (Book book);
    void printBooks();
    Book findBook(long isbn);
    Book removeBook(long isbn);
    boolean updateBook();
    public int getSize();
}
