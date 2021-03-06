package AlgorithmsInJava.insertionSort;
import java.util.*;

public class ArrayInsertionSort {
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	private static void exch(Comparable[] a, int i, int j) {
		if (i == j) return ;
		Comparable temp = a[i]; a[i] = a[j]; a[j] = temp;
	}
	public static boolean isSorted(Comparable[] a)
	{
		for (int i = 1; i < a.length; i++)
			if (less(a[i],a[i - 1]))
				return false;
		return true;
	}
	public static void sort(Comparable[] a)
	{
		int size = a.length;
		for (int i = 1; i < size; i++) {
			for (int j = i; j > 0 && less(a[j],a[j - 1]); j--) {
				exch(a,j-1,j);
			}
		}
	}
}