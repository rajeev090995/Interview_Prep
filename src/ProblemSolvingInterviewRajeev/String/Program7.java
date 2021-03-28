package ProblemSolvingInterviewRajeev.String;
//Given a string, the task is to find the first character (whose leftmost appearance is first) that repeats.


public class Program7 {

    static final int CHAR=256;

    static int efficient(String str)
    {
        boolean[] visited=new boolean[CHAR]; // by default false
        int res=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)])
                res=i;
            else
                visited[str.charAt(i)]=true;
        }

        return res;

    }

    static int leftMost1(String str)
    {
        int[] count=new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]>1)return i;
        }
        return -1;
    }

    static int leftMost(String str)
    {
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {   String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }
}
