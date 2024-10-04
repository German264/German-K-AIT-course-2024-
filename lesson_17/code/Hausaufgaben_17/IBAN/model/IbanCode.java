package Hausaufgaben_17.IBAN.model;

//Задание 3.(*) Номер счета в банке IBAN состоит из букв латинского алфавита и цифр, имеет строго регламентированную длину (в Германии - 22 символа).
//Создать класс IbanCode, в котором определить необходимые поля и реализовать методы:
//lengthCode(String code), который возвращает количество символов в счете
//controlCode(String code), который возвращает сумму ASCII-кодов первых двух символов
//isValid(String code), который проверяет штрих-код на правильное количество символов

public class IbanCode {

    private static String ibanCode;

    // Конструктор для инициализации IBAN-кода
    public IbanCode(String ibanCode) {
        this.ibanCode = ibanCode;
    }

    public String getIbanCode() {
        return ibanCode;
    }

    public void setIbanCode(String ibanCode) {
        this.ibanCode = ibanCode;
    }

    // Метод для вывода информации о коде
    public void display() {
        System.out.println("IBAN Code: " + ibanCode);
    }

    // Метод для получения количества символов в счете
    public static int lengthCode() {
        return ibanCode.length();
    }

    //Метод для получения суммы ASCII-кодов первых двух символов
    public int controlCode() {
        char firstChar = ibanCode.charAt(0);
        char secondChar = ibanCode.charAt(1);
        return (int) firstChar + (int) secondChar;
    }

    //Метод, который проверяет штрих-код на правильное количество символов
    public static boolean isValid(String ibanCode) {
        return ibanCode.length() == 22; // Возвращает true, если длина равна 22, иначе false
    }
}
