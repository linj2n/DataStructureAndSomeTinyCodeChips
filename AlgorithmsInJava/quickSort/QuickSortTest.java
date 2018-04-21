package AlgorithmsInJava.quickSort;
public class QuickSortTest
{
	// some test-functions and print-functions
	private static void testAndPrint(Integer a[], int lo, int hi)
	{
		System.out.println("---------------------");
		System.out.print("before: ");
		for (int e: a)
			System.out.print(e + " ");
		System.out.println(" ");
		QuickSort.sort(a,lo,hi);

		System.out.print("after: ");
		for (int e: a)
			System.out.print(e + " ");
		System.out.println(" ");
	}
	public static void test0()
	{
		Integer []t = {1,2,3,4,5,6,7};
		testAndPrint(t,0,t.length - 1);
	}
	public static void test1()
	{
		Integer []t = {7,6,5,4,3,2,1};
		testAndPrint(t,0,t.length - 1);
	}
	public static void test2()
	{
		Integer []t = {5,4,7,6,3,2,1,8};	
		testAndPrint(t,0,t.length - 1);
	}
	public static void test3()
	{
		Integer []t = {7,7,7,7};	
		testAndPrint(t,0,t.length - 1);
	}
	public static void test4()
	{
		Integer []t = {7,7};
		testAndPrint(t,0,t.length - 1);
	}
	public static void test5()
	{
		Integer []t = {7};
		testAndPrint(t,0,t.length - 1);
	}
	public static void test6()
	{
		Integer []t = {54,35,48,36,27,12,44,44,8,14,26,17,28};
		testAndPrint(t,0,t.length - 1);
	}



	public static void main(String[] args) 
	{
		QuickSortTest.test0();
		QuickSortTest.test1();
		QuickSortTest.test2();
		QuickSortTest.test3();
		QuickSortTest.test4();
		QuickSortTest.test5();
		QuickSortTest.test6();

	}
}