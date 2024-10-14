package classwork_24.compare_string;

//равенство строк - как понять?
public class CompareStringAppl {
    public static void main(String[] args) {


        int x = 5; //стек
        int y = 5; //стек

        boolean checker = (x == y);
        System.out.println(checker); //true

        String str1 = "Europe"; //str1 - ctak => (ссылка) Europe - heap
        String str2 = "Europe"; //str2 - ctak => (ссылка) Europe - heap

        System.out.println("--------------------------------------------------");

        checker = (str1 == str2); // compare string
        System.out.println(checker);

        System.out.println("--------------------------------------------------");

        String str3 = new String("Europe"); // create new object
        checker = (str1 == str3);
        System.out.println(checker); // false, because

        System.out.println("--------------------------------------------------");
        checker = str1.equals(str3); // compare String with method equals
        System.out.println(checker);


    }
}