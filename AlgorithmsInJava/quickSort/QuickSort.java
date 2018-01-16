package quickSort;
public class QuickSort
{
    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }
    private static boolean lessOrEqual(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0 || v.compareTo(w) ==0;
    }
    public static void exch(Comparable[] a, int i, int j)
    {
        if (i == j || i > a.length || j > a.length || i < 0 || j < 0) return;
        Comparable temp = a[i]; a[i] = a[j]; a[j] = temp;
    }
    public static int hoarePartition1(Comparable[] a, int lo, int hi)
    {
        Comparable pValue = a[lo];
        int i = lo, j = hi + 1;
        while (true)
        {
            while (less(a[++i],pValue)) { if (i == hi) break;}
            while (less(pValue,a[--j])) { if (j == lo) break;}
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
    public static int hoarePartition2(Comparable[] a, int lo, int hi)
    {
        Comparable pValue = a[lo];
        while (lo < hi)
        {
            while ((lo < hi) && (lessOrEqual(pValue,a[hi])))
                hi --;
            exch(a,lo,hi);
            while ((lo < hi) && (lessOrEqual(a[lo],pValue)))
                lo ++;
            exch(a,lo,hi);
        }
        return lo;
    }
    public static int lomutoPartition(Comparable[] a, int lo, int hi)
    {
        Comparable pValue = a[lo];
        int s = lo, i = lo + 1;
        while (i <= hi)
        {
            if (less(a[i],pValue))
            {
                ++s; exch(a,s,i);
            }
            ++i;
        }
        exch(a,lo,s);
        return s;
    }
    public static void sort(Comparable[] a, int lo, int hi)
    {
        if (lo >= hi) return;
        int p = Partition.threeWayPartition(a, lo, hi);
        sort(a,lo,p-1);
        sort(a,p+1,hi);
    }

}