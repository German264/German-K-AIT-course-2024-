package classwork_38.linked_list_test;

// заполнить список случайными целыми числами
// проверить работу методов LinkedList

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListAppl {

    private static final int N_NUMBERS = 10;
    private static final Random random = new Random();
    private static final int MIN = 10;
    private static final int MAX = 20;

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(); // определяем имплементацию, было ArrayList()<>

        fillList (list); // creation
        printList (list); // reading

        System.out.println(list.size());
        System.out.println(list.get(0)); // первый элемент списка
        System.out.println(list.get(list.size() - 1)); // последний элемент

        //
        System.out.println(list.indexOf(10)); //
        list.set(0, 50);
        list.set(N_NUMBERS - 1, 100);
        printList(list);

        list.set(5, 200);
        printList(list);

        // NB! Так удалять не надо
        // удалить 15, если оно есть списке
//        for (Integer num : list) {
//            if(num == 15){
//                list.remove(num);
//            }
//        }
//        printList(list);
//
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(num.equals(15)){
                iterator.remove(); // удаление в позиции курсора итератора
            }
        }
        printList(list);
        // Integer num = 100;
        list.remove(list.indexOf(100));
        printList(list);

        // удаление по условию (предикат, лямбда)
        // удалим все элементы, кратные 3
        list.removeIf(e -> e%3 == 0);
        printList(list);


    }// end of main

    private static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------");
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MIN, MAX));
        }
    }
}
