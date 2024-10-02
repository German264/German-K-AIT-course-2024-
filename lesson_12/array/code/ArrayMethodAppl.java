import java.util.Scanner;

public class ArrayMethodAppl {
    public static void main(String[] args) {

        /*int[] myArray = ArrayMethod.fillArray(-10, 10, 20);
        ArrayMethod.printArray(myArray);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for searching: ");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethod.searchInArray(myArray, n);
        System.out.println("Number" + n + " is in array: " + isInArray);
        System.out.println("----------------------------------");

        //Задание 2. Дополните класс ArrayMethods методом calculatePercent, который
        //- получает массив данных об остатках на счетах пользователей банка и
        //- возвращает их с начисленными X процентами.
        //Дополните класс ArrayMethods методом printArrayDouble(), который печатает массив данных типа double.
        //В классе ArrayMethodsAppl создайте тестовый массив и вызовите для него метод calculatePercent, а затем распечатайте полученный результат.

        double[] clients = ArrayMethod.calculatePercent(new double[]{100, 200, 589485}, 3);
        System.out.println("Остатки на счетах пользователей банка с начисленными процентами:");
        ArrayMethod.printArrayDouble(clients);

        //Задание 3. Дополните класс ArrayMethods методами: sumArray(int[] array) - возвращает сумму всех элементов массива.
        //averageValue(double[] array) - возвращает среднее арифметическое значение всех элементов массива.
        //Вызовите и проверьте работу этих методов из класса ArrayMethodsAppl.

        int array = ArrayMethod.sumArray(new int[]{6, 5, 2});
        System.out.println("Сумма всех элементов массива:");     //???????????
        ArrayMethod.printArray(new int[]{array});

        double arrayDouble = ArrayMethod.averageValue(new double[]{6, 5, 2});  //?????????????
        System.out.println("Среднее арифметическое элементов массива:");
        ArrayMethod.printArrayDouble(new double[]{arrayDouble});
        */

        int[] myArray = {10, 20, 30, 40, 50};
        System.out.println(ArrayMethod.linearSearch(myArray, 10));
        System.out.println(ArrayMethod.linearSearch(myArray, 100));

        System.out.println("-------------------------------------------------------------");

        int index = ArrayMethod.binarySearch(myArray, 100);
        System.out.println(index);

    }
}
