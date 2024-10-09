package homework_20;
//Задание 3. Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double
//Типы как объекты String должны браться из аргументов основной функции main.
//Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double).
//Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.
public class MaxMin {
    public static void main(String[] args) {

        // Если аргументы не указаны, то выводим значения для всех 7 типов
        if (args.length == 0) {
            printMinMax("byte");
            printMinMax("short");
            printMinMax("int");
            printMinMax("long");
            printMinMax("char");
            printMinMax("float");
            printMinMax("double");
        } else {

            // Проходим по всем аргументам, переданным в main
            for (String arg : args) {
                printMinMax(arg.toLowerCase());  // Приводим к нижнему регистру для обработки
            }
        }
    }//end of main

    // Метод для вывода минимальных и максимальных значений по типу
    public static void printMinMax(String type) {
        switch (type) {
            case "byte":
                System.out.println("byte: Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
                break;
            case "short":
                System.out.println("short: Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
                break;
            case "int":
                System.out.println("int: Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
                break;
            case "long":
                System.out.println("long: Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
                break;
            case "char":
                System.out.println("char: Min = " + (int) Character.MIN_VALUE + ", Max = " + (int) Character.MAX_VALUE);
                break;
            case "float":
                System.out.println("float: Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
                break;
            case "double":
                System.out.println("double: Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
                break;
            default:
                System.out.println("Неверный тип: " + type);
        }
    }
}//end of class
