package homework_32_marafon.dokument_arhive.test;

import homework_32_marafon.dokument_arhive.dao.ArchiveImpl;
import homework_32_marafon.dokument_arhive.model.Dokument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {

    ArchiveImpl archive;
    Dokument[] dokuments;
    int size = 0;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(5);
        dokuments = new Dokument[5];

        dokuments[0] = new Dokument("T0", "A0", 1_111_111_110L, 2010);
        dokuments[1] = new Dokument("T1", "A1", 1_111_111_111L, 2011);
        dokuments[2] = new Dokument("T2", "A1", 1_111_111_112L, 2012);
        dokuments[3] = new Dokument("T3", "A3", 1_111_111_113L, 2013);

        // TODO
        //положить объекты в массив, который "внутри" объекта archive
        for (int i = 0; i < 4; i++) {
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
        Dokument newDokument = new Dokument("T4", "A4", 1_111_111_114L, 2024);
        assertTrue(archive.addDokument(newDokument));
        assertEquals(5, archive.size());
        // добавляем еще одну сверх capacity
        Dokument oneMoreDok = new Dokument("T5", "A5", 1_111_111_115L, 2024);
        assertFalse(archive.addDokument(oneMoreDok));
    }

    @Test
    void printDokumentTest(){
        System.out.println("=========================");
        archive.printDokument();
    }

    @Test
    void removeDokumentTest(){
        // remove existed dokument
        assertEquals(dokuments[0], archive.removeDokument(1_111_111_110L));
        assertEquals( 3, archive.size());
        // remove absent dokument
        assertNull(archive.removeDokument(1_111_111_119L));
    }

    @Test
    void updateDokumentTest() {
        Dokument updateDokument = new Dokument("T1", "A5", 1_111_111_111L, 2011);
        assertEquals("A5", archive.updateDokument(updateDokument).getAuthor());
        // assertEquals((55000, company.updateEmployee((SalesManager)updatedEmployee));
        archive.printDokument();
    }

    @Test
    void sizeTest(){
        assertEquals(4, archive.size());
    }

    @Test
    void findDokumentByAuthorTest () {
        Dokument[] expected = {dokuments[1], dokuments[2]};
        Dokument[] actual = archive.findDokumentByAuthor("A1");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findDokumentById () {
        Dokument[] expected = new Dokument[]{dokuments[3]};
        Dokument[] actual = archive.findDokumentById(1_111_111_113L);
        assertArrayEquals(expected, actual);
    }
}