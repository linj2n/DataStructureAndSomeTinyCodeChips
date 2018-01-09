import java.util.*;

public class Quick
{   
    // [lo..hi] 
    private static void sort(int[] a,int lo, int hi)
    {
        if (hi <= lo)   return;
        int j = hoarePartition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
    // lo 作为pivot,对a原地划分重排
    private static int hoarePartition(int[] a, int lo, int hi)
    {
        int pValue = a[lo];
        int i = lo + 1, j = hi;
        while (true)
        {
            while (i < hi && a[i] < pValue) 
            {
                i = i + 1; 
            }
            while (j > lo && a[j] > pValue)
            {
                j = j - 1;
            }
            if (i >= j) break;
            else exchange(a,i,j);
        }
        exchange(a,lo,j);
        return j;
    }
    // lo 作为pivot,对a原地划分重排
    private static int lomutoPartition(int[] a, int lo, int hi)
    {
        int s = lo;
        int pValue = a[lo];
        for (int i = lo + 1; i <= hi; i++)
        {
            if (a[i] < pValue)
            {
                ++s; exchange(a, i, s);
            }
        }
        exchange(a,lo,s);
        return s;
    }
    private static void exchange(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
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