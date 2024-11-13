package homework_45.to_do_list;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class To_do_listAppl { private static final String FILE_NAME = "tasks.dat";  // Имя файла для сохранения задач
    private static List<Task> tasks = new ArrayList<>();  // Список задач

    public static void main(String[] args) {

        loadTasksFromFile();  // Загрузка задач из файла при старте приложения

        boolean flag = true;
        System.out.println("Добро пожаловать в меню списка дел!\nВыберите один из пунктов меню:");

        To_do_list[] lists = To_do_list.values();
        for (To_do_list list : lists) {
            System.out.println(list.getMenuItem() + " : " + list.getDescription());
        }

        Scanner scanner = new Scanner(System.in);

        // Начало основного цикла
        while (flag) {

            int choice = scanner.nextInt();
            scanner.nextLine();  // Чтение новой строки после ввода числа

            switch (choice) {
                case 1:  // Добавить задачу
                    System.out.println("Введите описание задачи:");
                    String taskDescription = scanner.nextLine();  // Ввод описания задачи
                    Task task = new Task(taskDescription);
                    tasks.add(task);  // Добавляем задачу в список
                    saveTasksToFile();  // Сохраняем задачи в файл
                    System.out.println("Задача добавлена: " + task);
                    break;
                case 2:  // Просмотреть все задачи
                    if (tasks.isEmpty()) {
                        System.out.println("Нет задач.");
                    } else {
                        System.out.println("Все задачи:");
                        tasks.forEach(System.out::println);
                    }
                    break;
                case 3:  // Удалить задачу по номеру
                    System.out.println("Введите номер задачи для удаления:");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        Task removedTask = tasks.remove(taskNumber - 1);  // Удаляем задачу
                        saveTasksToFile();  // Сохраняем обновленный список в файл
                        System.out.println("Задача удалена: " + removedTask);
                    } else {
                        System.out.println("Неверный номер задачи.");
                    }
                    break;
                case 4:  // Выйти из меню
                    flag = false;
                    System.out.println("Я надеюсь, что Вы хорошо провели время и совсем не устали. Спокойной ночи!");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }

    // Метод для сохранения задач в файл
    private static void saveTasksToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении задач: " + e.getMessage());
        }
    }

    // Метод для загрузки задач из файла
    private static void loadTasksFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            tasks = (List<Task>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Файл задач не найден, начнем с пустого списка.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке задач: " + e.getMessage());
        }
    }
}
