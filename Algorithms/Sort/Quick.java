import java.util.*;

public class Quick
{	
	private static void sort(int[] a,int lo, int hi)
	{
		if (hi <= lo)	return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	private static int partition(int[] a, int lo, int hi)
	{
		int i = lo, j = hi + 1;
		int v = a[lo];
		while (true)
		{
			while (a[++i] < v) if (i == hi) break;
			while (v < a[--j]) if (j == lo) break;
			if (i >= j) break;
			int temp = a[i]; a[i] = a[j]; a[j] = temp;
		}
		int temp = a[lo]; a[lo] = a[j]; a[j] = temp;
		return j;
	}
	public static void main(String [] args)
	{
		int [] a = {13,19,9,5,12,8,7,4,11,2,6,21};
		Quick.sort(a,0, 11);
		for (int i: a)
			System.out.print(i + " ");
		System.out.println("");

	}
}