package ProblemSolvingInterviewRajeev.String;

/*Check if string is subsequence of other
I/P - s1 = ABCD s2= AD O/P - true
I/P - s1 = ABCDE s2= AED O/P - false
 */

import java.util.Scanner;

public class Program5 {
    static boolean isSubSeq(String s1, String s2, int n, int m){ // Time - o(n+m) Space - o(1)
        int j = 0;
        for(int i = 0; i < n && j < m; i++){
            if(s1.charAt(i) == s2.charAt(j))
                j++;
        }

        return j == m;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();

        System.out.println(isSubSeq(s1, s2, n, m));
    }
}
