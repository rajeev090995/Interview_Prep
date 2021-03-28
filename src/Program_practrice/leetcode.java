package Program_practrice;

public class leetcode {


    public static int[] twoSum(int[] nums, int target) {

        int array1[] = new int[2];
        int i = 0, j = 1;
        while (i < nums.length) {

            while (j < nums.length) {

                if (nums[i] + nums[j] == target) {

                    System.out.println(" Number of array are:- " + nums[i] + " and " + nums[j]);
                    array1[0] = i;
                    array1[1] = j;


                }

                j++;

            }
            j--;
            i++;

        }


        return array1;

    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int k = 0;

        double result = 0.0;

        int[] array1 = new int[nums1.length + nums2.length];

        int length = array1.length;

        if (nums1.length != 0 || nums2.length != 0) {

            while (i < nums1.length && j < nums2.length) {

                if (nums1[i] < nums2[j]) {
                    array1[k] = nums1[i];
                    k++;
                    i++;
                } else {

                    array1[k] = nums2[j];
                    k++;
                    j++;
                }

            }

            while (i < nums1.length) {
                array1[k] = nums1[i];
                i++;
                k++;
            }
            while (j < nums2.length) {
                array1[k] = nums2[j];
                j++;
                k++;
            }


            if (array1.length % 2 == 0) {

                result = array1[length / 2 - 1] + array1[length / 2];

                result = result / 2;
            } else {

                result = array1[length / 2];
            }
        } else {
            System.out.println(" Empty Array");
        }


        System.out.println(result);
        return result;


    }

    public static int maxArea(int[] height) {

        int max = 0;
        int secondmax = 0;
        int count = 0;
        int secondcount = 0;
        int diff = 0;

        for (int i = 0; i < height.length; i++) {


            if (height[i] > max) {
                secondmax = max;
                max = height[i];
                count = i;
            }

            if (height[i] < max && height[i] > secondmax)

                secondmax = height[i];

            secondcount = i;

        }
        System.out.println("Max Position:- " + count);
        System.out.println("SecondMax Position:- " + secondcount);

        System.out.println(max + " max value " + secondmax + " secondmax value");
        if (secondcount > 1) {
            diff = secondcount - count;
         System.out.print(secondmax * diff);
         return secondmax * diff;

        } else if (secondmax == 0 && max > 1) {

            System.out.println(0);
            return 0;

        } else if (max == 1) {

            System.out.println(1);
            return 1;
        } else {
            System.out.println(secondmax);
            return secondmax;
        }
    }


    public static void main(String[] args) {

        int num[] = {3, 3};
        int arr1[] = {2};
        int arr2[] = {};
       int height[] ={1,8,6,2,5,4,8,3,7};

//        twoSum(num, 6);
//        findMedianSortedArrays(arr1, arr2);
        maxArea(height);

    }


}
