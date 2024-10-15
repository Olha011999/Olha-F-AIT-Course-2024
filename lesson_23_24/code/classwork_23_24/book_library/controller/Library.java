package classwork_23_24.book_library.controller;

import classwork_23_24.book_library.model.Book;
//Реализовать методы:
//- печать списка всех книг в библиотеке;
//- получение кол-ва книг в библиотеке;
//- поиска книги по ISBN;
//- добавление книги в библиотеку с учетом требований:
//  - не добавлять null
//  - не добавлять дубликат
//  - не добавлять больше, чем может вместить в себя библиотека.
//- удаление книги из библиотеки.
public class Library {

    // fields
    private Book[] books;
    private int size;// текущее количество книг

    //constructor

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // CRUD methods

    public boolean addBook (Book book){
        //negative cases
        if (book == null){
            return false;
        }
        if (size == books.length){
            return false;
        }
        if ( ! (findBook(book.getIsbn())== null)) {
            return false;
        }
        //positive case
        books[size] = book;// ставим книгу в конце массива , первое свободное место
        size++;
        return true;
    }

    //void printBooks
    public  void printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book findBook(long isbn){
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
                return books[i];
            }
        }
        return null;
    }


    public Book removeBook(long isbn){
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
                Book victim = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null; //жертва
                // last books put instead victim , копию последней книжки ложем на пустое место,
                // последний элемент масиива затираем
                size--;
                return victim;
            }
        }
        return null;
    }

    //boolean updateBook()
    public  int size(){
        return size;
    }

}
