package classwork;

public class StringAppl {
    public static void main(String[] args) {

        String str1 = "Hello,";

        char[] chars = { 32, 'W', 'o', 'r', 'l', 'd', '!'}; //32 - код пробела ASCII

        String str2 = new String(chars); //str2 - объект класса String, сделанный конструктором (тоже метод)
        //new - обращение к конструктору класса

        System.out.println(str1);//Hello,
        System.out.println(str2);// World!

        //concat - объединяемб складываем объекты типа String
        String str = str1 + str2;
        System.out.println(str);

        str1.concat(str2);//конкатинация с помощью метода
        System.out.println(str1.concat(str2));
        System.out.println(str1);//str1 не изменилась так как тип String immutable

        //length of String
        int l = str.length();//определяем длину строки str
        System.out.println(l);

        //first symbol
        char ch = str.charAt(0);
        System.out.println("First symbol: "+ch);
        //last symbol
        ch = str.charAt(str.length() - 1);
        System.out.println("Last symbol: "+ch);

        //print with spaces (с пробелами)
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();//new line

        //check equals
        String str3 = " worLD!";
        boolean checker = str3.equals(str2); //str2 = "World!"
        System.out.println(checker); //false
        checker = str3.equalsIgnoreCase(str2); //str2 = "World!"
        System.out.println(checker); //true

        System.out.println("--------------------------------------------------");
        //symbol in position
        System.out.println(str);
        int index = str.indexOf('W');
        System.out.println(index); //7
        int index1 = str.lastIndexOf('d'); //при поиске идем справа на лево ??????? - НЕТ!
        System.out.println(index1);
        index = str.indexOf('o');
        index1 = str.lastIndexOf('o');
        System.out.println(index+ ", "+ index1);
        index = str.indexOf('X');
        System.out.println(index); //-1

        System.out.println("------------------------substring (подстрока)----------------------------");
        System.out.println(str.substring(7));
        System.out.println(str.substring(7,10));

        System.out.println("--------------------------repllace (заменять)--------------------------");
        System.out.println(str.replace("o", "O-O-O"));

        System.out.println("----------------------------split (разделение - количество слов или символов без пробелов)--------------------------");
        //number ofwords
        String str4 = "I love, string of Jawa.";
        String[] words = str4.split(" "); //количество слов без пробелов
        int w = words.length;
        System.out.println("Numbers of words in sentence: " +w);

        //number of letters
        String[] letters = str4.split("");
        int let = letters.length;
        System.out.println("Numbers of letters in sentence: "+let);

        System.out.println("----------------------------String.format--------------------------");
        //Вставьте в строку дату полета Гагарина в виде:
        //"Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли.
        //Используйте String.format()
        int day = 12;
        String month = "April";
        int year = 1961;

        String gagarinDay = String.format("Дата полета Гагарина в космос: %d - %s - %d", day, month, year);
        System.out.println(gagarinDay);

    }
}
