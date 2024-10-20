package homework_27.archive.dao;

import homework_27.archive.model.Document;

public class ArchivOfDocuments implements ArchivOfDocumentsInterface {

    private Document[] documents;
    private int size;

    public ArchivOfDocuments(Document[] documents, int size) {
        this.documents = documents;
        this.size = size;
    }
    @Override
    public boolean addDocument(Document document) {
        if (document == null || size == documents.length || findDocument(document.getNumberOfDocument()) != null) {
            return false;
        }
        documents[size++] = document;
        return true;

    }

    @Override
    public void printDocuments() {
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }

    }

    @Override
    public Document findDocument(long numberOfDocument) {
        for (int i = 0; i < size; i++) {
            if (documents[i].getNumberOfDocument() == numberOfDocument) {
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document removeDocument(long numberOfDocument) {
        for (int i = 0; i < size; i++) {
            if (documents[i].getNumberOfDocument() == numberOfDocument) {
                Document removed = documents[i];
                documents[i] = documents[--size];
                documents[size] = null;
                return removed;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

}
