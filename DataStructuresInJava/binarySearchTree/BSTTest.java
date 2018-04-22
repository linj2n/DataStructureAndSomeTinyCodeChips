package binarySearchTree;
import java.util.Arrays;

public class BSTTest {
    public static BST constructBST(int[] a) {
        BST<Integer,Integer> bst = new BST<>();
        for (int e: a) {
            bst.put(e,e);
        }
        return bst;
    }
    public static  void testForPutMethod() {
        System.out.println("test for Put method.....");
        testForPutMethod(new int[] {0,1,2});
        testForPutMethod(new int[] {2,1,3});
        testForPutMethod(new int[] {3,2,1});
        System.out.println("........................");
    }
    private static void testForPutMethod(int[] a) {
        System.out.print("Array: { ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) System.out.print(",");
        }
        System.out.println(" }");
        BST<Integer,Integer> bst = constructBST(a);
        System.out.println("Print BST by inorder: { " + bst.toString() +" }");
        System.out.println("------------");
    }
    public static void main (String[] args) {
        testForPutMethod();
    }
}
