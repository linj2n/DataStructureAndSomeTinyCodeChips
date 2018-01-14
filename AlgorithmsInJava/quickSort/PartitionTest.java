package quickSort;
import static java.lang.System.*;
public class PartitionTest
{
	public static boolean isCrrect(int pivot,Comparable [] a)
	{
		int lo = 0, hi = a.length - 1;
		if (pivot < lo || pivot > a.length - 1) return false;
		Comparable pValue = a[pivot];
		for (int i = pivot; i >= lo; i--)
		{
			if (a[i].compareTo(pValue) > 0) return false;
		}
		for (int j = pivot; j <= hi; j++)
		{
			if (a[j].compareTo(pValue) < 0) return false;
		}
		return true;
	}
	public static void testAndShow(Comparable[] a)
	{
		int lo = 0, hi = a.length - 1;
		Comparable[] t1 = new Comparable[a.length];
		Comparable[] t2 = new Comparable[a.length];
		for (int i = lo; i <= hi; i++)
		{
			t1[i] = a[i]; t2[i] = a[i];
		}
		out.println("---------------------------------");
		out.println("before: ");
		for (Comparable e: a)
			out.print(e.toString() + " ");
		out.println();

		out.println("Using bidirectionalInteratorPartition:");
		// 
		int pivot = Partition.twoWayPartition(t1,0,t1.length -1);
		out.println("p= " + pivot + ",pValue= " + t1[pivot] + ",res= " + isCrrect(pivot,t1));
		//
		out.println("Show: ");
		for (Comparable e: t1)
			out.print(e.toString() + " ");
		out.println();
		out.println("---------------------------------");
	}
	public static void test0()
	{
		Integer[] test = {5,5};
		testAndShow(test);
	}
	public static void test1()
	{
		Integer[] test = {5,6};
		testAndShow(test);
	}
	public static void test2()
	{
		Integer[] test = {5,3};
		testAndShow(test);
	}
	public static void test3()
	{
		Integer[] test = {5,5,5};
		testAndShow(test);
	}
	public static void test4()
	{
		Integer[] test = {5,3,3};
		testAndShow(test);
	}
	public static void test5()
	{
		Integer[] test = {5,6,6};
		testAndShow(test);
	}
	public static void test6()
	{
		Integer[] test = {5,6,3};
		testAndShow(test);
	}
	public static void test7()
	{
		Integer[] test = {5,3,6};
		testAndShow(test);
	}
	public static void test8()
	{
		Integer[] test = {5,3,4,6,7};
		testAndShow(test);
	}
	public static void test9()
	{
		Integer[] test = {5,6,7,3,4};
		testAndShow(test);
	}
	public static void test10()
	{
		Integer[] test = {5,6,7,3,4,5};
		testAndShow(test);
	}
	public static void main(String[] args) {
		test0(); test1(); test2(); test3(); test4(); test5(); 
		test6(); test7(); test8(); test9(); test10();
	}
}