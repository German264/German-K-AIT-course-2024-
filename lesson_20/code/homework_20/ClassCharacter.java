package homework_20;
//Задание 2. Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
//количество символов в строке;
//количество символов в верхнем регистре;
//количество цифр в строке;
//количество пробелов в строке (код пробела = 32);
//в зависимости от последнего символа в строке сообщает, какое это предложение:
//повествовательное;
//вопросительное;
//восклицательное.
//Используйте методы класса Character.
import java.util.Scanner;

public class ClassCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Просим пользователя ввести строку целых чисел
        System.out.println("Введите предложение:");

        //Считываем строку и удаляем лишние пробелы в начале и в конце
        String input = scanner.nextLine().trim();

        //Подсчет количества символов в строке
        int count = countDefinedCharacters(input);
        System.out.println("Количество определённых символов: " + count);

        //Подсчет количества символов в верхнем регистре
        int uppercaseCount = countUppercase(input);
        System.out.println("Количество символов в верхнем регистре: " + uppercaseCount);

        //Подсчёт количества цифр
        int digitCount = countDigits(input);
        System.out.println("Количество цифр в строке: " + digitCount);

        //Подсчёт количества пробелов
        int spaceCount = countSpaces(input);
        System.out.println("Количество пробелов в строке: " + spaceCount);

        //Проверка, является ли строка пустой
        if (input.isEmpty()) {
            System.out.println("Строка пуста.");
        } else {

            // Определяем последний символ строки
            char lastChar = input.charAt(input.length() - 1);
            checkSentenceType(lastChar);
        }

    }//end of main

    // Метод для подсчета количества определенных символов в предложении
    public static int countDefinedCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Получаем символ из строки
            // Проверяем, является ли символ определённым
            if (Character.isDefined(ch)) {
                count++; // Увеличиваем счетчик
            }
        }
        return count; // Возвращаем общее количество
    }

    // Метод для подсчета количества заглавных букв
    public static int countUppercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Получаем символ из строки
            // Проверяем, является ли символ заглавной буквой
            if (Character.isUpperCase(ch)) {
                count++; // Увеличиваем счетчик
            }
        }
        return count; // Возвращаем общее количество заглавных букв
    }

    // Метод для подсчета количества цифр в строке
    public static int countDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Получаем символ из строки
            // Проверяем, является ли символ цифрой
            if (Character.isDigit(ch)) {
                count++; // Увеличиваем счетчик
            }
        }
        return count; // Возвращаем общее количество цифр
    }

    // Метод для подсчета количества пробелов
    public static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {  // Проверяем, является ли символ обычным пробелом
                count++;
            }
        }
        return count;
    }

    // Метод для определения типа предложения
    public static void checkSentenceType(char lastChar) {
        if (Character.isLetterOrDigit(lastChar)) {    //Проверяем, является ли последний символ строки буквой или цифрой.
                                                      //Если нет специальных символов вроде точки, вопросительного или восклицательного знаков, то такое предложение считаем повествовательным.
            System.out.println("Это повествовательное предложение.");
        } else if (lastChar == '.') {
            System.out.println("Это повествовательное предложение.");
        } else if (lastChar == '?') {
            System.out.println("Это вопросительное предложение.");
        } else if (lastChar == '!') {
            System.out.println("Это восклицательное предложение.");
        } else {
            System.out.println("Не удалось определить тип предложения.");
        }
    }
}//end of class
