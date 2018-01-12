package selectionSort;

import java.util.*;
public class SelectionSort
{
	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	private static void exch(Comparable[] a, int i, int j)
	{
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
	public static void show(Comparable[] a)
	{
		for (Comparable e: a)
			System.out.print(e.toString() + " ");
		System.out.println();
	}
	public static void sort(Comparable[] a)
	{
		int size = a.length;
		for (int i = 0; i < size; i++)
		{
			int minIndex = i;
			for (int j = i + 1; j < size; j++)
			{
				if (less(a[j],a[minIndex]))
					minIndex = j;
			}
			exch(a,minIndex,i);
		}
	}
}