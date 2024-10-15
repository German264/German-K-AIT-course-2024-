//Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?

import java.util.Random;

public class Dies {
    public static void main(String[] args) {

        Random random = new Random(); //сделали оъект

        int[] toss = new int[20];
        for (int i = 0; i < toss.length; i++){
            //вызов датчика случайных чисел
            toss[i] = random.nextInt(6) + 1; // генерируем случайное число от 0 до 5 и сдвигаем на 1
            System.out.print(toss[i] + " "); // выводим значение броска
        }
        System.out.println();

        // создаем новый массив для вычисления вероятности выпадения каждой из граней кубика при нашем количестве бросков
        double[] probability = new double[toss.length];

        // делим каждый элемент массива на 6 и сохраняем результат в новый массив
        for (int i = 0; i < toss.length; i++) {
            probability[i] = toss[i] / 6.0;
        }
        // выводим результат
        System.out.print("Вероятность выпадения каждой из граней кубика в нашем случае: ");
        System.out.println();
        for (double num : probability) {
            System.out.printf("%.2f ", num);
        }
        System.out.println();
        // Сравнение вероятностей
        boolean allEqual = true;
        double firstProbability = probability[0];
        for (int i = 1; i < probability.length; i++) {
            if (Math.abs(probability[i] - firstProbability) > 0.01) { // Проверка с учетом допустимого отклонения
                allEqual = false; // Если хоть одна вероятность не равна, устанавливаем false
            }
        }
        // Выводим результат сравнения
        if (allEqual) {
            System.out.println("Вероятности равны: ИСТИНА.");
        } else {
            System.out.println("Вероятности равны: ЛОЖЬ.");
        }
        System.out.print("Однако, при количестве бросков кубика стремящемся к бесконечности, вероятность выпадения каждой из граней стремится к 1/6 (0.17 при округлении).\nИсходя из этого можно сделать вывод, что мы бросали кубик недостатьчно усердно... ");
        System.out.println();
    }
}
