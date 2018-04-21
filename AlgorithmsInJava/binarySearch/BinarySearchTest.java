package AlgorithmsInJava.binarySearch;
public class BinarySearchTest {
    public static boolean resultForTest(Comparable[] a, Comparable key) {
        int target = BinarySearch.search(a,key);
        return target >= 0 && target < a.length && key.equals(a[target]);
    }
    public static void test(Comparable[] a, Comparable key) {
        System.out.print("test: { ");
        for (int i = 0; i < a.length; i ++) {
            System.out.print(a[i].toString());
            if (i != a.length - 1) 
                System.out.print(",");
        }
        System.out.print(" }");
        System.out.println("key: " + key.toString());
        System.out.println("result= " + resultForTest(a,key));
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        test(new Integer[]{
        },0);
        test(new Integer[]{
            0
        },0);
        test(new Integer[]{
            0
        },1);
        test(new Integer[]{
            0,1,2,3
        },0);
        test(new Integer[]{
            0,1,2,3
        },3);
        test(new Integer[]{
            0,1,2,3
        },2);
        test(new Integer[]{
            0,1,1,3
        },1);
        test(new Integer[]{
            0,1,2,3
        },4);
    }
}
