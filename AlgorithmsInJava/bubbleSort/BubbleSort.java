package AlgorithmsInJava.bubbleSort;
public class BubbleSort {
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	private static void exch(Comparable[] a, int i, int j) {
		if (i == j) return ;
		Comparable temp = a[i]; a[i] = a[j]; a[j] = temp;
	}
	public static void sort(Comparable[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (less(a[j+1],a[j]))
					exch(a,j,j+1);
			}
		}
	}
}