//Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней
//Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?

import java.util.Random;

public class Dies1 {
    public static void main(String[] args) {
        Random random = new Random(); //сделали оъект

        int[] toss = new int[20];
        for (int i = 0; i < toss.length; i++){
            //вызов датчика случайных чисел
            int n = random.nextInt(6) + 1; // генерируем случайное число от 0 до 5 и сдвигаем на 1
            toss[i] = n;
            System.out.print(toss[i] + " "); // выводим значение броска
        }
        System.out.println();

        //calculate results of tossing
        int[] res = new int[6]; //array for results
        for (int i = 0; i < toss.length; i++){
            int n = toss[i];
            switch (n){
                case 1 -> res[0]++;
                case 2 -> res[1]++;
                case 3 -> res[2]++;
                case 4 -> res[3]++;
                case 5 -> res[4]++;
                case 6 -> res[5]++;
            }
        }
        //print res
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
