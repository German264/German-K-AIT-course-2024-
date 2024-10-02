package HA;

//Задача 3. Анна использует различные электроприборы в своем доме.
//У неё есть холодильник, который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт.
//Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч составляет 0.15 евро.
//Вопросы: Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption).
//Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)

import java.util.Scanner;

public class Hausaufgaben_les_09_Electricity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double refHr = 150;
        double condHr = 2000;
        double costKwtHr = 0.15;

        double refCondHr = (refHr + condHr) * 0.001 * costKwtHr;

        System.out.printf("Холодильник и кондиционер вместе тратят в час %.2f кВт и это стоит %.2f евро.%n", (refHr + condHr) * 0.001, refCondHr);

        // Ввод количества дней
        System.out.println("Введите количество дней, за которые вы хотите узнать ваши расходы на электроэнергию: ");
        int day = scanner.nextInt();

        // Расчет общей стоимости за введенное количество дней
        double totalCost = 24 * refCondHr * day;
        System.out.printf("%d день(дней) работы холодильника и кондиционера вместе будет стоить вам %.2f евро оплаты за электроэнергию при условии их круглосуточной работы.%n", day, totalCost);
    }
}

