package mergeSort;
import java.util.*;

public class mergeSort
{
	public static void merge(Comparable[] a, int lo, int mid, int hi)
	{
		Comparable[] aux1 = new Comparable[mid - lo + 1];
		Comparable[] aux2 = new Comparable[hi - mid];
		for (int i = lo; i <= mid; i++)
		{
			aux1[i] = a[i];
		}
		for (int j = mid + 1; j <= hi; j++)
		{
			aux2[j] = a[j];
		}
		while ()

	}
	public static void sort(Comparable[] a)
	{
		//aux = new Comparable[a.length];
		sort(Comparable[] a, 0, a.length - 1);
	}
	public static void sort(Comparable[] a, int lo, int hi)
	{
		if (lo < hi)
		{
			int mid = (lo + hi) / 2;
			sort(a,0,mid);
			sort(a,mid + 1, hi);
			merge(a,lo,mid,hi);
		}
	}
}