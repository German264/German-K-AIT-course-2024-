
//Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

public class Numbers {
    public static void main(String[] args) {

        int i = 1; //Парам. цикла
        int y = 101;

        while (i < y){
            if(i % 5 == 0){
                System.out.print(i + " ");
            }
            i++; //Постфиксная операция, увел. на 1
        }

    }
}
