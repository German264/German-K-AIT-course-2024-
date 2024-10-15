public class Mathmethod {

    public static void main(String[] args) {

        //Перевод долларов в евро
        double money = 500;//dollars
        double euro = exchangeDollarToEuro(money);
        System.out.println("Euro: " + euro);

        //Количество калорий


        //Расход топлива и стоимости на поездку


    }//end of main


    private static double exchangeDollarToEuro(double money) {
        //return 0;
        double rate = 0.9;
        return money * rate;
    }

}
