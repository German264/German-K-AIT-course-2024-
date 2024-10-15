
//Задать целочисленные переменные x и y, выполнить c ними математические действия, напечатать результаты вместе с текстовыми пояснениями:
//- какие переменные участвовали;
//- какие действия с ними выполнялись;
//- что получилось в результате.

public class MathOperation {
    public static void main(String[] args) {

        int x = 38;
        int y = 63;
        System.out.println(x+y);

        int res = x + y;
        System.out.println("x = " +x + " складываем с у= "+ y + " получаем " + res);


        res = x-y;
        System.out.println("x = " + x +" - y = " + y + " получаем " + res);

        // Деление целых чисел дает целую часть
        res = y / x;
        System.out.println("y = " + y + " / x = " + x + " = " + res);

        //Деление % целых чисел дает остаток деления
        res = y % x;
        System.out.println("y = " + y + " % x = " + x + " = " + res);




    }//end of main
}//end of class
