package AlgorithmsInJava.bubbleSort;
public class BubbleSortTest {
	    // some test-functions and print-functions
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    private static void testAndPrint(Comparable a[])
    {
        System.out.println("---------------------");
        System.out.print("before: ");
        show(a);
        BubbleSort.sort(a);

        System.out.print("after: ");
        show(a);
        System.out.println(isSorted(a));
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
            System.out.print(e.toString() +  " ");
        System.out.println();
    }
    public static void test0()
    {
        Integer []t = {1,2,3,4,5,6,7};
        testAndPrint(t);
    }
    public static void test1()
    {
        Integer []t = {7,6,5,4,3,2,1};
        testAndPrint(t);
    }
    public static void test2()
    {
        Integer []t = {5,4,7,6,3,2,1,8};    
        testAndPrint(t);
    }
    public static void test3()
    {
        Integer []t = {7,7,7,7};    
        testAndPrint(t);
    }
    public static void test4()
    {
        Integer []t = {7,7};
        testAndPrint(t);
    }
    public static void test5()
    {
        Integer []t = {7};
        testAndPrint(t);
    }

    public static void main(String[] args) 
    {
        BubbleSortTest.test0();
        BubbleSortTest.test1();
        BubbleSortTest.test2();
        BubbleSortTest.test3();
        BubbleSortTest.test4();
        BubbleSortTest.test5();
    }
}
