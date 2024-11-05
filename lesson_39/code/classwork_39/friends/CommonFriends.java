package classwork_39.friends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CommonFriends {
    public static void main(String[] args) {

        List<String> friendsA = Arrays.asList("Иван", "Мария", "Анна", "Петр"); //
        List<String> friendsB = Arrays.asList("Анна", "Елена", "Петр", "Дмитрий"); //

        System.out.println("Common friends: " + findCommonFriends(friendsA, friendsB));

    }

    private static List<String> findCommonFriends(List<String> friendsA, List<String> friendsB) {
        HashSet<String> setA = new HashSet<>(friendsA);

        List<String> commonFriends = new ArrayList<>();

        // обойдем setA и по ходу будем сравнивать элементы со списком friendsB
        for (String f : friendsB) {
            if(setA.contains(f)){
                commonFriends.add(f);
            }
        }
        // а если их нет?
        if(commonFriends.isEmpty()){
            System.out.println("There is no any common friends!");
            return null;
        }

        return commonFriends;
    }
}
