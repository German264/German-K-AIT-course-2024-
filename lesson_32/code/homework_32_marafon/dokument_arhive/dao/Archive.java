package homework_32_marafon.dokument_arhive.dao;

import homework_32_marafon.dokument_arhive.model.Dokument;

public interface Archive {

    // CRUD methods

    public boolean addDokument(Dokument dokument);

    void printDokument();

    int size();

    // find by author
    public Dokument[] findDokumentByAuthor(String author);

    // find by id
    public Dokument[] findDokumentById(long id);

    public Dokument removeDokument(long id);

    Dokument updateDokument(Dokument dokument);
}
