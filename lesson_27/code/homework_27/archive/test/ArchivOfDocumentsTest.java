package homework_27.archive.test;

import homework_27.archive.dao.ArchivOfDocuments;
import homework_27.archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchivOfDocumentsTest {

    private ArchivOfDocuments archive;
    private Document document;

    @BeforeEach
    void setUp() {
        Document[] docs = new Document[10];
        archive = new ArchivOfDocuments(docs, 0);
        document = new Document(docs, 0, "Sample Title", "Sample Author", 1234567890L, 2023, 100);
    }

    @Test
    void addDocument() {
        assertTrue(archive.addDocument(document));
    }

    @Test
    void printDocuments() {
        archive.addDocument(document);
        archive.printDocuments();
    }

    @Test
    void findDocument() {
        archive.addDocument(document);
        assertNotNull(archive.findDocument(1234567890L));
    }

    @Test
    void removeDocument() {
        archive.addDocument(document);
        assertNotNull(archive.removeDocument(1234567890L));
    }

    @Test
    void size() {
        archive.addDocument(document);
        assertEquals(1, archive.size());
    }

}