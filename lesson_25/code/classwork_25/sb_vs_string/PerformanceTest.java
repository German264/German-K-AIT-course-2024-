package classwork_25.sb_vs_string;

// 100 000 сказать "Meow"
// String vs StringBuilderAppl

public class PerformanceTest {

    private static final int N_ITERATION = 100_000;
    private static final String WORD = "Meow";

    public static void main(String[] args) {

        //String
        long t1 = System.currentTimeMillis(); // start time
        String str = "";
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis(); // stop time
        System.out.println("Time String = " + (t2-t1));

        // StringBuilderAppl
        t1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N_ITERATION; i++) {
            sb = sb.append(WORD);
        }
        t2 = System.currentTimeMillis(); // stop time
        System.out.println("Time StringBuilder = " + (t2-t1));
    }
}