package AlgorithmsInJava.quick3WaySort;
public class Quick3WaySort
{
    public static void exch(Comparable[] a, int i, int j)
    {
        if (i == j || i > a.length || j > a.length || i < 0 || j < 0) return;
        Comparable temp = a[i]; a[i] = a[j]; a[j] = temp;
    }
    public static void sort(Comparable[] a)
    {
        sort(a,0,a.length - 1);
    }
    public static void sort(Comparable[] a,int lo, int hi)
    {
        if (hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable pValue = a[lo];
        while (i <= gt)
        {   
            int crs = a[i].compareTo(pValue);
            if (crs < 0) exch(a,i,gt--);
            else if (crs > 0) exch(a, i,lt++);
            else i++;
        }
        sort(a,lo,lt - 1);
        sort(a,gt+1,hi);
    }
}