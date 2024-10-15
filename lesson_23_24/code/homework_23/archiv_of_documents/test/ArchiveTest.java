package homework_23.archiv_of_documents.test;

import homework_23.archiv_of_documents.Archive;
import homework_23.archiv_of_documents.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ArchiveTest {


    Archive archive;

    Document[] documents;
    int size = 0;

    @BeforeEach
    void setUp() {

        archive = new Archive(4);
        documents = new Document[4];

        documents[0] = new Document("A0", "AT0", 1234567890L, 2020, 2);
        documents[1] = new Document("A1", "AT1", 1234567891L, 2021, 3);
        documents[2] = new Document("A2", "AT2", 1234567892L, 2022, 4);

        //TODO
        for (int i = 0; i < documents.length; i++) {
            archive.addDocument(documents[i]);
        }
    }

    @Test
    void addDocumentTest(){
        //не добавляем null
        assertFalse(archive.addDocument(null));
        //не добавляем дубликат
        assertFalse(archive.addDocument(documents[1]));
        //не добавлять больше, чем можeт вместить в себя архив
        Document newDocument = new Document("A3", "AT3", 1234567893L, 2023, 5);
        assertTrue(archive.addDocument(newDocument));
        assertEquals(4, archive.size());

        //добавляем еще один документ свех массива
        Document newDocument2 = new Document("A4", "AT4", 1234567894L, 2024, 9);
        assertFalse(archive.addDocument(newDocument2));
    }

    @Test
    void findDocumentTest(){
        Document foundDocument = archive.findDocument(1234567890L);
        assertEquals(documents[0], archive.findDocument(1234567890L));// find existed document, expected< actual

        assertNull(archive.findDocument(1_111_111_111_118L));//find absent document
    }

    @Test
    void removeDocumentTest(){
        //remove existed document, удаляем существующий элемент
        assertEquals(documents[0], archive.removeDocument(1234567890L));
        assertEquals(2, archive.size());
        //remove absent document
        assertNull(archive.removeDocument(1234567899L));
    }

    @Test
    void sizeTest(){
        assertEquals(3, archive.size());
    }

    @Test
    void printDocumentTest(){
        archive.printDocuments();
    }
}