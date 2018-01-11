package mergeSort;
import java.util.*;

public class MergeSort
{
	public static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	public static void merge(Comparable[] a, int lo, int mid, int hi)
	{
		Comparable[] aux1 = new Comparable[mid - lo + 1];
		Comparable[] aux2 = new Comparable[hi - mid];
		int k = lo - 1;
		for (int i = 0; i < mid - lo + 1; i++)
		{
			aux1[i] = a[++k];
		}
		for (int j = 0; j < hi - mid; j++)
		{
			aux2[j] = a[++k];
		}

		int i = 0, j = 0;
		k = lo - 1;
		while (i < mid - lo + 1 && j < hi - mid)
		{
			if (less(aux1[i],aux2[j]))
			{
				a[++k] = aux1[i++];
			}else{
				a[++k] = aux2[j++];
			}
		}

		while (i < mid - lo + 1)
		{
			a[++k] = aux1[i++];
		}
		while (j < hi - mid)
		{
			a[++k] = aux2[j++];
		}

	}
	public static void sort(Comparable[] a)
	{
		//aux = new Comparable[a.length];
		sort(a, 0, a.length - 1);
	}
	public static void sort(Comparable[] a, int lo, int hi)
	{
		if (lo < hi)
		{
			int mid = lo + (hi - lo) / 2;
			sort(a,lo,mid);
			sort(a,mid + 1, hi);
			merge(a,lo,mid,hi);
		}
	}
	public static void main(String[] args) 
	{
		Integer[] a = {6,5,4,3,2,1};
		MergeSort.sort(a);
		for (int e: a)
			System.out.print(e + " ");
		System.out.println();
	}
}