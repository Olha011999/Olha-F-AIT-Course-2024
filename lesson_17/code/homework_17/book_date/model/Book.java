package homework_17.book_date.model;

public class Book {

    private long ISBN;
    private String title;
    private String author;
    private int yearOfPublishing;
    private  String ganre;


    //constuctor
    public Book(long ISBN, String title, String author, int yearOfPublishing, String ganre) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.ganre = ganre;
    }

    public Book(String title, String author, int yearOfPublishing, String ganre) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.ganre = ganre;
    }

    public Book(String title, String author, String ganre) {
        this.title = title;
        this.author = author;
        this.ganre = ganre;
    }


    //getters and setters
    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
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

    public String getGanre() {
        return ganre;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
    }

    public void display(){
        System.out.println("ISBN: "+ ISBN + ", title: "+ title + ", author: "+ author+ ", year of publishing: " + yearOfPublishing+ ", ganre: "+ ganre);
    }


}
