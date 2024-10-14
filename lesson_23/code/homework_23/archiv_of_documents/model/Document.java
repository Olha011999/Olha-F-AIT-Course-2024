package homework_23.archiv_of_documents.model;

import java.util.Objects;

public class Document {

    public static final int NOMBEROFDOCUMENT_LENGTH = 10;

    //field
    private  String title;
    private String author;
    private long nomberOfDocument;
    private int date;
    private int pages;


    //constructor
    public Document(String title, String author, long nomberOfDocument, int date, int pages) {
        this.title = title;
        this.author = author;
        this.nomberOfDocument = checkNomberOgDocument(nomberOfDocument);
        this.date = date;
        this.pages = pages;
    }

    public long checkNomberOgDocument(long nomberOfDocument){
        if (countDigit(nomberOfDocument) ){
            return nomberOfDocument;
        }
        return -1;
    }

    public boolean countDigit (long nomberOfDocument){
         int count = 0;
         while ((this.nomberOfDocument != 0)){
             count ++;
         }
         return count == NOMBEROFDOCUMENT_LENGTH;
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

    public long getNomberOfDocument() {
        return nomberOfDocument;
    }

    public void setNomberOfDocument(long nomberOfDocument) {
        this.nomberOfDocument = nomberOfDocument;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document document)) return false;
        return nomberOfDocument == document.nomberOfDocument && date == document.date && pages == document.pages && Objects.equals(title, document.title) && Objects.equals(author, document.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, nomberOfDocument, date, pages);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", nomberOfDocument=").append(nomberOfDocument);
        sb.append(", date=").append(date);
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}
