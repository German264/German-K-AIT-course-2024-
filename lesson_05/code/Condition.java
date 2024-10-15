//Проверка положительное или отрицательное число.
//Проверка четное или нечетное целое число.
//Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
//прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".


public class Condition {
    public static void main(String[] args) {

        //Неполный условный оператор

        int x = 158;

        if ( x>=0 ){
            System.out.println("x = "+x+ " is positive number");
        }
        if (x<0){
            System.out.println("x = "+x+ " is negative number");
        }

        //Полный условный оператор

        x = -234; //Переопределил значение переменной

        if (x>=0){
            System.out.println("x = "+x+ " is positive number");
        } else {
            System.out.println("x = "+x+ " is negative number");
        }

        x=112;

        if (x%2==0){
            System.out.println("x= "+x+" is even");
        }else {
            System.out.println("x= "+x+" is odd");
        }

        int age=17;

        if (age>=18){
            System.out.println("Вам разрешено действовать самостоятельно");
        }else {
            System.out.println("Вам надо прийти вместе с вашим опекуном");
        }
    }
}
