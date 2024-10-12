public class ArrayMethod11 {

    //binary search
    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int righIndex = array.length - 1;
        while (leftIndex <= righIndex){
            int midIndex = (leftIndex + righIndex) / 2;
            if (array[midIndex] == n){
                return midIndex;
            } else if (n < array[midIndex]){
                righIndex = midIndex - 1; //правую половину надо отбросить
            } else{
                leftIndex = midIndex + 1; //левую половину надо отбросить
            }
        }
        return -leftIndex - 1; //если не нашелся
    }

    //linear search, return index (if element absent return -1)
    //Чем больше элементов массива, тем дольше работает метод
    public static int linearSearch(int[]array, int n){
        for (int i = 0; i < array.length; i++){
            if (array[i] == n){
                return i;
            }
        }
        return  -1;
    }

  //========================================================================================
    //  - заполнение массива случайными целыми числами из интервала от a до b +
//  - печать массива целых чисел +
//  - поиск элемента

    //fill array
    //a - left border, b - right border, n - quantity
    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a); //случайные числа
        }
        return res;
    }

    //Задание 2.
    public static double[] calculatePercent(double[] clients, double percent) {
        double[] res = new double[clients.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = clients[i] * (percent / 100 + 1);
        }
        return res;
    }

    //Задание 3.
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static double averageValue(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (double) sum / array.length;
    }

    //print array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("----------------------------------");
    }

    //Задание 2.
    public static void printArrayDouble(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f    ", array[i]);
        }
        System.out.println();
        System.out.println("----------------------------------");
    }

    //search in array
    public static boolean searchInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    } //end of method
}
