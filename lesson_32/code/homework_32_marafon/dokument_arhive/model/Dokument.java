package homework_32_marafon.dokument_arhive.model;

// Создать класс Dokument с полями:
// long id, String title, String author, int yearOfPublishing.
// Проверить ID на корректное количество цифр = 10.

import java.util.Objects;

public class Dokument {
    public static final int ID_LENGTH = 10;

    // field
    private String title;
    private String author;
    private long id;
    private int yearOfPublishing;

    // constructor

    public Dokument(String title, String author, long id, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;

        this.id = checkId(id);
    }
    private long checkId(long id) {
        // проверить длину id по кол-ву цифр в этом числе
        if (countDigit(id)){
            return id;
        }
        return  -1;// сигнал того, что id неверный
    }

    private boolean countDigit(long id) {
        int count = 0;
        long temp = id; // чтобы не "испортить" значение id
        while ((temp != 0)) {
            temp = temp / 10;
            count++;
        }
        return count == ID_LENGTH;
    }

    public long getId() {
        return id;
    }

    // TODO предусмотреть защиту по поводу 10 цифр и в этом случае
    public void setId(long id) {
        if(checkId(id) > 0){
            this.id = checkId(id);
        } else {
            System.out.println("ISBN is not correct.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dokument dokument)) return false;
        return id == dokument.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dokument{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", id=").append(id);
        sb.append(", yearOfPublishing=").append(yearOfPublishing);
        sb.append('}');
        return sb.toString();
    }
}
