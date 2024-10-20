package homework_27.archive.model;

import java.util.Arrays;
import java.util.Objects;

public abstract class Archive {

    private Document[] documents;
    private int size;

    //constructor
    public Archive(Document[] documents, int size) {
        this.documents = documents;
        this.size = size;
    }

    public Document[] getDocuments() {
        return documents;
    }

    public void setDocuments(Document[] documents) {
        this.documents = documents;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Archive archive)) return false;
        return size == archive.size && Objects.deepEquals(documents, archive.documents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(documents), size);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Archive{");
        sb.append("documents=").append(Arrays.toString(documents));
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

//    //CRUD methods
//    public boolean addDocument(Document document){
//        //negative cases
//        if (document == null){
//            return false;
//        }
//        if (size == documents.length){
//            return false;
//        }
//        if (!((findDocument(document.getNumberOfDocument())) == null)){
//            return false;
//        }
//        //positive case
//        documents[size] = document;
//        size++;
//        return true;
//    }
//
//    public void printDocuments(){
//        for (int i = 0; i < size; i++) {
//            System.out.println(documents[i]);
//        }
//    }
//
//    public Document findDocument(long numberOfDocument){
//        for (int i = 0; i < size; i++) {
//            if (documents[i].getNumberOfDocument() == numberOfDocument){
//                return documents[i];
//            }
//        }
//        return null;
//    }
//
//    public Document removeDocument(long numberOfDocument){
//        for (int i = 0; i < size; i++) {
//            if (documents[i].getNumberOfDocument() == numberOfDocument){
//                Document victim = documents[i];
//                documents[i] = documents[size - 1];
//                documents[size - 1] = null;
//                size--;
//                return victim;
//            }
//        }
//        return null;
//    }
//
//    public int size(){
//        return size;
//    }
}
