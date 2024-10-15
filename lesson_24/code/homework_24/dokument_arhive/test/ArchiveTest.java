package homework_24.dokument_arhive.test;

import homework_24.dokument_arhive.controller.Archive;
import homework_24.dokument_arhive.model.Dokument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {

    Archive archive;

    Dokument[] dokuments;
    int size = 0;

    @BeforeEach
    void setUp() {

        archive = new Archive(5);
        dokuments = new Dokument[5];

        dokuments[0] = new Dokument("T0", "A0", 1_111_111_110L, 2010);
        dokuments[1] = new Dokument("T1", "A1", 1_111_111_111L, 2011);
        dokuments[2] = new Dokument("T2", "A2", 1_111_111_112L, 2012);
        dokuments[3] = new Dokument("T3", "A3", 1_111_111_113L, 2013);

        // TODO
        //положить объекты в массив, который "внутри" объекта archive
        for (int i = 0; i < dokuments.length - 1; i++) { // пока только 4 документа (size = 4) "кладем" в Archive
            archive.addDokument(dokuments[i]);
        }
    }

    // method addDokument : boolean (true, false)

    @Test
    void addDokumentTest(){
        // - не добавлять null
        assertFalse(archive.addDokument(null));
        //  - не добавлять дубликат
        assertFalse(archive.addDokument(dokuments[2]));
        // добавляем еще одну новую
        Dokument newDokument = new Dokument("T4", "A4", 1_111_111_111_114L, 2024);
        assertTrue(archive.addDokument(newDokument));
        assertEquals(5, archive.size());
        // добавляем еще одну сверх capacity
        Dokument oneMoreDok = new Dokument("T5", "A5", 1_111_111_111_115L, 2024);
        assertFalse(archive.addDokument(oneMoreDok));

    }

    @Test
    void findDokumentTest(){
        Dokument foundDokument = archive.findDokument(1_111_111_110L);
        assertEquals(dokuments[0], archive.findDokument(1_111_111_110L)); // find existed dokument
        assertNull(archive.findDokument(1_111_111_119L)); // find absent dokument
    }

    @Test
    void removeDokumentTest(){
        // remove existed dokument
        assertEquals(dokuments[0], archive.removeDokument(1_111_111_110L));
        assertEquals( 3, archive.size());
        // remove absent book
        assertNull(archive.removeDokument(1_111_111_119L));
    }


    @Test
    void sizeTest(){
        assertEquals(4, archive.size());
    }

    @Test
    void printDokumentTest(){
        System.out.println("=========================");
        archive.printDokuments();
    }
}