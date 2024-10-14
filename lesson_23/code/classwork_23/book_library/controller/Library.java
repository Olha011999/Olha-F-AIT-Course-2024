package classwork_23.book_library.controller;

import classwork_23.book_library.model.Book;

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
    //boolean addBook

    //void printBooks

    public Book findBook(long isbn){
        Book founfBook = null;

        return founfBook;
    }


    // Book readfindBook(long isbn)


    //Book removeBook(long isbn)

    //boolean updateBook()




    public  int size(){
        return size;
    }



}
