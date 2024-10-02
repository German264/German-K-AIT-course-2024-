
public class Hausaufgaben_lesson_05 {
    public static void main(String[] args) {

        //ЗАДАЧИ

        //Задача 1. Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.
        int x = 245;
        int y = 357;
        //Вызов метода Задачи 1.
        int min = minimum(x, y);
        System.out.println("Наименьшее число " + min);

        //Задача 2. Задать в программе три стороны треугольника. Проверить выполнимость неравенства треугольника -
        // любая из сторон должна быть меньше суммы двух других. Сообщить результат - существует или нет треугольник с заданными сторонами.
        int a3 = 9;
        int b3 = 12;
        int c3 = 6;
        //Вызов метода Задачи 2.
        boolean res=triangle(a3, b3, c3);
        System.out.println("Треугольник с заданными сторонами существует: "+res);

        //Задача 3. Сделайте расчет покупки товаров со скидками. Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
        // Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
        // Вычислите итоговую стоимость покупки и величину полученной скидки.
        double produktA = 15;      //Стоимость товара А
        double produktB = 20;      //Стоимость товара В
        double sumA =4;            //Количество товара А
        double sumB =3;            //Количество товара В
        double discountD = 0.07;   //Скидка на товар А
        double discountC = 0.03;   //Скидка на товар B
        double discountS = 0.05;   //Дополнительная скидка
        double S = 100;            //Сумма превышения покупки
        //Вызов метода Задачи 3.
        double buy = buy(produktA, produktB, discountD, discountC, sumA, sumB, S, discountS);
        double dis = dis(produktA, produktB, discountD, discountC, sumA, sumB, S, discountS);
        System.out.println("Стоимость покупки с учетом скидки итого: " + buy + " Скидка итого: " + dis);
    }

    //МЕТОДЫ

    //Задача 1. Метод.
    private static int minimum(int x, int y) {
        int min;
        if (x < y) {
            min = x;
        } else {
            min = y;
        }
        return min;
    }

    //Задача 2. Метод.
    public static boolean triangle(int a3, int b3, int c3){
        return a3<b3+c3 & b3<a3+c3 & c3<a3+b3;
    }

    //Задача 3. Метод.
    private static double buy(double produktA, double produktB, double discountD, double discountC, double sumA, double sumB, double S, double discountS){
        double buy;
        if ((produktA-produktA*discountD)*sumA + (produktB-produktB*discountC)*sumB>S){
            buy = ((produktA-produktA*discountD)*sumA + (produktB-produktB*discountC)*sumB) - (((produktA-produktA*discountD)*sumA + (produktB-produktB*discountC)*sumB))*discountS;
        }else {
            buy = ((produktA-produktA*discountD)*sumA + (produktB-produktB*discountC)*sumB);
        }
        return buy;
    }
    private static double dis(double produktA, double produktB, double discountD, double discountC, double sumA, double sumB, double S, double discountS){
        double dis;
        if ((produktA-produktA*discountD)*sumA + (produktB-produktB*discountC)*sumB>S){
            dis = ((produktA*discountD)*sumA + (produktB*discountC)*sumB) + ((produktA-produktA*discountD)*sumA + (produktB-produktB*discountC)*sumB) * discountS;
        }else {
            dis = ((produktA*discountD)*sumA + (produktB*discountC)*sumB);
        }
        return dis;
    }
    }

