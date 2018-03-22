package AlgorithmsInJava.insertionSort;
import AlgorithmsInJava.dataStructures.LinkedListNode;
import java.util.*;
public class LinkedListInsertionSortTest {
	public  static void print(LinkedListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
	public void exch(LinkedListNode head) {
		head = null;
	}
	public static void testAndPrint(LinkedListNode head) {
		System.out.println("----------");
		System.out.print("before: ");
		print(head);
		// insertion sort
		head = LinkedListInsertionSort.sort(head);
		System.out.print("after: ");
		print(head);
		System.out.println();
	}
    public static LinkedListNode convertToList(Comparable[] a) {
        LinkedListNode dummyHead = new LinkedListNode(null);
        LinkedListNode walkNode = dummyHead;
        for (Comparable e: a) {
            LinkedListNode tempNode = new LinkedListNode(e); 
            walkNode.next = tempNode;
            walkNode = walkNode.next;
        }
        return dummyHead.next;
    } 
	public static void test0() {
        Integer []t = {1,2,3,4,5,6,7};
        LinkedListNode head = convertToList(t);
        testAndPrint(head);
    }
    public static void test1() {
        Integer []t = {7,6,5,4,3,2,1};
        LinkedListNode head = convertToList(t);
        testAndPrint(head);
    }
    public  static void test2() {
        Integer []t = {5,4,7,6,3,2,1,8};  
        LinkedListNode head = convertToList(t);
        testAndPrint(head);
    }
    public static void test3() {
        Integer []t = {7,7,7,7}; 
        LinkedListNode head = convertToList(t);   
        testAndPrint(head);
    }
    public static void test4() {
        Integer []t = {7,7};
        LinkedListNode head = convertToList(t);
        testAndPrint(head);
    }
    public  static void test5() {
        Integer []t = {7};
        LinkedListNode head = convertToList(t);
        testAndPrint(head);
    }
    public static void test6() {
        Integer []t = {};
        LinkedListNode head = convertToList(t);
        testAndPrint(head);
    }
  
	public static void main(String[] args) {
		LinkedListInsertionSortTest.test0();
		LinkedListInsertionSortTest.test1();
		LinkedListInsertionSortTest.test2();
		LinkedListInsertionSortTest.test3();
		LinkedListInsertionSortTest.test4();
		LinkedListInsertionSortTest.test5();
		LinkedListInsertionSortTest.test6();
		// ListInsertionSortTest.test0();

	}
}