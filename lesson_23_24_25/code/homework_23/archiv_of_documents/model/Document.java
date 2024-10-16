package homework_23.archiv_of_documents.model;

import java.util.Objects;

public class Document {

    public static final int NUMBEROFDOCUMENT_LENGTH = 10;

    //field
    private String title;
    private String author;
    private long numberOfDocument;
    private int date;
    private int pages;

    //constructor

    public Document(String title, String author, long numberOfDocument, int date, int pages) {
        this.title = title;
        this.author = author;
        this.numberOfDocument = checkNumberOfDocument(numberOfDocument);
        this.date = date;
        this.pages = pages;
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

    public long getNumberOfDocument() {
        return numberOfDocument;
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
        return numberOfDocument == document.numberOfDocument && date == document.date && pages == document.pages && Objects.equals(title, document.title) && Objects.equals(author, document.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, numberOfDocument, date, pages);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", numberOfDocument=").append(numberOfDocument);
        sb.append(", date=").append(date);
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }

    public long checkNumberOfDocument(long numberOfDocument){
        if (countDigit(numberOfDocument)){
            return numberOfDocument;
        }
        return -1;
    }

    public boolean countDigit(long numberOfDocument){
        int count = 0;
        long temp = numberOfDocument;
        while (temp != 0){
            temp/=10;
            count++;
        }
        return count == NUMBEROFDOCUMENT_LENGTH;
    }

    //TODO предусматриваем защиту 10 чисел
    public void setNumberOfDocumentLength(long numberOfDocument){
        if (checkNumberOfDocument(numberOfDocument) > 0){
            this.numberOfDocument = numberOfDocument;
        }else {
            System.out.println("Number of document is not correct!");
        }
    }
}
