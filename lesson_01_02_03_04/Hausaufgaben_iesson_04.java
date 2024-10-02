public class Hausaufgaben_iesson_04 {

    //Здесь лучше оъявлять константы

    public static void main(String[] args) {

        //Перевод евро в доллары США, британские фунты, китайские юани
        //Надо округлить до 2-х знаков, но не получилось. Это вопрос...

        double euro = 450;//евро
        double dollar = exchangeEuroToDollar(euro);
        double pound = exchangeEuroToPound(euro);
        double youan = exchangeEuroToYuan(euro);
        System.out.println(euro + " евро равно " + dollar + " долларов США, " + pound + " британских фунтов, "
                + youan + " китайских юаней.");

        //Перевод градусов Цельсия в градусы Фаренгейта

        double celsius = 20;
        double fahrenheit = celsiusOfFahrenheit(celsius);
        System.out.println("Температура " + celsius + "°С (градусов Цульсия) равна температуре " + fahrenheit + "°F по Фаренгейту");

        //Перевод расстояния в морских милях в километры

        double miles = 10;
        double kilometers = milesToKilometers(miles);
        System.out.println("Расстояние в " + miles + " морские мили равно " + kilometers + " километрам");


    }//end of main

    //Перевод евро в доллары США, британские фунты, китайские юани (три метода, результаты выводим одной строкой)

    private static double exchangeEuroToDollar(double euro) {
        double rate = 1.11;      //Как задать период десятичной дроби?
        return euro * rate;
    }

    private static double exchangeEuroToPound(double euro) {
        double rate = 0.84;
        return euro * rate;
    }

    private static double exchangeEuroToYuan(double euro) {
        double rate = 7.87;
        return euro * rate;
    }

    //Перевод градусов Цельсия в градусы Фаренгейта (метод)

    public static double celsiusOfFahrenheit(double celsius) {
        return celsius * 9.0 / 5 + 32;
    }

    //Перевод расстояния в морских милях в километры (метод)

    public static double milesToKilometers(double miles) {
        return miles * 1.852;
    }

}
