package quickSort;
public class QuickSort
{
	public static void exch(int[] a, int i, int j)
	{
		if (i == j || i > a.length || j > a.length || i < 0 || j < 0) return;
		int temp = a[i]; a[i] = a[j]; a[j] = temp;
	}
	public static int hoarePartition(int[] a, int lo, int hi)
	{
		int pValue = a[lo];
		int i = lo + 1, j = hi;
		while (true)
		{
			while (i < hi && a[i] <= pValue) {	++i; }
			while (j > lo && a[j] >= pValue) {	--j; }
			if (i >= j)
			{
				break;
			}
			else{
				exch(a,i,j);
			}
		}
		exch(a,lo,j);
		return j;	
	}
	public static int lomutoPartition(int[] a, int lo, int hi)
	{
		int pValue = a[lo];
		int s = lo, i = lo + 1;
		while (i <= hi)
		{
			if (a[i] < pValue)
			{
				++s; exch(a,s,i);
			}
			++i;
		}
		exch(a,lo,s);
		return s;
	}
	public static void sort(int[] a, int lo, int hi)
	{
		if (lo >= hi) return;
		int p = hoarePartition(a, lo, hi);
		sort(a,lo,p-1);
		sort(a,p+1,hi);
	}

}