package homework_23.archiv_of_documents;

import homework_23.archiv_of_documents.model.Document;

public class Archive {

    private Document[] documents;
    private int size;

    //constructor

    public Archive(int capacity) {
        this.documents = new Document[capacity];
        this.size = 0;
    }

    //CRUD methods
    public boolean addDocument(Document document){
        //negative cases
        if (document == null){
            return false;
        }
        if (size == documents.length){
            return false;
        }
        if (!((findDocument(document.getNumberOfDocument())) == null)){
            return false;
        }
        //positive case
        documents[size] = document;
        size++;
        return true;
    }

    public void printDocuments(){
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
    }

    public Document findDocument(long numberOfDocument){
        for (int i = 0; i < size; i++) {
            if (documents[i].getNumberOfDocument() == numberOfDocument){
                return documents[i];
            }
        }
        return null;
    }

    public Document removeDocument(long numberOfDocument){
        for (int i = 0; i < size; i++) {
            if (documents[i].getNumberOfDocument() == numberOfDocument){
                Document victim = documents[i];
                documents[i] = documents[size - 1];
                documents[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    public int size(){
        return size;
    }
}
