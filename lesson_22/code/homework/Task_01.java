package homework;

public class Task_01 {

    public static int[] fillArray(int a, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            a[i] = a + 1;

        }
        return res;
    }
}
