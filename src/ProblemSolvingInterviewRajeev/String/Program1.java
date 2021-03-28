package ProblemSolvingInterviewRajeev.String;

//Program to print frequency of character in sorted order

public class Program1 {
    public static void main(String[] args){
        String str="geeksforgeeks";
        int[] count=new int[26];
        for(int i=0;i<str.length();i++){ // individual char as index
            count[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a')+" "+count[i]);
            }
        }
    }
}
