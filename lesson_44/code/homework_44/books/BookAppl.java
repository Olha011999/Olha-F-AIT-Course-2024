package homework_44.books;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookAppl {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell", 1949, 15.99, "Dystopian"));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813, 12.99, "Romance"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99, "Classic"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 14.99, "Historical"));
        books.add(new Book("Moby Dick", "Herman Melville", 1851, 17.99, "Adventure"));

        // отображаем все книги
        books.forEach(System.out::println);

        // отображаем книги определенного жанра
        String genre = "Dystopian";
        books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .forEach(System.out::println);

        // отображаем книги дороже указанной цены
        double priceThreshold = 13.00;
        books.stream()
                .filter(book -> book.getPrice() > priceThreshold)
                .forEach(System.out::println);

        // сортируем книги по убыванию цены
        books.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice).reversed())
                .forEach(System.out::println);

        // определяем среднюю стоимость книг
        double averagePrice = books.stream()
                .mapToDouble(Book::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Средняя стоимость книги: " + averagePrice);

        // группируем книг по авторам
        Map<String, List<Book>> booksByAuthor = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
        booksByAuthor.forEach((author, authorBooks) -> {
            System.out.println("Автор: " + author);
            authorBooks.forEach(System.out::println);
        });
    }
}
