public class Hausaufgaben1 {

    public static void main(String[] args) {

        startMethod();
        method123();
        finish();

    } // end of main

    public static void startMethod(){
        System.out.println("Поехали!!!");
    }

    public static void finish(){
        System.out.println("Ух,получилось! Спокойной ночи... ");
    }

    public static void method123(){
        method1();
        method2();
        method3();
    }

    public static void method1(){
        System.out.println("Метод1 стартовал");
        System.out.println("Вызываем Метод2");
    }

    public static void method2(){
        System.out.println("Метод1 финишировал");
        System.out.println("Метод2 стартовал");
        System.out.println("Вызываем Метод3");
    }

    public static void method3(){
        System.out.println("Метод2 финишировал");
        System.out.println("Метод3 стартовал");
        System.out.println("Метод3 финишировал");
    }

} // end of class
