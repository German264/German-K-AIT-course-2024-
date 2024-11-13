package homework_45.to_do_list;

import java.io.Serializable;

public class Task implements Serializable {

    private static final long serialVersionUID = 1L; // Для сериализации
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
