package cycles;

//Возведите 3 в степень 10, выведите на печать все промежуточные результаты.

public class Power {
    public static void main(String[] args) {

        int pow = (int) Math.pow(3,10); //кастинг - преобразование double - int
        System.out.println(pow);

        //Нач. значения

        int count = 0; //Параметр цикла
        int res = 1;

        while (count < 10){

            res = res * 3; //Возведение 3 в степень
            count++;       //Изменение параметра цикла
            System.out.println(res +" =3 in power "+ count);

        }

    }
}
