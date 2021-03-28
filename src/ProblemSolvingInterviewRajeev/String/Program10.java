package ProblemSolvingInterviewRajeev.String;

import java.util.HashMap;
import java.util.Map;

public class Program10 {
    static final int NO_OF_CHARS = 256;

    /* Fills count array with
       frequency of characters */
    static void fillCharCounts(String str,
                               int[] count)
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }

    /* Print duplicates present
      in the passed string */
    static void printDups(String str)
    {
        // Create an array of size
        // 256 and fill count of
        // every character in it
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str, count);

        for (int i = 0; i < NO_OF_CHARS; i++)
            if (count[i] > 1)
                System.out.println((char)(i) +
                        ", count = " + count[i]);
    }

    static void printDups2(String str)
    {
        HashMap<Character, Integer> count = new HashMap<>();
        /*Store duplicates present
        in the passed string */
        for (int i = 0; i < str.length(); i++) {
            if (!count.containsKey(str.charAt(i)))
                count.put(str.charAt(i), 1);
            else
                count.put(str.charAt(i),
                        count.get(str.charAt(i)) + 1);
        }

        /*Print duplicates in sorted order*/
        for (Map.Entry mapElement : count.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());

            if (value > 1)
                System.out.println(key
                        + ", count = " + value);
        }
    }

    // Driver Method
    public static void main(String[] args)
    {
        String str = "test string";
        printDups(str);
        printDups2(str);

    }
}
