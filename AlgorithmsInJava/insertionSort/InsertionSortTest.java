package insertionSort;
public class InsertionSortTest
{
    // some test-functions and print-functions
    private static void testAndPrint(Comparable a[])
    {
        System.out.println("---------------------");
        System.out.print("before: ");
        InsertionSort.show(a);
        InsertionSort.sort(a);

        System.out.print("after: ");
        InsertionSort.show(a);
        System.out.println(InsertionSort.isSorted(a));
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
        InsertionSortTest.test0();
        InsertionSortTest.test1();
        InsertionSortTest.test2();
        InsertionSortTest.test3();
        InsertionSortTest.test4();
        InsertionSortTest.test5();
    }
}