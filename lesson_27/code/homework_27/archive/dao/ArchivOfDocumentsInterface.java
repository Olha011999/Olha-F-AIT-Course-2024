package homework_27.archive.dao;

import homework_27.archive.model.Document;

public interface ArchivOfDocumentsInterface {

    boolean addDocument(Document document);
    void printDocuments();
    Document findDocument(long numberOfDocument);
    Document removeDocument(long numberOfDocument);
    int size();




}
