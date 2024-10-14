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

    // CRUD methods
    //boolean addDocument

    //void printDocument

    public Document findDocument(long nomberOfDocument){
        Document founfDocument = null;

        return founfDocument;
    }


    // Document readfindDocument(long nomberOfDocument)


    //Document removeDocument(long nomberOfDocument)

    //boolean updateDocument()




    public  int size(){
        return size;
    }

}
