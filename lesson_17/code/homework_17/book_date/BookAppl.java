package homework_17.book_date;

import homework_17.book_date.model.Book;

public class BookAppl {

    public static void main(String[] args) {
        Book book001= new Book(001, "Harry Potter", "J. Rowling", 1997, "fantasy");
        book001.display();

        Book book002 = new Book("Martin Iden", "Jeck London" , 1909,"drama");
        book002.display();

        Book book003 = new Book("1984", "George Orwell", "dystopian");
        book003.display();

    }
}
