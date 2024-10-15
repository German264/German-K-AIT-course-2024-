package homework_24.dokument_arhive.controller;

//Реализовать методы:
//- печать списка всех документов в архиве;
//- получение кол-ва документов в архиве;
//- поиска документа по ID;
//- добавление документа в архив с учетом требований:
//  - не добавлять null
//  - не добавлять дубликат
//  - не добавлять больше, чем может вместить в себя архив.
//- удаление книги из архива.


import homework_24.dokument_arhive.model.Dokument;

public class Archive {

    // fields
    private Dokument[] dokuments;
    private int size; // текущее кол-во документов

    // constructor
    public Archive(int capacity) {
        this.dokuments = new Dokument[capacity];
        this.size = 0;
    }

    // CRUD methods
    public boolean addDokument(Dokument dokument){
        // negative cases
        if(dokument == null){
            return false;
        }
        if(size == dokuments.length){
            return false;
        }
        if (!(findDokument(dokument.getId()) == null)) {
            return false;
        }
        // positive case
        dokuments[size] = dokument; // ставим документ в конец массива, первое свободное место
        size++;
        return true;
    }

    // void printDokuments()
    public void printDokuments() {
        for (int i = 0; i < size; i++) {
            System.out.println(dokuments[i]);
        }
    }

    public Dokument findDokument(long id){
        for (int i = 0; i < size; i++) {
            if(dokuments[i].getId() == id){
                return dokuments[i];
            }
        }
        return null;
    }

    public Dokument removeDokument(long id){
        for (int i = 0; i < size; i++) {
            if(dokuments[i].getId() == id){
                Dokument victim = dokuments[i];
                dokuments[i] = dokuments[size - 1];// last dokument put instead victim
                dokuments[size - 1] = null;// затираем последний элемент массива
                size--;
                return victim;
            }
        }
        return null;
    }

    // boolean updateBook()

    public int size(){
        return size;
    }
}
