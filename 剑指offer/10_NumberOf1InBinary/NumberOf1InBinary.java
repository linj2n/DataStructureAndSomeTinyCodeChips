import java.util.*;
public class NumberOf1InBinary {
    public static int Solution1(int n) {
       int count = 0, flag = 1;
       while (flag != 0) {
           if ((n & flag) != 0) count ++;
           flag = flag << 1;
       }
       return count;
    } 
    public static int Solution2(int n) {
        int count = 0;
        while (n != 0) {
            ++ count;
            n = n & (n - 1);
        }
        return count;
    }
    public static void test(int n,int expected) {
        // test solution1 
        if (Solution1(n) == expected) { 
            System.out.println("Solution1: Test for " + n + " PASSED!");
        } else { 
            System.out.println("Solution1: Test for " + n + " FAILED!");
        }
        if (Solution2(n) == expected) { 
            System.out.println("Solution2: Test for " + n + " PASSED!");
        } else { 
            System.out.println("Solution2: Test for " + n + " FAILED!");
        }
    }
    public static void main(String[] args) {
    // 输入0，期待的输出是0
    test(0, 0);

    // 输入1，期待的输出是1
    test(1, 1);

    // 输入10，期待的输出是2
    test(10, 2);

    // 输入0x7FFFFFFF，期待的输出是31
    test(0x7FFFFFFF, 31);

    // 输入0xFFFFFFFF（负数），期待的输出是32
    test(0xFFFFFFFF, 32);

    // 输入0x80000000（负数），期待的输出是1
    test(0x80000000, 1);
    }
}
