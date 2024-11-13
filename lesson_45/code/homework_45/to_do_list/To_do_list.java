package homework_45.to_do_list;

//Задача 2. Начать реализацию приложения "Список дел".
//Использовать enum для организации меню (номер пункта, действие) приложения:
//добавить задачу
//посмотреть все задачи
//удалить задачу (по номеру)
//выйти из меню
//Реализовать метод printMenu().
//3 (*). Реализовать приложение, в котором работает опрос пользователя - "Выберите опцию из меню", принимается его выбор и сообщается, что он выбрал.

public enum To_do_list {

    ADD_TASK(1, "Добавить задачу"), VIEW_TASKS(2, "Посмотреть все задачи"), REMOVE_TASK(3, "Удалить задачу (по номеру)"), EXIT(4, "Выйти из меню");

    // fields
    private int menuItem;
    private String description;

    To_do_list(int menuItem, String description) {
        this.menuItem = menuItem;
        this.description = description;
    }

    public int getMenuItem() {
        return menuItem;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("To_do_list{");
        sb.append("menuItem=").append(menuItem);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
