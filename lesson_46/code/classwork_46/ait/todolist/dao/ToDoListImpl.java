package classwork_46.ait.todolist.dao;

import classwork_46.ait.todolist.model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ToDoListImpl implements ToDoList {

    // хранилище
    private List<Task> tasks;
    private int quantity;

    private LocalDate time;

    public ToDoListImpl() {
        this.tasks = new ArrayList<>(); // "резиновый" список
        this.quantity = 0;
    }

    @Override
    public boolean addTask(Task task) {
        if(task == null || tasks.contains(task)){
            return false;
        }
        tasks.add(task); // метод add из ArrayList
        quantity = tasks.size();
        return true;
    }

    @Override
    public Task removeTask(int taskNumber) {
        if(taskNumber >= 1 && taskNumber <= quantity){
            Task victim = tasks.get(taskNumber - 1);
            tasks.remove(victim);
            System.out.println("Task: " + victim.getTask() + " is removed.");
            quantity--;
            return victim;
        }
        System.out.println("Wrong number of task.");
        return null;
    }

    @Override
    public void viewTasks() {

//        for (int i = 0; i < tasks.size(); i++) {
//            System.out.println((i + 1) + ". " + tasks.get(i)) ;
//        }

//        for (Task t : tasks) {
//            System.out.println(t);
//        }

        IntStream.range(0, tasks.size())
                .forEach(i -> System.out.println((i + 1) + ". " + tasks.get(i)));

    }

    @Override
    public List<Task> getAllTasks() {
        return tasks.stream().toList();
    }

    @Override
    public int quantity() {
        return quantity;
    }
}
