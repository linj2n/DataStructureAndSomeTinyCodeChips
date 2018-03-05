// 输入一个链表，从尾到头打印链表每个节点的值。
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.*;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayDeque<Integer> stack = new ArrayDeque();
        ArrayList<Integer> res = new ArrayList();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            res.add(stack.removeLast());
        }
        return res;
    }
}