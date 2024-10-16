package classwork_23_24_25.book_library.model;
//// Создать класс Book с полями:
//// long isbn, String title, String author, int yearOfPublishing.
//// Проверить ISBN на корректное количество цифр = 13.
import java.util.Objects;

public class Book {


    public static  final  int ISBN_LENGTH = 13;

    //field
    private  String title;
    private String author;
    private long isbn;
    private int yearOfPublishing;

    //constructor
    public Book(String title, String author, long isbn, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        //this.isbn = isbn;
        this.yearOfPublishing = yearOfPublishing;
//        if (isIsbnValid) {
//            this.isbn = isbn;
//        }
        this.isbn = checkIsbn(isbn);
//        if (isbn == -1){
//            System.out.println();
//        }
    }

    private long checkIsbn (long isbn){
        //прверить длину isbn по количеству цифр в этом числе
        if (countDigit(isbn)){
            return  isbn;
        }
        return -1;// сигнал того, что  isbn неверный
    }

    private boolean countDigit(long isbn){
        //String.valueOf(isbn).length() == 13;// требуется много ресурсов
        // можно циклом for так как извествно сколько раз он должен отработать
        int count = 0;
        long temp = isbn;//переложили isbn в отдельную переменную, чтобы не испортить значение isbn
        while ((temp != 0)){
            temp = temp/10;
            count ++;
        }
        return  count == ISBN_LENGTH;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append(", yearOfPublishing=").append(yearOfPublishing);
        sb.append('}');
        return sb.toString();
    }

    public long getIsbn() {
        return isbn;
    }

//TODO пердусмотреть защиту по поводу 13 чисел в этом случае
    public void setIsbn(long isbn) {
        if (checkIsbn(isbn) > 0) {
            this.isbn = checkIsbn(isbn);
        }else {
            System.out.println("ISBN is not correct.");
        }
    }
}
