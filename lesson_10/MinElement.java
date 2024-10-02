
//**Задача 4.**
//Создайте массив, который содержит возраст студентов группы.
//- какой возраст максимальный?
//- какой возраст минимальный?

public class MinElement {
    public static void main(String[] args) {

        int[] agees = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18};
        int min = agees[0];
        for (int i = 0; i < agees.length; i++) {
            if (agees[i] < min) {
                min = agees[i];
            }
        }
        System.out.println("Min age = " + min);
    }
}
