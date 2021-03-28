package ProblemSolvingInterviewRajeev.String;

public class Program9 {
    public static void reverseApproach1(String s){
        String s2 = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            s2 = s2 + s.charAt(i);
        }

        System.out.println(s2);
    }

    public static void approach2(String input){
        char[] tempArray = input.toCharArray();
        int left, right = 0;
        right = tempArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }

        for (char c : tempArray)
            System.out.print(c);
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "HELLO";
        //reverseApproach1(s);
        approach2(s);
    }
}
