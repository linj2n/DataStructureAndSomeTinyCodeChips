// note:
// 1. line 18, 检查 lo 是否越界
// 2. lo, hi 的更新
package AlgorithmsInJava.binarySearch;
public class BinarySearch {
    public static int search(Comparable[] a, Comparable key) {
        return search(a,0,a.length - 1,key);
    }
    public static int search(Comparable[] a, int beg, int end, Comparable key) {
        int lo = beg, hi = end - 1;
        if (lo > hi || a == null) return -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = a[mid].compareTo(key);
            if (cmp < 0) lo = mid + 1;
            else if (cmp > 0) hi = mid - 1;
            else return mid;
        }
        return lo;
    }
}
