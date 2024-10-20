package homework_27.book_library.test;

import homework_27.book_library.dao.LibraryImpl;
import homework_27.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LibraryImplTest {

    private LibraryImpl library;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);// инициализация библиотеки емкостью 5
    }

    @Test
    void checkIsbnTest() {
        long validIsbn = 9780306406157L;
        long invalidIsbn = 123456789L;
        assertEquals(validIsbn, library.checkIsbn(validIsbn));
        assertEquals(-1, library.checkIsbn(invalidIsbn));
    }

    @Test
    void addBookTest() {
        Book book1 = new Book(5, "Title1", "Author1", 9780306406157L, 2020);
        assertTrue(library.addBook(book1));
        assertFalse(library.addBook(null)); // Should not add null
        assertFalse(library.addBook(book1)); // Should not add duplicate

        Book book2 = new Book(5, "Title2", "Author2", 9780306406158L, 2021);
        assertTrue(library.addBook(book2));

        // Adding books beyond the capacity
        library.addBook(new Book(5, "Title3", "Author3", 9780306406159L, 2022));
        library.addBook(new Book(5, "Title4", "Author4", 9780306406160L, 2023));
        library.addBook(new Book(5, "Title5", "Author5", 9780306406161L, 2024));

        // Library is full now, should not add more books
        assertFalse(library.addBook(new Book(5, "Title6", "Author6", 9780306406162L, 2025)));
    }

    @Test
    void printBooksTest() {
        library.addBook(new Book(5, "Title1", "Author1", 9780306406157L, 2020));
        library.addBook(new Book(5, "Title2", "Author2", 9780306406158L, 2021));
        library.printBooks();
    }

    @Test
    void findBookTest() {
        Book book1 = new Book(5, "Title1", "Author1", 9780306406157L, 2020);
        library.addBook(book1);
        assertEquals(book1, library.findBook(9780306406157L));

        // Should return null for non-existing ISBN
        assertNull(library.findBook(9780306406160L));
    }

    @Test
    void removeBookTest() {
        Book book1 = new Book(5, "Title1", "Author1", 9780306406157L, 2020);
        library.addBook(book1);
        assertEquals(book1, library.removeBook(9780306406157L));
        assertNull(library.removeBook(9780306406157L));
    }

    @Test
    void updateBookTest() {
        // Поскольку метод updateBook еще не реализован, просто проверяем, что он возвращает false
        assertFalse(library.updateBook());
    }

    @Test
    void getSizeTest() {
        // Изначально библиотека должна быть пустой, поэтому размер должен быть 0.
        assertEquals(0, library.getSize());

        // Добавьте книгу и проверьте, увеличится ли размер до 1
        Book book1 = new Book(5, "Title1", "Author1", 9780306406157L, 2020);
        library.addBook(book1);
        assertEquals(1, library.getSize());

        // Добавьте еще одну книгу и проверьте, увеличится ли размер до 2
        Book book2 = new Book(5, "Title2", "Author2", 9780306406158L, 2021);
        library.addBook(book2);
        assertEquals(2, library.getSize());

        // Уберите книгу и проверьте, уменьшился ли размер до 1
        library.removeBook(9780306406157L);
        assertEquals(1, library.getSize());
    }
}