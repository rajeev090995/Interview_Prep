package ProblemSolvingInterviewRajeev.Searching;

public class Program6 {
    static int sqRootFloor(int x)
    {
        int low = 1, high = x, ans = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            int mSq = mid * mid;

            if(mSq == x)
                return mid;
            else if(mSq > x)
                high = mid - 1;
            else
            {
                low = mid + 1;
                ans = mid;
            }
        }

        return ans;
    }

    static int sqRootFloorMethod(int x)
    {
        int i = 1;

        while(i * i <= x)
            i++;

        return i - 1;
    }


    public static void main(String args[])
    {

        System.out.println(sqRootFloor(10));

    }
}
