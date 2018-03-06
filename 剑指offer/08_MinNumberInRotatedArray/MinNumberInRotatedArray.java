import java.util.*;
public class MinNumberInRotatedArray {
    public static int minNumberInRotatedArray(int [] array) {
        if (array == null) return 0;
        int beg = 0,end = array.length - 1,mid;
        while (beg != end) {
            mid = (end + beg) / 2;
            // special condition: 
            if (array[beg] == array[end] && array[beg] == array[mid]) {
                int minIndex = beg;
                while (beg != end) { 
                    if (array[minIndex] > array[beg]) minIndex = beg; beg++;
                }
                return array[minIndex];
            }
            
            // continue binary-searching
            if (array[beg] < array[end]) end = mid;
            else if (array[beg] > array[end]) {
                if (array[beg] < array[mid]) beg = mid;
                else if (array[beg] > array[mid]) end = mid;
                else beg = end;
            }
        }
        return array[beg];
    }
    public static void test(int[] nums) {
        System.out.print("Nums[]: ");
        if (nums != null) {
            for (int i = 0; i < nums.length; i ++) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
        int minElement = MinNumberInRotatedArray.minNumberInRotatedArray(nums);
        System.out.println("minElement= " + minElement + ".");
    }
    public static void main(String[] args) {
        int[] test1 = { 3, 4, 5, 1, 2 };        
        test(test1);
        int[] test2 = { 3, 4, 5, 1, 1, 2 };        
        test(test2);
        int[] test3 = { 3, 4, 5, 1, 2, 2 };        
        test(test3);
        int[] test4 = { 1, 0, 1, 1, 1 };
        test(test4);
        int[] test5 = { 1, 2, 3, 4, 5 };
        test(test5);
        int[] test6 = { 2 };
        test(test6);
        test(null);

    }
};
