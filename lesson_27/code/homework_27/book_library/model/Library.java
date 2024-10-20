package homework_27.book_library.model;

import java.util.Arrays;
import java.util.Objects;

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

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library library)) return false;
        return size == library.size && Objects.deepEquals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(books), size);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Library{");
        sb.append("books=").append(Arrays.toString(books));
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    //    // CRUD methods
//
//    public boolean addBook (Book book){
//        //negative cases
//        if (book == null){
//            return false;
//        }
//        if (size == books.length){
//            return false;
//        }
//        if ( ! (findBook(book.getIsbn())== null)) {
//            return false;
//        }
//        //positive case
//        books[size] = book;// ставим книгу в конце массива , первое свободное место
//        size++;
//        return true;
//    }
//
//    //void printBooks
//    public  void printBooks(){
//        for (int i = 0; i < size; i++) {
//            System.out.println(books[i]);
//        }
//    }
//
//    public Book findBook(long isbn){
//        for (int i = 0; i < size; i++) {
//            if (books[i].getIsbn() == isbn){
//                return books[i];
//            }
//        }
//        return null;
//    }
//
//
//    public Book removeBook(long isbn){
//        for (int i = 0; i < size; i++) {
//            if (books[i].getIsbn() == isbn){
//                Book victim = books[i];
//                books[i] = books[size - 1];
//                books[size - 1] = null; //жертва
//                // last books put instead victim , копию последней книжки ложем на пустое место,
//                // последний элемент масиива затираем
//                size--;
//                return victim;
//            }
//        }
//        return null;
//    }
//
//    //boolean updateBook()
//    public  int size(){
//        return size;
//    }

}
