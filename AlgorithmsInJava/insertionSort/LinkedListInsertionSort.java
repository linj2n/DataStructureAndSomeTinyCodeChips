package AlgorithmsInJava.insertionSort;
import AlgorithmsInJava.dataStructures.LinkedListNode;
import java.util.*;
/**
 * Definition for singly-linked list.
 * public class LinkedListNode {
 *     Comparable val;
 *     LinkedListNode next;
 *     LinkedListNode(Comparable x) { val = x; }
 * }
 */
public class LinkedListInsertionSort {
    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }
    public static LinkedListNode sort(LinkedListNode head) {
        if (head == null || head.next == null) return head;

        LinkedListNode dummyHead = new LinkedListNode(null);
        dummyHead.next = head;
        LinkedListNode prevUnsortedHead = head;

        while (prevUnsortedHead != null && prevUnsortedHead.next != null) {
            if (less(prevUnsortedHead.val, prevUnsortedHead.next.val)) {
                prevUnsortedHead = prevUnsortedHead.next;
            } else {
                LinkedListNode unsortedHead = prevUnsortedHead.next;
                prevUnsortedHead.next = prevUnsortedHead.next.next;

                // find insertion location
                LinkedListNode walkNode = dummyHead; 
                while (walkNode.next != null && less(walkNode.next.val,unsortedHead.val)) 
                    walkNode = walkNode.next;

                // insert node
                unsortedHead.next = walkNode.next;
                walkNode.next = unsortedHead;
            }
        }
        return dummyHead.next;
    }
}