package homework_25.regex_validator;

public class Validator {

    // CreditCardNumber
    public static boolean checkCreditCardNumber(String str) {
        return str.matches("\\d{8,16}");
    }

    //DateFormatEU - dd-MM-yyyy(?)
    public static boolean checkDateFormatEU(String str) {
        // TODO Homework checkDateFormatEU
        return str.matches("(0[1-9]|[1-2][0-9]|3[0-1])\\.(0[1-9]|1[0-2])\\.\\d{4}");
    }

    // DateFormatUS - yyyy-MM-dd
    public static boolean checkDateFormatUS(String str) {
        // TODO Homework checkDateFormatUS
        return str.matches("\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])");
    }

    // PhoneNumber
    public static boolean checkPhoneNumber(String str) {
        // TODO Homework checkPhoneNumber
        return str.matches("[+]\\d{2}[(]\\d{2}[)]\\d{4}-\\d{4}");
    }

    // LessEquals255
    public static boolean checkLessEquals255(String str) {
        // TODO Homework checkLessEquals255
            return str.matches("[0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]");
    }


}
