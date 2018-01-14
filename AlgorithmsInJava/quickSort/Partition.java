package quickSort;

public class Partition
{
	public static void exch(Comparable[] a, int i, int j)
	{
		Comparable temp = a[i]; a[i] = a[j]; a[j] = temp;
	}
	// using bidirectional iterator
	public static int twoWayPartition(Comparable[] a, int lo, int hi)
	{
		if (lo == hi) return lo;
		if (hi - lo == 1)
		{
			if (a[lo].compareTo(a[hi]) > 0) 
			{	// a[lo] > a[hi] 
				exch(a,lo,hi); return hi;
			}else
				return lo;
		}

		Comparable pValue = a[lo];
		int i = lo + 1, j = hi;	// as the pivot element, do not alter a[lo].
		while(true)
		{
			while (true)
			{
				if (i >= hi || a[i].compareTo(pValue) > 0)	// a[i] > pValue
					break;
				else
					++i;
			}
			while (true)
			{
				if (j <= lo || a[j].compareTo(pValue) < 0)	// a[j] < pValue
					break;
				else
					--j;
			}
			if (i >= j)
				break;
			else
				exch(a,i,j);
		}
		exch(a,lo,j);	// updates the location of pivot element.
		return j;
	}
	// using forward iterator
	public static int oneWayPartion(Comparable[] a, int lo, int hi)
	{
		return lo;
	}
}