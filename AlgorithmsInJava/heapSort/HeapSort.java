package AlgorithmsInJava.heapSort;
import java.util.*;
public class HeapSort {
    private static void exch(Comparable[] a, int i, int j) {
        if (i == j) return;
        try {
            Comparable temp = a[i]; a[i] = a[j]; a[j] = temp;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
    private static void maxHeapify(Comparable[] a, int root, int length) {
        if (root >= length) return;
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        if (left < length && less(a[largest],a[left])) {
            largest = left;
        }
        if (right < length && less(a[largest],a[right])) {
            largest = right;
        }
        if (largest != root) {
            exch(a,largest,root);
            maxHeapify(a,largest,length);
        }
    }
    private static void buildUpHeap(Comparable[] a,int length) {
        if (length < 1) return ;
        int n = (length - 2) / 2;   // get the index of the last parent node;
        while (n >= 0) {
            maxHeapify(a,n,length);
            --n;
        }
    }
    public static void sort(Comparable[] a) {
        buildUpHeap(a,a.length);
        for (int last = a.length - 1; last > 0; last--) {
            exch(a,0,last);
            maxHeapify(a,0,last);   // set the length by the index of the last node;
        }
    }
    public static void main(String[] args) {
        Integer[] a = new Integer[]{5,4,7,6,3,2,1,8};
        System.out.println("Before: ");
        for (Integer e: a) {
            System.out.print(e + " ");
        }
        // buildUpHeap(a,a.length);
        HeapSort.sort(a);
        System.out.println();
        for (Integer e: a) {
            System.out.print(e + " ");
        }
    }
}
