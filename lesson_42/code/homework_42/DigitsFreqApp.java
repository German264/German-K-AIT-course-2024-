package homework_42;

//Задача 3(*).
// В классе DigitsFreqApp сгенерировать один миллион положительных целых чисел в интервале от 100 до 1000, и подсчитать частоту встречаемости цифр в этих числах.

import java.util.HashMap;
import java.util.Map;

public class DigitsFreqApp {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[1000000];
        numbers = DigitsFreqApp.fillArray(100, 1000, 1000000);

        printNumberFrequency(numbers);
    }

    // fill array random numbers
    // a - left border, b - right border, n - quantity
    public static Integer[] fillArray(int a, int b, int n){
        Integer[] res = new Integer[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int)(Math.random()*(b - a + 1) + a); //
        }
        return res;
    }

    private static void printNumberFrequency(Integer[] numbers) {
            // Key - это число, value - это сколько раз оно попалось в массиве
            Map< Integer , Integer> resultMap = new HashMap<>();

            for (Integer num : numbers) {
                if(!resultMap.containsKey(num)){ // когда число попалось 1-й раз
                    resultMap.put(num, 1);
                } else { // когда такое число уже есть в Map
                    resultMap.put(num, resultMap.get(num) + 1); // увеличиваем частоту на 1
                }

            }

            // print resultMap
            for (Integer num : resultMap.keySet()) {
                System.out.println("Число " + num + " встречается " + resultMap.get(num) + " раз");
            }
        }
}
