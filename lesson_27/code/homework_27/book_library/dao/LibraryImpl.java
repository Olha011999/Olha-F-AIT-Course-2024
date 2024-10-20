package homework_27.book_library.dao;

import homework_27.book_library.model.Book;

public class LibraryImpl implements LibraryInterface {

    private Book[] books;
    private int size;

    // Конструктор для инициализации библиотеки с определенной емкостью
    public LibraryImpl(int capasity) {
        this.books = new Book[capasity];
        this.size = 0;
    }

    @Override
    public long checkIsbn(long isbn) {
        // Check if the ISBN has exactly 13 digits
        int count = 0;
        long temp = isbn;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return (count == Book.ISBN_LENGTH) ? isbn : -1;
    }

    @Override
    public boolean addBook(Book book) {
        // Validate if the book is null or library is full
        if (book == null || size == books.length || findBook(book.getIsbn()) != null) {
            return false;
        }
        books[size] = book;
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
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public boolean updateBook() {
        // Это может быть реализовано по мере необходимости, на данный момент возвращается false.
        return false;
    }
    public int getSize() {
        return size;
    }
}
