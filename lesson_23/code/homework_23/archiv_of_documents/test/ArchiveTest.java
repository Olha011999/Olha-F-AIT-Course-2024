package homework_23.archiv_of_documents.test;

import homework_23.archiv_of_documents.Archive;
import homework_23.archiv_of_documents.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {

    Archive archive;

    Document[] documents;
    int size = 0;


    @BeforeEach
    void setUp() {

        archive = new Archive(4);
        documents[0] = new Document("A0", "AT0", 1_111_111_111_110L,2020, 2);
        documents[1] = new Document("A1", "AT1", 1_111_111_111_111L,2021, 3);
        documents[2] = new Document("A2", "AT2", 1_111_111_111_112L,2022, 4);
        //TODO
        //положить объекты в массив, который "внутри" объекта library


    }

    @Test
    void findDocumentTest(){
        Document foundDocument = archive.findDocument(1_111_111_111_110L);

        assertEquals(documents[0], archive.findDocument(1_111_111_111_110L));//find existed document//expected, actual;
        assertNull(archive.findDocument(1_111_111_111_119L));// find absend document

    }

}