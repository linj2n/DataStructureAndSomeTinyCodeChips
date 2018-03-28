package AlgorithmsInJava.countingSort;
import java.util.*;
public class CountingSort {
    public static void sort(int[]a, int lo, int hi) {
        int[] temp = new int[a.length]; 
        int[] counts = new int[hi - lo + 1];     
        for (int e: a) {
             ++ counts[e - lo];
        }
        for (int i = 1; i < hi - lo + 1; i++) {
            counts[i] += counts[i-1];
        }
        for (int j = a.length-1; j >= 0; j--) {
            temp[--counts[a[j] - lo]] = a[j];
        }
        for (int k = 0; k < a.length; k++) {
            a[k] = temp[k];
        }
    }
}
