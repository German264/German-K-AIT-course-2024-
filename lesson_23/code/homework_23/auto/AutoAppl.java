package homework_23.auto;

import homework_23.auto.model.Auto;

public class AutoAppl {
    public static void main(String[] args) {

        Auto[] auto = new Auto[5];

        auto[0] = new Auto("Audi", 1.6, 6.6, 45);
        auto[1] = new Auto("BMW", 1.8, 6.8, 49);
        auto[2] = new Auto("Opel", 1.6, 6.9, 45);
        auto[3] = new Auto("VW", 1.6, 6.5, 39);
        auto[4] = new Auto("Mercedes", 1.8, 6.3, 49);

        // Вывод информации о автомобилях
        System.out.println("Автомобили, которые можно взять в аренду:");
        for (int i = 0; i < auto.length; i++) {
            System.out.println(auto[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------------");

        int distance = 3000;  // Расстояние в километрах
        Auto bestAuto = null;
        double minCost = Double.MAX_VALUE; // Инициализируем наибольшим возможным значением

        for (int i = 0; i < auto.length; i++) {
            double totalPrice = auto[i].totalPrice(distance); // Рассчитываем стоимость поездки для каждого автомобиля
            System.out.println(auto[i].getMark() + ": Общая стоимость поездки = " + totalPrice);
            if (totalPrice < minCost) {                       // Если найдено меньшая стоимость
                minCost = totalPrice;                         // Обновляем минимальную стоимость
                bestAuto = auto[i];                           // Сохраняем лучший автомобиль
            }
        }
        System.out.println("\nСамый дешевый автомобиль для поездки: " + bestAuto.getMark() + " с общей стоимостью " + minCost);
    }
}