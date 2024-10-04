package Hausaufgaben_17.IBAN;

import Hausaufgaben_17.IBAN.model.IbanCode;

import static Hausaufgaben_17.IBAN.model.IbanCode.isValid;
import static Hausaufgaben_17.IBAN.model.IbanCode.lengthCode;

public class IbanCodeAppl {
    public static void main(String[] args) {

        IbanCode ibanCode = new IbanCode ("DE89370400440532013000");

        // Вывод IBAN-кода
        ibanCode.display();

        System.out.println("Количество символов в счете: " + ibanCode.lengthCode());
        System.out.println("Cумма ASCII-кодов первых двух символов: " + ibanCode.controlCode());
        System.out.println("Штрих-код валиден? " + IbanCode.isValid(ibanCode.getIbanCode()));
    }
}
