package homework_32_marafon.dokument_arhive.dao;

import homework_32_marafon.dokument_arhive.model.Dokument;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive {

    private Dokument[] dokuments;
    private int size; // текущее кол-во документов

    public ArchiveImpl(int capacity) {
        this.dokuments = new Dokument[capacity];
        this.size = 0;
    }

    // CRUD methods

    @Override
    public boolean addDokument(Dokument dokument) {
        // bad cases
        if (dokument == null) {
            return false;
        }
        if (size == dokuments.length) {
            return false;
        }
        if (findDokumentById(dokument.getId()) != null) {
            return false;
        }
        // good case
        dokuments[size] = dokument; // put in array
        size++;
        return true;
    }

    @Override
    public void printDokument() {
        for (int i = 0; i < size; i++) {
            System.out.println(dokuments[i]);
        }
    }

    @Override
    public Dokument removeDokument(long id) {
        for (int i = 0; i < size; i++) {
            if (dokuments[i].getId() == id) {
                Dokument victim = dokuments[i];
                dokuments[i] = dokuments[size - 1];// last dokument put instead victim
                dokuments[size - 1] = null;// затираем последний элемент массива
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Dokument updateDokument(Dokument dokument) {
        // отыскать нужного в массиве и обновить ему поля, забирая их из employee
        for (int i = 0; i < size; i++) {
            if (dokuments[i].getId() == dokument.getId()) {
                dokuments[i] = dokument;
                return dokuments[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Dokument[] findDokumentByAuthor(String author) {
        return findDokumentByPredicate(d -> d.getAuthor().equals(author));
    }

    @Override
    public Dokument[] findDokumentById(long id) {
        return findDokumentByPredicate(d -> d.getId() == id);
    }

    private Dokument[] findDokumentByPredicate(Predicate<Dokument> predicate) {
        Dokument[] res = new Dokument[size];
        int j = 0; // это индексы массива результатов
        for (int i = 0; i < size; i++) {
            if(predicate.test(dokuments[i])){
                res[j++] = dokuments[i];
            }
        }
        return Arrays.copyOf(res, j); // обрезаем хвост из null
    }
}

