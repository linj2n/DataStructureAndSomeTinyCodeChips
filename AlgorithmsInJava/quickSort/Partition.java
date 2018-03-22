package AlgorithmsInJava.quickSort;

public class Partition
{
    public static void exch(Comparable[] a, int i, int j)
    {
        Comparable temp = a[i]; a[i] = a[j]; a[j] = temp;
    }
    public static int threeWayPartition(Comparable[] a, int lo, int hi)
    {
        int i = lo,curr = lo + 1, j = hi;
        Comparable pValue = a[lo];
        while (curr <= j)
        {
            if (a[curr].compareTo(pValue) > 0)
                exch(a,curr,j--);
            else if (a[curr].compareTo(pValue) < 0)
                exch(a,curr++,i++);
            else
                ++curr;
       	}
        return i;
    }
    // using bidirectional iterator
    public static int twoWayPartition(Comparable[] a, int lo, int hi)
    {
        // if (lo == hi) return lo;
        // if (hi - lo == 1)
        // {
        //     if (a[lo].compareTo(a[hi]) > 0) 
        //     {   // a[lo] > a[hi] 
        //         exch(a,lo,hi); return hi;
        //     }else
        //         return lo;
        // }

        // Comparable pValue = a[lo];
        // int i = lo + 1, j = hi; // as the pivot element, do not alter a[lo].
        // while(true)
        // {
        //     while (true)
        //     {
        //         if (i >= hi || a[i].compareTo(pValue) > 0)  // a[i] > pValue
        //             break;
        //         else
        //             ++i;
        //     }
        //     while (true)
        //     {
        //         if (j <= lo || a[j].compareTo(pValue) < 0)  // a[j] < pValue
        //             break;
        //         else
        //             --j;
        //     }
        //     if (i >= j)
        //         break;
        //     else
        //         exch(a,i,j);
        // }
        // exch(a,lo,j);   // updates the location of pivot element.
        // return j;
        if (lo >= hi) return lo;
        Comparable pivot = a[lo];
        int i = lo,j = hi;
        while (i < j) {
            while (i < j && a[j].compareTo(pivot) >= 0 ) { j--; }
            if (i < j) { a[i] = a[j]; }
            while (i < j && a[i].compareTo(pivot) <= 0) { i++; }
            if (i < j) { a[j] = a[i]; }
        }
        a[i] = pivot;
        return i;

    }
    // using forward iterator
    public static int oneWayPartition(Comparable[] a, int lo, int hi)
    {
        int i = lo,j = lo + 1;
        Comparable pValue = a[lo];
        while (j <= hi)
        {
            if (a[j].compareTo(pValue) < 0)
                exch(a,++i,j);
            ++j;
        }
        exch(a,lo,i);
        return i;
    }
}
