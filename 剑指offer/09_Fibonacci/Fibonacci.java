import java.util.*;
public class Fibonacci {
    public static int solution1(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return solution1(n - 1) + solution1(n - 2);
    }
    public static int solution2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int f1 = 0, f2 = 1;
        int theNthValue = f1 + f2;
        for (int i = 2; i <= n; i++) {
            theNthValue = f1 + f2;
            f1 = f2; f2 = theNthValue;
        }
        return theNthValue;
    }
    public static void test(int n, int expected) {
        if (solution1(n) == expected) {
            System.out.println("Test for "+ n + " in solution1 : PASSED!");
        } else {
            System.out.println("Test for "+ n + " in solution1 : FAILED!");           
        }
        if (solution2(n) == expected) {
            System.out.println("Test for "+ n + " in solution2 : PASSED!");
        } else {
            System.out.println("Test for "+ n + " in solution2 : FAILED!");           
        }
    }
    public static void main(String[] args) {
    test(0, 0);
    test(1, 1);
    test(2, 1);
    test(3, 2);
    test(4, 3);
    test(5, 5);
    test(6, 8);
    test(7, 13);
    test(8, 21);
    test(9, 34);
    test(10, 55);

    test(40, 102334155);    }
}
