package quickSort;

public class QuickSortTest
{
	// some test-functions and print-functions
	private static void testAndPrint(int a[], int lo, int hi)
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
		int []t = {1,2,3,4,5,6,7};
		testAndPrint(t,0,t.length - 1);
	}
	public static void test1()
	{
		int []t = {7,6,5,4,3,2,1};
		testAndPrint(t,0,t.length - 1);
	}
	public static void test2()
	{
		int []t = {5,4,7,6,3,2,1,8};	
		testAndPrint(t,0,t.length - 1);
	}
	public static void test3()
	{
		int []t = {7,7,7,7};	
		testAndPrint(t,0,t.length - 1);
	}
	public static void test4()
	{
		int []t = {7,7};
		testAndPrint(t,0,t.length - 1);
	}

	public static void main(String[] args) 
	{
		QuickSortTest.test0();
		QuickSortTest.test1();
		QuickSortTest.test2();
		QuickSortTest.test3();
		QuickSortTest.test4();
	}
}