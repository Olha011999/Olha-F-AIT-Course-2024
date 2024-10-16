package classwork_25.regex_validator.sb_versus_string;

public class PerformanceTest {
//100 000 сказать "Meuw"
    // String vs Stringbuilder
    private static final int ITERATION = 100_000;
    private static final String WORD = "Meuw";

    public static void main(String[] args) {

        //String
        long t1 = System.currentTimeMillis();//start time
        String string = "";// пустая строка
        for (int i = 0; i < ITERATION; i++) {
            string = string + WORD;
        }
        long t2 = System.currentTimeMillis();//stop time
        System.out.println("Time String = "+ (t2 - t1));

        //Stringbuilder
        t1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < ITERATION; i++) {
            stringBuilder = stringBuilder.append(WORD);
        }
        System.out.println("Time stringBuilder = "+ (t2 - t1));
    }
}
