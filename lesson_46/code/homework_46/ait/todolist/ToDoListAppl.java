package homework_46.ait.todolist;

import homework_46.ait.todolist.dao.ToDoListImpl;
import homework_46.ait.todolist.model.Task;
import homework_46.ait.todolist.view.Menu;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppl implements Serializable {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");

        ToDoListImpl toDoList = new ToDoListImpl(); // object
        LocalDate now = LocalDate.now();

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");

            // Проверка на правильность ввода целого числа
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number from the menu.");
                scanner.next(); // Очистить некорректный ввод
                continue;
            }

            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task t = new Task(task, now);
                    toDoList.addTask(t);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    if (scanner.hasNextInt()) {
                        int taskNumber = scanner.nextInt();
                        // Проверяем, находится ли номер задачи в пределах допустимого диапазона
                        if (taskNumber > 0 && taskNumber <= toDoList.getAllTasks().size()) {
                            toDoList.removeTask(taskNumber);
                            System.out.println("Task " + taskNumber + " removed.");
                        } else {
                            System.out.println("Task number does not exist. Please enter a valid number.");
                        }
                    } else {
                        System.out.println("Invalid task number. Please enter a valid number.");
                        scanner.next(); // Очистить некорректный ввод
                    }
                    break;
                }
                case 4: {
                    System.out.println("Saving... ");
                    List<Task> taskList = toDoList.getAllTasks();

                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("task_list.dat"))) {
                        oos.writeObject(taskList);

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 5: {
                    System.out.println("Loading... ");

                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("task_list.dat"))) {
                        List<Task> readTask = (List<Task>) ois.readObject();
                        System.out.println(readTask);
                        System.out.println("List of tasks:");
                        int taskNumber = 0;
                        for (Task t : readTask) {
                            System.out.println((taskNumber++ + 1) + ". " + t.getTask() + ", data: " + t.getDate());
                            // taskNumber++;
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 6:
                    return;
                default: {
                    System.out.println("Wrong input. Please enter a number from the menu.");
                }
            }
        }
    }
}

